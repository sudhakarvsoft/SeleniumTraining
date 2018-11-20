package com.wd.pomtl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OhrmBaseThread {

	public static ThreadLocal<WebDriver> driver;
	public WebDriverWait wait;

	public void openApplication(String brName) {

		driver = new ThreadLocal<WebDriver>() {
			@Override
			protected WebDriver initialValue() {
				return DriverFactory.getDriverFor(brName);
			}
		};
		
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	
		//driver.get().manage().window().maximize();

		driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver.get(), 20);

		driver.get().get("https://sudhakarvsoft-trials646.orangehrmlive.com/");
	}
	public WebDriver getDriver() // call this method to get the driver object and launch the browser
    {
       return driver.get();
    }
	public void closeApplication() {
		driver.get().quit();
	}
}
