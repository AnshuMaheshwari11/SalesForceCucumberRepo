package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class AccountsDetailsPage extends BasePage {

	public AccountsDetailsPage(WebDriver driver) {
		super(driver);
		
		addElement("pagedescription", By.xpath("//h2[@class='pageDescription']"));
		addElement("updatedaccountname", By.id("acc2_ileinner"));
		addElement("updatedaccounttype", By.id("acc6_ileinner"));
		addElement("updatedcustpriority", By.id("00Ng5000000HQe2_ileinner"));
		
	}

}
