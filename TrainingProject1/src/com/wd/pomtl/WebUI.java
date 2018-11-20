package com.wd.pomtl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUI extends OhrmBaseThread {

	public static WebElement getElement(By locator) {

		return driver.get().findElement(locator);
	}

	public static void enterTextOn(By locator, String val) {

		getElement(locator).sendKeys(val);
		System.out.println(val + " enetered on " + locator.toString());
	}

	public static void enterTextOn(WebElement elm, String val) {

		elm.sendKeys(val);
		System.out.println(val + " enetered on " + elm.toString());
	}

	public static void clickOn(By locator) {

		getElement(locator).click();
		System.out.println("clicked on " + locator.toString());
	}

	public static void clickOn(WebElement elm) {

		elm.click();
		System.out.println("clicked on " + elm.toString());
	}

	public static void selectItemFromList(By locator, String val) {

		new Select(getElement(locator)).selectByVisibleText(val);

		System.out.println(val + " selected in " + locator.toString());
	}

	public static WebElement waitAndGetElement(By locator, int timeoutInSeconds) {
		return new WebDriverWait(driver.get(), timeoutInSeconds).until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static void scrollToElement(By locator) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", getElement(locator));
		System.out.println("Scrolled to " + locator.toString());
	}

}
