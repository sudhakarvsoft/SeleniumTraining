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

public class Wd14WorkingWithCalendars_Advanced {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = DriverFactory.getDriverFor(BrowserConfig.testBrowser);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.redbus.in/");

		driver.findElement(By.xpath("//label[@for='onward_cal']")).click();

		boolean monthFound = false;
		while (!monthFound) {
			String monthTitle = driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']//td[@class='monthTitle']")).getText();
			if (monthTitle.trim().startsWith("Dec")) {
				driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']//td[text()='20']")).click();
				monthFound = true;
			} else {
				driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']//td[@class='next']/button")).click();
			}
		}
	}

}
