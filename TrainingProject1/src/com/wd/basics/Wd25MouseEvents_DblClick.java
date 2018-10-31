package com.wd.basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.wd.config.BrowserConfig;
import com.wd.util.DriverFactory;

public class Wd25MouseEvents_DblClick {

	public static void main(String[] args) throws InterruptedException, AWTException, FindFailed {

		WebDriver driver = DriverFactory.getDriverFor(BrowserConfig.testBrowser);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://api.jquery.com/dblclick/");

		WebElement elm = driver.findElement(By.cssSelector(".demo.code-demo"));
		Actions act = new Actions(driver);
		act.moveToElement(elm).build().perform();
		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo.code-demo iframe")));
		
		WebElement dblElm = driver.findElement(By.tagName("div"));
		act.doubleClick(dblElm).build().perform();
	}

}
