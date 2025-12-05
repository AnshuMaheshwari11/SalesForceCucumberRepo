package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class ContactsCreateViewPage extends BasePage {

	public ContactsCreateViewPage(WebDriver driver) {
		super(driver);
		
		addElement("pagedescription", By.xpath("//h2[@class='pageDescription']"));
		addElement("contactsviewname", By.id("fname"));
		addElement("contactsviewuniqname", By.id("devname"));
		addElement("save", By.name("save"));
		addElement("cancel", By.name("cancel"));
		addElement("errormsg", By.xpath("//input[@id='fname']/following-sibling::div"));
		
	}
	
}
