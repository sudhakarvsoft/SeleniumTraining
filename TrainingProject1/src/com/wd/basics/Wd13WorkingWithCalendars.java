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

public class Wd13WorkingWithCalendars {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = DriverFactory.getDriverFor(BrowserConfig.testBrowser);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://apsrtconline.in/oprs-web/services/cancel.do");
	
		driver.findElement(By.id("txtJourneyDate")).click();
		
		WebElement elmYear = driver.findElement(By.className("ui-datepicker-year"));
		new Select(elmYear).selectByVisibleText("2017");
		
		WebElement elmMonth = driver.findElement(By.className("ui-datepicker-month"));
		new Select(elmMonth).selectByVisibleText("Jul");
		driver.findElement(By.linkText("12")).click();
		
	}

}
