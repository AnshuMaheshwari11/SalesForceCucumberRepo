package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class ContactsDetailsPage extends BasePage {

	public ContactsDetailsPage(WebDriver driver) {
		super(driver);
		
		addElement("pagedescription", By.className("pageDescription"));
		addElement("updatedcontactname", By.id("con2_ileinner"));
		addElement("updatedcontactaccname", By.xpath("//div[@id='con4_ileinner']/a"));
		
	}

}
