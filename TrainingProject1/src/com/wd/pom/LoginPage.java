package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BasePageGrid{

	private static By txt_UserName = By.id("user_name");
	private static By txt_Password = By.name("user_password");
	private static By btn_Login = By.xpath("//button[text()='Login']");
	private static By lst_Environment = By.xpath("//button[text()='Login']");

	
	// identification methods
	private WebElement txtUserName() {
		return getDriver().findElement(txt_UserName);
	}

	private WebElement txtPassword() {
		return getDriver().findElement(txt_Password);
	}

	private WebElement btnLogin() {
		return getDriver().findElement(btn_Login);
	}

	private WebElement elmEnvironment() {
		return getDriver().findElement(lst_Environment);
	}
	
	private Select lstEnvironment() {
		return new Select(elmEnvironment());
	}
	
	// operating methods
	public void enterTextOnUserName(String valToEnter) {
		txtUserName().sendKeys(valToEnter);
		System.out.println(valToEnter + " entered on UserName");
	}

	public void enterTextOnPassword(String valToEnter) {
		txtPassword().sendKeys(valToEnter);
		System.out.println(valToEnter + " entered on Password");
	}

	public void clickOnLogin() {
		btnLogin().click();
		System.out.println("Clicked on Login");
	}
	
	public void selectEnvironment(String valToSelect) {
		lstEnvironment().selectByVisibleText(valToSelect);
	}

	public void selectEnvironment(WebElement elm, String valToSelect) {
		new Select(elm).selectByVisibleText(valToSelect);
	}
}
