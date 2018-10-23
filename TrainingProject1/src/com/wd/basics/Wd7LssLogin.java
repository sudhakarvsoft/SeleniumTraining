package com.wd.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wd.config.BrowserConfig;
import com.wd.util.DriverFactory;

public class Wd7LssLogin {

	public static void main(String[] args) {

		WebDriver driver = DriverFactory.getDriverFor(BrowserConfig.testBrowser);
		driver.get(BrowserConfig.testUrl);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("user_name")).sendKeys("As05744");
		driver.findElement(By.name("user_password")).sendKeys("asdf");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		System.out.println(driver.findElement(By.className("outputmsg_error")).getText());
	}

}
