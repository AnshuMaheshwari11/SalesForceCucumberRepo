package training.base;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import training.uilities.PropertiesFile;

public class BasePage {

	WebDriver driver;
	Actions action;
	PropertiesFile propertiesfile;
	
	HashMap<String, By> objectrepo = new HashMap<String, By>();
	
	protected BasePage(WebDriver driver){
		this.driver = driver;
		action = new Actions(driver);
		propertiesfile = new PropertiesFile();
	}
	
	protected void addElement(String elementname, By locator) {
		objectrepo.put(elementname, locator);
	}
	
	public void waitForPageToLoad() {
        WebDriverWait wait = new WebDriverWait(driver, 30); 
        wait.until((ExpectedCondition<Boolean>) wd ->((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));

    }
	
	public void waitFor(long timeinmillis) {
		try {
			Thread.sleep(timeinmillis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void waitForElementToLocate(By locator, int timeinseconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeinseconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	private void waitForElementToClickable(WebElement element, int timeinseconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeinseconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	private void waitForNumberOfWindowsToBe(int numberofwindows, int timeinseconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeinseconds);
		wait.until(ExpectedConditions.numberOfWindowsToBe(numberofwindows));
	}
	
	private void waitForFrameToBeAvailableAndSwitch(By locator, int timeinseconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeinseconds);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	}
	
	
	public void switchToFrame(String elementname) {
		waitForFrameToBeAvailableAndSwitch(objectrepo.get(elementname),10);
	}
	
	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}
	
	private WebElement getElement(String elementname) {
		By locator = objectrepo.get(elementname);
		waitForElementToLocate(locator, 20);
		return driver.findElement(locator);
	}
	
	private List<WebElement> getElements(String elementname) {
		By locator = objectrepo.get(elementname);
		waitForElementToLocate(locator, 15);
		return driver.findElements(locator);
	}
	
	public void clearTextbox(String elementname) {
		getElement(elementname).clear();
	}
	
	public void enterIntoTextBox(String elementname, String inputvalue) {
		WebElement element = getElement(elementname);
		element.sendKeys(inputvalue);
	}
	
	public void readAndEnterIntoTextBox(String elementname) {
		String inputvalue = propertiesfile.getProperty(elementname);
		getElement(elementname).sendKeys(inputvalue);
	}
	
	public void readAndEnterIntoTextBox(String elementname, String newkey) {
		String inputvalue = propertiesfile.getProperty(newkey);
		getElement(elementname).sendKeys(inputvalue);
	}
	
	public void readAndUploadFile(String elementname) {
		String relativepath = propertiesfile.getProperty(elementname);
		File file = new File(relativepath);
		getElement(elementname).sendKeys(file.getAbsolutePath());
		
	}
	public void readAndSelectFromDropdown(String elementname, String key) {
		String inputvalue = propertiesfile.getProperty(key);
		Select dropdown = new Select(getElement(elementname));
		for(WebElement option : dropdown.getOptions()) {
			if(option.getText().equalsIgnoreCase(inputvalue)) {
				dropdown.selectByVisibleText(option.getText());
				break;
			}
		}
	}
	
	public void readAndSelectFromDropdownByValue(String elementname, String key) {
		String inputvalue = propertiesfile.getProperty(key);
		Select dropdown = new Select(getElement(elementname));
		for(WebElement option : dropdown.getOptions()) {
			if(option.getAttribute("value").equalsIgnoreCase(inputvalue)) {
				dropdown.selectByValue(option.getAttribute("value"));
				break;
			}
		}
	}
	
	public void storeData(String elementname) {
		String value = getElement(elementname).getText();
		propertiesfile.setProperty(elementname, value);	
	}

	public void readAndClickTheListItem(String elementname, String key) {
		String inputvalue = propertiesfile.getProperty(key);
		for(WebElement item : getElements(elementname)) {
			if(item.getText().equalsIgnoreCase(inputvalue)) {
				item.click();
				break;
			}
		}
		
	}
	public void clickOn(String elementname) {
		WebElement element = getElement(elementname);
		waitForElementToClickable(element,20);
		element.click();
	}

	public boolean isSelected(String elementname) {
		return getElement(elementname).isSelected();
	}

	public void HoverOn(String elementname) {
		action.moveToElement(getElement(elementname)).build().perform();
	}

	public void holdAndMove(String elementname , String xoffset, String yoffset) {
		int xvalue = Integer.parseInt(propertiesfile.getProperty(xoffset));
		int yvalue = Integer.parseInt(propertiesfile.getProperty(yoffset));
		action.clickAndHold(getElement(elementname)).moveByOffset(xvalue,yvalue).release().build().perform();
	}
	
	public void closeNewWindow() {
		String parent = driver.getWindowHandle();
		waitForNumberOfWindowsToBe(2, 20);
		for(String windowhndl : driver.getWindowHandles()) {
			if(!windowhndl.equals(parent))
				driver.switchTo().window(windowhndl);
		}
		driver.close();
		driver.switchTo().window(parent);
	}

	public void acceptPopUpAlert() {
		driver.switchTo().alert().accept();
	}

	//Verification Section
	
	public void verifyText(String elementname, String expectedvalue) {
		waitForElementToLocate(objectrepo.get(elementname), 10);
		String actualvalue = getElement(elementname).getText();
		Assert.assertEquals(actualvalue, expectedvalue);
	}
	
	public void verifyTextContains(String elementname, String expectedvalue) {
		String actualvalue = getElement(elementname).getText();
		boolean result = actualvalue.contains(expectedvalue);
		Assert.assertEquals(result, true);
	}
	
	public void verifyData(String elementname, String expectedkey) {
		String expectedvalue = propertiesfile.getProperty(expectedkey);
		String actualvalue = getElement(elementname).getText().stripLeading();
		Assert.assertEquals(actualvalue, expectedvalue);
	}

	public void verifyDataContains(String elementname, String expectedkey) {
		String expectedvalue = propertiesfile.getProperty(expectedkey);
		String actualvalue = getElement(elementname).getText();
		boolean result = actualvalue.contains(expectedvalue);
		Assert.assertEquals(result, true);
	}

	public void verifyListItem(String elementname, String expectedkey) {
		String expectedvalue = propertiesfile.getProperty(expectedkey);
		boolean result = false;
		for(WebElement option : getElements(elementname)) {
			if(option.getText().equalsIgnoreCase(expectedvalue)) {
				result = true;
				break;
			}	
		}
		Assert.assertEquals(result, true);	
	}
	
	public void verifyAllListItems(String elementname, List<String> expectedvalues) {
		List<String> actualvalues = new ArrayList<>();
		for(WebElement item : getElements(elementname))
			actualvalues.add(item.getText());
		Assert.assertEquals(actualvalues, expectedvalues);
	}

	public void verifyItemNotInList(String elementname, String expectedkey) {
		String expectedvalue = propertiesfile.getProperty(expectedkey);
		boolean result = true;
		for(WebElement option : getElements(elementname)) {
			if(option.getText().equalsIgnoreCase(expectedvalue)) {
				result = false;
				break;
			}	
		}
		Assert.assertEquals(result, true);
		
	}
	
	
	public void verifyDropdownItem(String elementname, String expectedkey) {
		String expectedvalue = propertiesfile.getProperty(expectedkey);
		boolean result = false;
		Select dropdown = new Select(getElement(elementname));
		for(WebElement option : dropdown.getOptions()) {
			if(option.getText().equalsIgnoreCase(expectedvalue)) {
				result = true;
				break;
			}	
		}
		Assert.assertEquals(result, true);	
	}
	
	public void verifyFirstSelectedDropdownItem(String elementname, String expectedkey) {
		String expectedvalue = propertiesfile.getProperty(expectedkey);
		Select dropdown = new Select(getElement(elementname));
		String actualvalue = dropdown.getFirstSelectedOption().getText();
		Assert.assertEquals(actualvalue, expectedvalue);	
	}
	
	public void verifyFirstSelectedDropdownItemByValue(String elementname, String expectedkey) {
		String expectedvalue = propertiesfile.getProperty(expectedkey);
		Select dropdown = new Select(getElement(elementname));
		String actualvalue = dropdown.getFirstSelectedOption().getAttribute("value");
		Assert.assertEquals(actualvalue, expectedvalue);	
	}
	
	public void verifyAllDropdownItems(String elementname, List<String> expectedvalues) {
		List<String> actualvalues = new ArrayList<>();
		Select dropdown = new Select(getElement(elementname));
		for(WebElement option : dropdown.getOptions())
			actualvalues.add(option.getText());
		Assert.assertEquals(actualvalues, expectedvalues);
	}

	public void verifyItemNotInDropDown(String elementname, String expectedvalue) {
		boolean result = true;
		Select dropdown = new Select(getElement(elementname));
		for(WebElement option : dropdown.getOptions()) {
			if(option.getText().equalsIgnoreCase(expectedvalue)) {
				result = false;
				break;
			}	
		}
		Assert.assertEquals(result, true);
	}
	
	public void verifyIsDisplayed(String elementname) {
		boolean isdisplayed = getElement(elementname).isDisplayed();
		Assert.assertEquals(isdisplayed, true);
	}

	public void verifyIsSelected(String elementname) {
		Assert.assertEquals(getElement(elementname).isSelected(), true);
	}

	public void verifyListIsNotEmpty(String elementname) {
		Assert.assertEquals(getElements(elementname).isEmpty(), false);
	}
	
	public void verifyNewWindow(String expectedvalue) {
		String parent = driver.getWindowHandle();
		waitForNumberOfWindowsToBe(2, 20);
		for(String windowhndl : driver.getWindowHandles()) {
			if(!windowhndl.equals(parent))
				driver.switchTo().window(windowhndl);
		}
		String actualvalue = driver.getTitle();
		driver.switchTo().window(parent);
		
		Assert.assertEquals(actualvalue, expectedvalue);
	}

}
