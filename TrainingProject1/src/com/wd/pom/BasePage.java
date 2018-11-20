package com.wd.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.wd.config.BrowserConfig;
import com.wd.util.DriverFactory;

public class BasePage {

	public static ThreadLocal<WebDriver> driver;
	public LoginPage openApplication(String brName) {
		driver = new ThreadLocal<WebDriver>() {
			@Override
			public WebDriver initialValue() {
				return DriverFactory.getDriverFor(brName);
			}
		};
		
		driver.get().get(BrowserConfig.testUrl);

		driver.get().manage().window().maximize();
		driver.get().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return new LoginPage();
	}
	
	public static WebDriver getDriver() {
		return driver.get();
	}
	public void closeApplication() {
		driver.get().quit();
		driver.remove();
	}
}