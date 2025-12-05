package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class VerifyIdentityPage extends BasePage{

	public VerifyIdentityPage(WebDriver driver){
		super(driver);
		
		addElement("code", By.id("emc"));
		addElement("verify", By.id("save"));
	}
}