package training.uilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public String getProperty(String key) {
		
		Properties prop = new Properties();
		
		//String workingdir = System.getProperty("user.dir");
		String filepath = "properties/application.properties";
		
		try(FileInputStream fileinputstream = new FileInputStream(filepath)) {
			prop.load(fileinputstream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}

	public void setProperty(String key, String value) {
		
		Properties prop = new Properties();
		
		//String workingdir = System.getProperty("user.dir");
		String filepath = "properties/application.properties";
		
		try(FileInputStream fileinputstream = new FileInputStream(filepath)) {
			prop.load(fileinputstream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		prop.setProperty(key, value);
		try(FileOutputStream fileoutputstream = new FileOutputStream(filepath)) {
			prop.store(fileoutputstream, "Updated properties file");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
