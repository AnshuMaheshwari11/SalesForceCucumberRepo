package training.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import training.uilities.PropertiesFile;

public class BaseTest {

	static WebDriver driver;
	protected BasePage page;
	
	public void launchApplication() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		PropertiesFile propertiesfile = new PropertiesFile();
		String url = propertiesfile.getProperty("url");
		driver.get(url);
	}
	
	public void secureLaunch() {
		if(driver == null) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String name = "https://orgfarm-ee175d71bf-dev-ed.develop.my.salesforce.com";
		String sid = "00Dg5000000BfBC!AQEAQCdBt1ti5KDr3FJWMWvJeS5RsTBdhGIoSkjobhZTaICjmSOFw8IE6xUOCT5T9Q8hMaK1lhiDF4iu6bVI9.ouFzFS0kw8";
		String url = name + "/secur/frontdoor.jsp?sid=" + sid;
		driver.get(url);
		}
	}
	
	public void createPageInstance(String pagename) {
		
		String packagepath = "training.pages";
		String fullpath = packagepath + "." + pagename;
		try {
			page = (BasePage) Class.forName(fullpath).getDeclaredConstructor(WebDriver.class).newInstance(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public void closeApplication() {
		driver.close();
		driver = null;
	}
	
}
