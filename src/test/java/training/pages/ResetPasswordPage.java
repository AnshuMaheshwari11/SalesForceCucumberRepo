package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class ResetPasswordPage extends BasePage{

	public ResetPasswordPage(WebDriver driver){
		super(driver);
		
		addElement("username", By.id("un"));
		addElement("continue", By.id("continue"));
		addElement("header", By.id("header"));
	}

}
