package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import training.base.BasePage;

public class AccountsUnSavedReportPage extends BasePage {

	public AccountsUnSavedReportPage(WebDriver driver) {
		super(driver);
		
		addElement("pagedescription", By.className("pageDescription"));
		addElement("datefield", By.id("ext-gen20"));
		addElement("createddate", By.xpath("//div[text()='Created Date']"));
		addElement("fromedate", By.name("startDate"));
		addElement("fromdateicon", By.xpath("//input[@name='startDate']/following-sibling::img"));
		addElement("fromdatetoday", By.xpath("//li[@id='x-menu-el-ext-comp-1044']//button[text()='Today']"));
		addElement("todate", By.name("endDate"));
		addElement("todateicon", By.xpath("//input[@name='endDate']/following-sibling::img"));
		addElement("todatetoday", By.xpath("//li[@id='x-menu-el-ext-comp-1047']//button[text()='Today']"));
		addElement("grandtotal", By.xpath("//div[contains(@class,'x-grid3-row rb-count-row')]//b"));
		addElement("modifieddatelist", By.xpath("//div[contains(@class,'x-grid3-col-LAST_UPDATE')]"));
		addElement("save", By.xpath("//button[text()='Save']"));
		addElement("reportname", By.name("reportName"));
		addElement("reportuniqname", By.name("reportDevName"));
		addElement("saveandrun", By.xpath("//button[(text()='Save and Run Report')]"));
		
	}

}
