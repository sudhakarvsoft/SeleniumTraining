package com.wd.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.wd.config.BrowserConfig;
import com.wd.util.DriverFactory;

public class BasePage {

	public static WebDriver driver;
	public LoginPage openApplication(String brName) {
		driver = DriverFactory.getDriverFor(brName);
		driver.get(BrowserConfig.testUrl);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return new LoginPage();
	}
}
