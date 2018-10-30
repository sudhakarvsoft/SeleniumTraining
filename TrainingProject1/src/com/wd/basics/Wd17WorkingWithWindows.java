package com.wd.basics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wd.config.BrowserConfig;
import com.wd.util.DriverFactory;

public class Wd17WorkingWithWindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = DriverFactory.getDriverFor(BrowserConfig.testBrowser);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/nlogin/login");

		driver.findElement(By.cssSelector(".socialbtn.google")).click();

		String cWndHandle = driver.getWindowHandle(); // return current window handle

		Set<String> wndHandles = driver.getWindowHandles(); // return set of window handles opened in current session

		for (String wnd : wndHandles) {
			driver.switchTo().window(wnd);
			new WebDriverWait(driver, 20).until(ExpectedConditions.not(ExpectedConditions.titleContains("Forwarding")));
			if(driver.getTitle().startsWith("Sign in – Google accounts")) {
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("abc@gmail.com");
		
		driver.close(); //closes current window
		
		driver.switchTo().window(cWndHandle);
		
		driver.quit(); //closes all windows opened in the session
	}

}
