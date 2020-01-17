package com.abhishek.frameworkUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoreUtils {
public static RemoteWebDriver driver;
public  PropertiesReader config = new PropertiesReader(FrameworkParameters.configFilePath); 
private WebDriverWait wait = new WebDriverWait(driver, 60);

public void launchApplication(String url) {
	driver.get(config.getData("Url"));
}

public void waitForPresenceOfElement(By by) {
	wait.until(ExpectedConditions.presenceOfElementLocated(by));
}
public void waitForElementToBeClickable(By by) {
	wait.until(ExpectedConditions.elementToBeClickable(by));
}

public WebElement findElement(By by) {
	waitForPresenceOfElement(by);
	return driver.findElement(by);
}
public void clickElement(By element) {
	waitForElementToBeClickable(element);
	driver.findElement(element).click();
}
public void typeText(By element , String text) {
	waitForPresenceOfElement(element);
	driver.findElement(element).sendKeys(text);
}
}
