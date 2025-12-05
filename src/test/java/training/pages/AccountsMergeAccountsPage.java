package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class AccountsMergeAccountsPage extends BasePage {

	public AccountsMergeAccountsPage(WebDriver driver) {
		super(driver);
		
		addElement("pagetype", By.xpath("//h1[@class='noSecondHeader pageType']"));
		addElement("searchtexttomerge", By.id("srch"));
		addElement("findaccounts", By.name("srchbutton"));
		addElement("listheader", By.xpath("//tr[@class='headerRow']/th"));
		addElement("accountsid1", By.id("cid0"));
		addElement("accountsid2", By.id("cid1"));
		addElement("accountsid3", By.id("cid2"));
		addElement("mergeaccountname", By.xpath("//table[@class='mergeEntity']/tbody/tr[4]/td[1]"));
		addElement("next", By.name("goNext"));
		addElement("save", By.name("save"));
		
	}

}
