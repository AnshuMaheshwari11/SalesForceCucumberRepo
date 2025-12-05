package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class LeadsViewPage extends BasePage {

	public LeadsViewPage(WebDriver driver) {
		super(driver);
		
		addElement("leadsviewdropdown", By.name("fcf"));
	}

}
