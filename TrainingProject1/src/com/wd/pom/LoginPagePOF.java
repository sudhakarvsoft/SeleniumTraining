package com.wd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPagePOF extends BasePage{

	private static By lst_Environment = By.xpath("//button[text()='Login']");

	
	public LoginPagePOF() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="user_name") private WebElement txtUserName;
	
	@CacheLookup
	@FindBy(name="user_password") private WebElement txtPassword;

	@CacheLookup
	@FindBy(xpath="//button[text()='Login']") private WebElement btnLogin;

	private WebElement elmEnvironment() {
		return getDriver().findElement(lst_Environment);
	}
	
	private Select lstEnvironment() {
		return new Select(elmEnvironment());
	}
	
	// operating methods
	public void enterTextOnUserName(String valToEnter) {
		txtUserName.clear();
		txtUserName.sendKeys(valToEnter);
		System.out.println(valToEnter + " entered on UserName");
	}

	public void enterTextOnPassword(String valToEnter) {
		txtPassword.clear();
		txtPassword.sendKeys(valToEnter);
		System.out.println(valToEnter + " entered on Password");
	}

	public void clickOnLogin() {
		btnLogin.click();
		System.out.println("Clicked on Login");
	}
	
	public void selectEnvironment(String valToSelect) {
		lstEnvironment().selectByVisibleText(valToSelect);
	}
	
}
