package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class LeadsHomePage extends BasePage {

	public LeadsHomePage(WebDriver driver) {
		super(driver);
		
		addElement("pagetype", By.className("pageType"));
		addElement("new", By.name("new"));
		addElement("createnewview", By.xpath("//a[text()='Create New View']"));
		addElement("leadsviewdropdown", By.name("fcf"));
		addElement("leadviewlist", By.xpath("//select[@id='fcf']/option"));
		addElement("go", By.name("go"));
	}

}
