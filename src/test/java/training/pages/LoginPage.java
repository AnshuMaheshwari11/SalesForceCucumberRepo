package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver){
		super(driver);
		
		addElement("username", By.id("username"));
		addElement("password", By.id("password"));
		addElement("login", By.id("Login"));
		addElement("rememberme", By.id("rememberUn"));
		addElement("forgotpwd", By.id("forgot_password_link"));
		addElement("errormsg", By.id("error"));
		addElement("usernameid", By.id("idcard-identity"));
		addElement("loginform", By.id("theloginform"));
		
	}

}
