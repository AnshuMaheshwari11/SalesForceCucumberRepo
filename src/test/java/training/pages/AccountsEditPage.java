package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class AccountsEditPage extends BasePage {

	public AccountsEditPage(WebDriver driver) {
		super(driver);
		
		addElement("pagedescription", By.xpath("//h2[@class='pageDescription']"));
		addElement("accountname", By.id("acc2"));
		addElement("accounttypedropdown", By.id("acc6"));
		addElement("custprioritydropdown", By.id("00Ng5000000HQe2"));
		addElement("save", By.name("save"));
		
	}

}
