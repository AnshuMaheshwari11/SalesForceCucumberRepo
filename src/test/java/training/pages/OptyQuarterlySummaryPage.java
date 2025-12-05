package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class OptyQuarterlySummaryPage extends BasePage {

	public OptyQuarterlySummaryPage(WebDriver driver) {
		super(driver);
		
		addElement("pagetype", By.xpath("//h1[@class='noSecondHeader pageType']"));
		addElement("rangedropdown", By.id("quarter_q"));
		addElement("statusdropdown", By.id("open"));
		
	}

}
