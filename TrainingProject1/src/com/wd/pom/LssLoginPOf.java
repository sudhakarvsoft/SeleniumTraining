package com.wd.pom;

public class LssLoginPOf {

	public static void main(String[] args) throws InterruptedException {

		BasePage lss = new BasePage();
		lss.openApplication("chrome");
		LoginPagePOF loginPage = new LoginPagePOF();
		loginPage.enterTextOnUserName("As05744");
		loginPage.enterTextOnPassword("asdf");
		//loginPage.clickOnLogin();
		Thread.sleep(2000);
		loginPage.enterTextOnUserName("As05744");
		loginPage.enterTextOnPassword("asdf");
		loginPage.clickOnLogin();
	}

}
