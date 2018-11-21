package com.wd.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridSample {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName(BrowserType.CHROME);
		capabilities.setPlatform(Platform.WIN10);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.149.1:4444/wd/hub"), capabilities);
		driver.get("http://google.com");
		
		driver.quit();
	}

}
