package com.wd.pomtl;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OhrmAddEmpNew {
	

	public static void main(String[] args) throws InterruptedException {

		OhrmBaseThread ohrm = new OhrmBaseThread();
		ohrm.openApplication("chrome");
		
		LoginPage loginPage = new LoginPage();
		
		loginPage.enterTextOnUserName("admin");
		loginPage.enterTextOnPassword("qtpsudhakar");
		
		WelcomePage welcomePage = loginPage.clickOnLoginButton();
		welcomePage.clickOnPIM();
		
		AddEmployeePage addEmpPage = welcomePage.clickOnAddEmployee();
		addEmpPage.enterTextOnFirstName("selenium");
		addEmpPage.enterTextOnLastName("hq");
		addEmpPage.selectLocation("Canadian Development Center");
		addEmpPage.clickOnSave();
	}
}









