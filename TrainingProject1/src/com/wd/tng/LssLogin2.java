package com.wd.tng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wd.pom.BasePage;
import com.wd.pom.LoginPage;
import com.wd.pom.LoginPageNew;

public class LssLogin2 extends BaseTest{

	@Test
	public void login() {

		LoginPage loginPage = new LoginPageNew();
		loginPage.enterTextOnUserName("As05744");
		loginPage.enterTextOnPassword("asdf");
		loginPage.clickOnLogin();
	}

}
