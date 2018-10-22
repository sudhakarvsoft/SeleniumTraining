package com.wd.basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wd2FirefoxDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumSoftware\\BD\\geckodriver.exe");
		FirefoxDriver cd = new FirefoxDriver();
		cd.get("http://google.com");
		System.out.println(cd.getTitle());
		cd.quit();
	}

}
