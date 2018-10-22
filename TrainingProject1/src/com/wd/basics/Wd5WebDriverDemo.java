package com.wd.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Wd5WebDriverDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\SeleniumSoftware\\BD\\MicrosoftWebDriver.exe");
		WebDriver cd = new EdgeDriver();
		cd.get("http://google.com");
		System.out.println(cd.getTitle());
		cd.quit();
	}

}
