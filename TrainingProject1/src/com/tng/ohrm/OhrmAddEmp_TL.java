package com.tng.ohrm;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wd.pomtl.AddEmployeePage;
import com.wd.pomtl.LoginPage;
import com.wd.pomtl.OhrmBaseThread;
import com.wd.pomtl.WelcomePage;

public class OhrmAddEmp_TL {

  @Test()
  public void OhrmAddEmployee() {
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
		ohrm.closeApplication();
  }

}
