package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class ContactsHomePage extends BasePage {

	public ContactsHomePage(WebDriver driver) {
		super(driver);
		
		addElement("pagetype", By.className("pageType"));
		addElement("new", By.name("new"));
		addElement("createnewview", By.xpath("//a[text()='Create New View']"));
		addElement("recentdisplaydropdown", By.id("hotlist_mode"));
		addElement("recentcontactslist", By.xpath("//table[@class='list']/tbody/tr/th/a"));
		addElement("contactsviewdropdown", By.name("fcf"));
		addElement("go", By.name("go"));
		
	}
	
}