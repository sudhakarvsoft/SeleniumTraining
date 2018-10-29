package com.wd.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wd.config.BrowserConfig;
import com.wd.util.DriverFactory;

public class Wd15WorkingWithFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = DriverFactory.getDriverFor(BrowserConfig.testBrowser);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.redbus.in/");

		driver.findElement(By.id("signin-block")).click();
		driver.findElement(By.id("signInLink")).click();
		
		WebElement frm = driver.findElement(By.className("modalIframe"));
		driver.switchTo().frame(frm); //frame scope
		
		driver.findElement(By.id("mobileNoInp")).sendKeys("9876543210");
		
		driver.switchTo().defaultContent(); //main page scope
		
		
	}

}
