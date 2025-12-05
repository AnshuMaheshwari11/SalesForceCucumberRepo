package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class OptyHomePage extends BasePage {

	public OptyHomePage(WebDriver driver) {
		super(driver);
		
		addElement("pagetype", By.className("pageType"));
		addElement("new", By.name("new"));
		addElement("optyviewdropdown", By.name("fcf"));
		addElement("createnewview", By.xpath("//a[text()='Create New View']"));
		addElement("optypipeline", By.xpath("//a[text()='Opportunity Pipeline']"));
		addElement("stuckopportunities", By.xpath("//a[text()='Stuck Opportunities']"));
		addElement("intervaldropdown", By.id("quarter_q"));
		addElement("includedropdown", By.id("open"));
		addElement("run", By.xpath("//input[@value='Run Report']"));
		
	}
	
}
