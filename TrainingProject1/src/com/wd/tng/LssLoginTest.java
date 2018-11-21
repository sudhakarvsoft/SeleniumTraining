package com.wd.tng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wd.pom.BasePage;
import com.wd.pom.LoginPage;
import com.wd.pom.LoginPageNew;

public class LssLoginTest {

	@Test(dataProvider="geData",dataProviderClass=DPAll.class)
	public void login(String uName, String pwd) {
		BasePage lss = new BasePage();
		LoginPage loginPage  = lss.openApplication("chrome");
		loginPage.enterTextOnUserName(uName);
		loginPage.enterTextOnPassword(pwd);
		loginPage.clickOnLogin();
		lss.closeApplication();
	}

	@DataProvider
	public String[][] geData() {
		//1st dimension: controls iterations
		//2nd dimension: controls parameters
		String[][] tData= new String[3][2];
		
		//1st
		tData[0][0]="aaa";
		tData[0][1]="bbb";
		
		//2nd
		tData[1][0]="ccc";
		tData[1][1]="dddd";
		
		//3rd
		tData[2][0]="eee";
		tData[2][1]="qqqw";
		
		return tData;
	}
}
