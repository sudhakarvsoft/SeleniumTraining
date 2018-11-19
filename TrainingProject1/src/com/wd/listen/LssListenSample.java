package com.wd.listen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.wd.config.BrowserConfig;
import com.wd.loc.LssLocators;
import com.wd.util.DriverFactory;

public class LssListenSample {

	public static void main(String[] args) {

		WebDriver wDriver = DriverFactory.getDriverFor(BrowserConfig.testBrowser);

		EventFiringWebDriver driver = new EventFiringWebDriver(wDriver);
		driver.register(new WdEvents());

		driver.navigate().to(BrowserConfig.testUrl);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(LssLocators.txt_LoginPage_UserName).sendKeys("As05744");
		driver.findElement(LssLocators.txt_LoginPage_Password).sendKeys("asdf");
		driver.findElement(LssLocators.btn_LoginPage_Login).click();

	}

	
}
