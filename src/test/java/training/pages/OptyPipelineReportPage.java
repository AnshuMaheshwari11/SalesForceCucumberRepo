package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class OptyPipelineReportPage extends BasePage {

	public OptyPipelineReportPage(WebDriver driver) {
		super(driver);
		
		addElement("pagetype", By.xpath("//h1[@class='noSecondHeader pageType']"));
		
	}

}
