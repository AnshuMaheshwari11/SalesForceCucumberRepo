package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class AccountsCreateOrEditViewPage extends BasePage {

	public AccountsCreateOrEditViewPage(WebDriver driver) {
		super(driver);
		
		addElement("pagedescription", By.xpath("//h2[@class='pageDescription']"));
		addElement("accountsviewname", By.id("fname"));
		addElement("accountsviewuniqname", By.id("devname"));
		addElement("filterfielddropdown", By.id("fcol1"));
		addElement("filteroperatordropdown", By.id("fop1"));
		addElement("filtervalue", By.id("fval1"));
		addElement("availablefielddropdown", By.id("colselector_select_0"));
		addElement("add", By.id("colselector_select_0_right"));
		addElement("save", By.name("save"));
		
	}
	
}
