package com.wd.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

	public static WebDriver getDriverFor(String brName) {
		
		switch (brName.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\BD\\chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			//https://peter.sh/experiments/chromium-command-line-switches/
			co.addArguments("--disable-notifications");
			
			return new ChromeDriver(co);
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumSoftware\\BD\\geckodriver.exe");
			return new FirefoxDriver();
		case "ie":
			System.setProperty("webdriver.ie.driver", "C:\\SeleniumSoftware\\BD\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		case "edge":
			System.setProperty("webdriver.edge.driver", "C:\\SeleniumSoftware\\BD\\MicrosoftWebDriver.exe");
			return new EdgeDriver();
		default:
			System.out.println("No Valid browser found with the name");
			return null;
		}
	}
}