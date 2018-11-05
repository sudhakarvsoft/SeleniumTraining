package com.wd.loc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wd.config.BrowserConfig;
import com.wd.util.DriverFactory;

public class LssLoginLoc {

	public static void main(String[] args) {

		WebDriver driver = DriverFactory.getDriverFor(BrowserConfig.testBrowser);
		driver.get(BrowserConfig.testUrl);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(LssLocators.txt_LoginPage_UserName).sendKeys("As05744");
		driver.findElement(LssLocators.txt_LoginPage_Password).sendKeys("asdf");
		driver.findElement(LssLocators.btn_LoginPage_Login).click();
		
	}

}
