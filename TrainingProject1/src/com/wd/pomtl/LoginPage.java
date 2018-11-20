package com.wd.pomtl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  extends OhrmBaseThread{

	
	public LoginPage() {
		PageFactory.initElements(driver.get(), this);
	}

	@FindBy(id = "txtUsername")
	WebElement txtUserName;


	@FindBy(id = "txtPassword")
	WebElement txtPassword;

	@FindBy(id = "btnLogin")
	WebElement btnLogin;
	
		// operations

	public void enterTextOnUserName(String valToEnter) {
		txtUserName.sendKeys(valToEnter);
		System.out.println(valToEnter + " entered on UserName");
	}

	public void enterTextOnPassword(String valToEnter) {
		txtPassword.sendKeys(valToEnter);
		System.out.println(valToEnter + " entered on Password");
	}

	public WelcomePage clickOnLoginButton() {
		btnLogin.click();
		System.out.println("Clicked on Login");
		return new WelcomePage();
	}

}
