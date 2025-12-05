package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class LeadsEditPage extends BasePage {

	public LeadsEditPage(WebDriver driver) {
		super(driver);
		
		addElement("pagedescription", By.className("pageDescription"));
		addElement("leadlastname", By.id("name_lastlea2"));
		addElement("leadcompanyname", By.id("lea3"));
		addElement("save", By.name("save"));
	}
	

}
