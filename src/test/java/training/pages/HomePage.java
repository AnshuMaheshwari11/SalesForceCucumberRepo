package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
		addElement("usermenu", By.id("userNavButton"));
		addElement("usermenulabel", By.id("userNavLabel"));
		addElement("usermenulist", By.xpath("//div[@id='userNav-menuItems']/a"));
		addElement("myprofile", By.xpath("//a[text()='My Profile']"));
		addElement("mysettings", By.xpath("//a[text()='My Settings']"));
		addElement("developerconsole", By.xpath("//a[text()='Developer Console']"));
		addElement("logout", By.xpath("//a[text()='Logout']"));
		addElement("pagename", By.xpath("//a[@class='brandPrimaryFgr']"));
		addElement("appmenu", By.id("tsidButton"));
		addElement("salesforcechatter", By.xpath("//a[text()='Salesforce Chatter']"));
		addElement("sales", By.xpath("//a[text()='Sales']"));
		addElement("Content", By.xpath("//a[text()='Content']"));
		addElement("marketing", By.xpath("//a[text()='Marketing CRM Classic']"));
		addElement("tabbarmenulist", By.xpath("//ul[@id='tabBar']/li/a"));
		addElement("home", By.xpath("//li[@id='home_Tab']/a"));
		addElement("accounts", By.xpath("//li[@id='Account_Tab']/a"));
		addElement("opportunities", By.xpath("//li[@id='Opportunity_Tab']/a"));
		addElement("leads", By.xpath("//li[@id='Lead_Tab']/a"));
		addElement("contacts", By.xpath("//li[@id='Contact_Tab']/a"));
		addElement("plusicon", By.xpath("//li[@id='AllTab_Tab']/a"));
		addElement("currentusername", By.xpath("//h1[@class='currentStatusUserName']/a"));
		addElement("currentdate", By.xpath("//span[@class='pageDescription']/a"));
		
	}
	
}
