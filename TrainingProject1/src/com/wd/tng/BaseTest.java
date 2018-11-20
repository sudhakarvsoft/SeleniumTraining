package com.wd.tng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wd.pom.BasePage;
import com.wd.pom.LoginPage;
import com.wd.pom.LoginPageNew;

public class BaseTest {
	BasePage lss;

	@BeforeClass
	public void openApplication() {
		lss = new BasePage();
		lss.openApplication("chrome");
	}

	@AfterClass
	public void closeApplication() {
		lss.closeApplication();
	}

}
