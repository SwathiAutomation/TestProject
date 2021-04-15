package com.adactin.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.adactin.pageObjects.TestBase;

public class BrowserUtils extends PropertyUtils{
	public static String browser;
	public static WebDriver driver;

	public static PropertyUtils propertyUtils;
	public static String path;
	public static void openBrowser() throws Exception
	{
		propertyUtils.initProperties();
		browser= propertyUtils.browserName;
		System.out.println("Browser-----"+browser);
		path=System.getProperty("user.dir");
		if(browser.equalsIgnoreCase("firefox")){
			//create firefox instance
				System.setProperty("webdriver.gecko.driver", path + "\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			//Check if parameter passed as 'chrome'
			else if(browser.equalsIgnoreCase("chrome")){
				//set path to chromedriver.exe
				System.setProperty("webdriver.chrome.driver",path + "\\Driver\\chromedriver.exe");
				//create chrome instance
				driver = new ChromeDriver();
				System.out.println("Driver launched successfully");
			}
			//Check if parameter passed as 'Edge'
					else if(browser.equalsIgnoreCase("Edge")){
						//set path to Edge.exe
						System.setProperty("webdriver.edge.driver",".\\MicrosoftWebDriver.exe");
						//create Edge instance
						driver = new EdgeDriver();
					}
			else{
				//If no browser passed throw exception
				throw new Exception("Browser is not correct");
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} 
	
	}

