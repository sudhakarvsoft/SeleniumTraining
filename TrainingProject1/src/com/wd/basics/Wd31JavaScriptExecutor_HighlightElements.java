package com.wd.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wd.config.BrowserConfig;
import com.wd.util.DriverFactory;

public class Wd31JavaScriptExecutor_HighlightElements {

	public static void main(String[] args) {

		WebDriver driver = DriverFactory.getDriverFor(BrowserConfig.testBrowser);
		driver.get(BrowserConfig.testUrl);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement elmUserName = driver.findElement(By.id("user_name"));
		
		js.executeScript("arguments[0].style.border='5px dotted red';", elmUserName);
		
	}

}
