package com.wd.tng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wd.pom.BasePage;
import com.wd.pom.LoginPage;
import com.wd.pom.LoginPageNew;

public class BaseTestGrid {
	BasePage lss;

	@BeforeClass
	@Parameters({"browser","os"})
	public void openApplication(String brName,String os) {
		lss = new BasePage();
		lss.openApplication(brName);
	}

	@AfterClass
	public void closeApplication() {
		lss.closeApplication();
	}

}
