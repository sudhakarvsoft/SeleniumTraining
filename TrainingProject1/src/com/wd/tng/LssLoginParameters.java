package com.wd.tng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wd.pom.BasePage;
import com.wd.pom.LoginPage;
import com.wd.pom.LoginPageNew;

public class LssLoginParameters extends BaseTestParam{

	@Test
	@Parameters({"userName","password"})
	public void login(String uName, String pwd) {

		LoginPage loginPage = new LoginPageNew();
		loginPage.enterTextOnUserName(uName);
		loginPage.enterTextOnPassword(pwd);
		loginPage.clickOnLogin();
	}

}
