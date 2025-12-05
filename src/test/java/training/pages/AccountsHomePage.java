package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class AccountsHomePage extends BasePage {

	public AccountsHomePage(WebDriver driver) {
		super(driver);
		
		addElement("pagetype", By.className("pageType"));
		addElement("new", By.name("new"));
		addElement("createnewview", By.xpath("//a[text()='Create New View']"));
		addElement("edit", By.xpath("//a[text()='Edit']"));
		addElement("accountviewdropdown", By.name("fcf"));
		addElement("go", By.name("go"));
		addElement("lastactivityreport", By.xpath("//a[text()='Accounts with last activity > 30 days']"));
		addElement("mergeaccounts", By.xpath("//a[text()='Merge Accounts']"));
		addElement("firstrecentaccountname", By.xpath("//table[@class='list']/tbody/tr[2]/th/a"));
		
	}
	
}