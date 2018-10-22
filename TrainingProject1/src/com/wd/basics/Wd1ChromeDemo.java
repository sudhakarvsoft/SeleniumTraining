package com.wd.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Wd1ChromeDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\BD\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://google.com");
		System.out.println(cd.getTitle());
		cd.quit();
	}

}
