package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class UserSettingsPage extends BasePage{

	public UserSettingsPage(WebDriver driver) {
		super(driver);
		
		addElement("personal", By.id("PersonalInfo_font"));
		addElement("loginhistory", By.id("LoginHistory_font"));
		addElement("downloadhistory", By.xpath("//a[contains(text(),'Download login history')]"));
		addElement("displayandlayout", By.id("DisplayAndLayout_font"));
		addElement("customizemytabs", By.id("CustomizeTabs_font"));
		addElement("pagename", By.xpath("//a[@id='PersonalSetup_font']/span[2]"));
		addElement("pagetype", By.xpath("//h1[@class='noSecondHeader pageType']"));
		addElement("customappdropdown", By.id("p4"));
		addElement("availabletabdropdown", By.id("duel_select_0"));
		addElement("add", By.id("duel_select_0_right"));
		addElement("selectedtabdropdown", By.id("duel_select_1"));
		addElement("remove", By.id("duel_select_0_left"));
		addElement("save", By.name("save"));
		
	}
	
}
