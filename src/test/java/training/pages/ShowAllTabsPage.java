package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class ShowAllTabsPage extends BasePage {

	public ShowAllTabsPage(WebDriver driver) {
		super(driver);
		
		addElement("pagetype", By.className("noSecondHeader pageType"));
		addElement("customizemytabs", By.name("customize"));
		
	}
	
}
