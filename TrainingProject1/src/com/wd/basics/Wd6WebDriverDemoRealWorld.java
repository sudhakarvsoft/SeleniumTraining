package com.wd.basics;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.wd.config.BrowserConfig;
import com.wd.util.DriverFactory;

public class Wd6WebDriverDemoRealWorld {

	public static void main(String[] args) {

		WebDriver driver = DriverFactory.getDriverFor(BrowserConfig.testBrowser);
		driver.get(BrowserConfig.testUrl);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
