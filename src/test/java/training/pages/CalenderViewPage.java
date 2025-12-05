package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class CalenderViewPage extends BasePage {

	public CalenderViewPage(WebDriver driver) {
		super(driver);
		
		addElement("pagetype", By.className("pageType"));
		addElement("hourlist", By.xpath("//div[contains(@class,'hourRowLabel timeCellDnD evenHour')]/a"));
		addElement("eventblocklist", By.xpath("//div[contains(@class, 'hourRowDnD even')]"));
		addElement("monthview", By.xpath("//span[@class='dwmIcons']/a[3]"));
		addElement("caltoday", By.xpath("//td[@class='calToday']/div[2]/a"));
		
	}
	
}