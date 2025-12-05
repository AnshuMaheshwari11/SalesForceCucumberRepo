package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class AccountsSavedReportPage extends BasePage {

	public AccountsSavedReportPage(WebDriver driver) {
		super(driver);
		
		addElement("pagetype", By.xpath("//h1[@class='noSecondHeader pageType']"));
		addElement("popupclose", By.xpath("//a[text()='Close']"));
		
	}

}
