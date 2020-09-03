package commonfunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class CommonFunctions {

	public static Properties properties=null;
	public static WebDriver driver=null;

	
	public Properties loadPropertyFile() throws IOException
	{
		FileInputStream fileinputstream=new FileInputStream("Config.properties");
		properties=new Properties();
		properties.load(fileinputstream);
		return properties;

	}


	@BeforeSuite
	public void launchBrowser() throws IOException
	{

		//call the above method to load the config file to launch the browser
		loadPropertyFile();
		//get the values from config.properties file
		String URL=properties.getProperty("URL");
		String driverlocation=properties.getProperty("driverlocation");
		String browser=properties.getProperty("browser");

		//set the driver and driver location

		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", driverlocation);
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", driverlocation);
			driver=new FirefoxDriver();
		}

		driver.get(URL);

	}
	/*
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

*/



}


