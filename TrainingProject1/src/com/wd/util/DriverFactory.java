package com.wd.util;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class DriverFactory {

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
	
	public static WebDriver getRemoteDriverFor(String brName, String osName) {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		switch (brName.toLowerCase()) {
		case "chrome":
			capabilities.setBrowserName(BrowserType.CHROME);
			break;
		case "firefox":
			capabilities.setBrowserName(BrowserType.FIREFOX);
			break;
		case "edge":
			capabilities.setBrowserName(BrowserType.EDGE);
			break;
		case "ie":
			capabilities.setBrowserName(BrowserType.IE);
			break;
		default:
			capabilities.setBrowserName(BrowserType.CHROME);
		}

		switch (osName.toLowerCase()) {
		case "windows":
			capabilities.setPlatform(Platform.WINDOWS);
			break;
		case "win10":
			capabilities.setPlatform(Platform.WIN10);
			break;
		case "win81":
			capabilities.setPlatform(Platform.WIN8_1);
			break;
		case "mac":
			capabilities.setPlatform(Platform.MAC);
			break;
		default:
			capabilities.setPlatform(Platform.WINDOWS);
		}
		
		WebDriver driver = null;
		try {
			driver = new RemoteWebDriver(new URL("http://192.168.149.1:4444/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return driver;
	}

}
