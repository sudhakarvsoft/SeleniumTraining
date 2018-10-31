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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import com.wd.config.BrowserConfig;
import com.wd.util.DriverFactory;

public class Wd22FileInput_Sikuli {

	public static void main(String[] args) throws InterruptedException, AWTException, FindFailed {

		WebDriver driver = DriverFactory.getDriverFor(BrowserConfig.testBrowser);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		
		String flPath = "C:\\Users\\skakunuri\\Desktop\\Notes\\Data\\Demo.docx";
		driver.findElement(By.xpath("//input[@id='input_resumeParser']")).click();

		Thread.sleep(1000);
		
		Screen scr = new Screen();
		scr.type("C:\\Users\\skakunuri\\Desktop\\Notes\\ElmImages\\txtFileName.PNG",flPath);
		Thread.sleep(1000);
		
		scr.click("C:\\Users\\skakunuri\\Desktop\\Notes\\ElmImages\\btnOpen.PNG");
	}

}
