package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class OptyEditPage extends BasePage {

	public OptyEditPage(WebDriver driver) {
		super(driver);
		
		addElement("pagedescription", By.className("pageDescription"));
		addElement("optyname", By.id("opp3"));
		addElement("optyaccname", By.id("opp4"));
		addElement("leadsource", By.id("opp6"));
		addElement("closedate", By.id("opp9"));
		addElement("calToday", By.className("calToday"));
		addElement("stagedropdown", By.id("opp11"));
		addElement("probability", By.id("opp12"));
		addElement("campaignsrc", By.id("opp17"));
		addElement("save", By.name("save"));
	}

}
