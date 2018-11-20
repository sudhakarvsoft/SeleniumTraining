package com.wd.pomtl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class DriverFactory {

	public static WebDriver getDriverFor(String brName) {

		switch (brName.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\BD\\chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			return new ChromeDriver(co);
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumSoftware\\BD\\geckodriver.exe");
			FirefoxProfile p = new FirefoxProfile();
			p.setPreference("dom.webnotifications.enabled", false);
			FirefoxOptions fo = new FirefoxOptions();
			fo.setProfile(p);
			return new FirefoxDriver(fo);
		case "edge":
			System.setProperty("webdriver.edge.driver", "C:\\SeleniumSoftware\\BD\\MicrosoftWebDriver.exe");
			
			return new EdgeDriver();
		case "ie":
			System.setProperty("webdriver.ie.driver", "C:\\SeleniumSoftware\\BD\\IEDriverServer.exe");
			
			return new InternetExplorerDriver();
		default:
			System.out.println("No valid browser name");
			return null;
		}
	}

}
