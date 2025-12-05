package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class ContactsViewPage extends BasePage {

	public ContactsViewPage(WebDriver driver) {
		super(driver);
		
		addElement("contactsviewdropdown", By.name("fcf"));
		addElement("contactslist", By.className("x-grid3-row-table"));
		
	}
	
}
