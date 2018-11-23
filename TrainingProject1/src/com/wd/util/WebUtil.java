package com.wd.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WebUtil {

	public static boolean isElementExist(WebDriver driver, By locator) {

		try {
			driver.findElement(locator);
			return true;
		} catch (NoSuchElementException ne) {
			return false;
		}
	}
	
	public void verifyExist(WebDriver driver, By locator) {

		try {
			driver.findElement(locator);
			System.out.println("Element exist");
		} catch (Exception ne) {
			System.out.println("element not exist");
			throw ne;
		}
	}
	
	public static String getScreen(WebDriver driver) {
		
		TakesScreenshot tsScreenshot = (TakesScreenshot) driver;
		File srcFile = tsScreenshot.getScreenshotAs(OutputType.FILE);
		File dstFile = new File("src\\..\\Reports\\ErrImg\\Demo.png");
		String flPath = dstFile.getAbsolutePath();
		try {
			FileUtils.copyFile(srcFile, dstFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flPath;
	}
	
}
