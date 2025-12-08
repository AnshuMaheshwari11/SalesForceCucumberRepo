package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class CalenderNewEventPage extends BasePage {

	public CalenderNewEventPage(WebDriver driver) {
		super(driver);
		
		addElement("pagedescription", By.className("pageDescription"));
		addElement("subjectsearchicon", By.xpath("//input[@id='evt5']/following-sibling::a[1]"));
		addElement("subjectlist", By.xpath("//li/a"));
		addElement("endtime", By.id("EndDateTime_time"));
		addElement("timepickerlist", By.xpath("//div[@id='simpleTimePicker']/div"));
		addElement("isreccurance", By.id("IsRecurrence"));
		addElement("recurweekly", By.id("rectypeftw"));
		addElement("weeklyoccurance", By.id("wi"));
		addElement("weekdayslist", By.xpath("//div[@id='w']/div[2]/input"));
		
		addElement("recurenddate", By.id("RecurrenceEndDateOnly"));
		addElement("monthdropdown", By.id("calMonthPicker"));
		addElement("yeardropdown", By.id("calYearPicker"));
		addElement("caldateslist", By.xpath("//tr[@class='calRow']/td"));
		addElement("reminder", By.name("IsReminderSet"));
		addElement("save", By.name("save"));
		
	}
	
	
}