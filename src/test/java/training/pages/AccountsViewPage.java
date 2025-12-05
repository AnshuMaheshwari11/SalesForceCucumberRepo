package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import training.base.BasePage;

public class AccountsViewPage extends BasePage {

	public AccountsViewPage(WebDriver driver) {
		super(driver);
		
		addElement("accountviewdropdown", By.name("fcf"));
		addElement("contactslist", By.className("x-grid3-row-table"));
		addElement("viewcolumnlist", By.xpath("//tr[@class='x-grid3-hd-row']/td/div"));
		addElement("accountnamelist", By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-Name']/a/span"));
		
	}
	
	
}
