package com.abhishek.frameworkUtils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverScript extends CoreUtils{
	public static  PropertiesReader config = new PropertiesReader(FrameworkParameters.configFilePath);
	public  static void launchBrowser(){
		if(config.getData("BrowserName").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\java\\seleniumDrivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			driver =new ChromeDriver(options);
			//return new ChromeDriver(options);
			
		}
		
		
	}
	
	

}
