package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class OptyDetailsPage extends BasePage {

	public OptyDetailsPage(WebDriver driver) {
		super(driver);
		
		addElement("pagedescription", By.className("pageDescription"));
		addElement("updatedoptyname", By.id("opp3_ileinner"));
		addElement("updatedoptyaccname", By.xpath("//div[@id='opp4_ileinner']/a"));
		
	}

}
