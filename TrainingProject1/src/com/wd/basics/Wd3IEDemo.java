package com.wd.basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Wd3IEDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver", "C:\\SeleniumSoftware\\BD\\IEDriverServer.exe");
		InternetExplorerDriver cd = new InternetExplorerDriver();
		cd.get("http://google.com");
		System.out.println(cd.getTitle());
		cd.quit();
	}

}
