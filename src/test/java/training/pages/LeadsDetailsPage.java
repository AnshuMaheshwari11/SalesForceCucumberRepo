package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class LeadsDetailsPage extends BasePage {

	public LeadsDetailsPage(WebDriver driver) {
		super(driver);
		
		addElement("pagedescription", By.className("pageDescription"));
		addElement("updatedleadname", By.id("lea2_ileinner"));
		addElement("updatedleadcompanyname", By.id("lea3_ileinner"));
		
	}

}
