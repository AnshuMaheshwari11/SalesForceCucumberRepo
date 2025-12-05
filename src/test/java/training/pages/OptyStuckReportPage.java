package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class OptyStuckReportPage extends BasePage {

	public OptyStuckReportPage(WebDriver driver) {
		super(driver);
		
		addElement("pagetype", By.xpath("//h1[@class='noSecondHeader pageType']"));
		
	}

}
