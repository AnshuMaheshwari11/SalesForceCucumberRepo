package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class ContactsEditPage extends BasePage {

	public ContactsEditPage(WebDriver driver) {
		super(driver);
		
		addElement("pagedescription", By.className("pageDescription"));
		addElement("contactlastname", By.id("name_lastcon2"));
		addElement("contactaccname", By.id("con4"));
		addElement("save", By.name("save"));
		
	}
	
}
