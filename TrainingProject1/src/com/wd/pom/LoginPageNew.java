package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPageNew extends LoginPage{

	private static By txt_UserName = By.id("user_name");
	private static By txt_Password = By.name("user_password");
	private static By btn_Login = By.xpath("//button[text()='Login']");
	private static By lst_Environment = By.xpath("//button[text()='Login']");

	
	// identification methods
	private WebElement txtUserName() {
		return driver.findElement(txt_UserName);
	}

	private WebElement txtPassword() {
		return driver.findElement(txt_Password);
	}

	private WebElement btnLogin() {
		return driver.findElement(btn_Login);
	}

	private WebElement elmEnvironment() {
		return driver.findElement(lst_Environment);
	}
	
	private Select lstEnvironment() {
		return new Select(elmEnvironment());
	}
	public void enterTextOnPassword(String valToEnter) {
		txtPassword().sendKeys(valToEnter);
		System.out.println(valToEnter + " entered on Password");
		System.out.println("from LoginPage New");
	}

	public void clickOnLogin() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",btnLogin());
		System.out.println("Clicked on Login using JS Executor");
	}
	
}
