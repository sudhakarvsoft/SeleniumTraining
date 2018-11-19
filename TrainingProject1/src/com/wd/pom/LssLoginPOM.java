package com.wd.pom;

public class LssLoginPOM {

	public static void main(String[] args) {

		BasePage lss = new BasePage();
		lss.openApplication("chrome");
		
		LoginPage loginPage = new LoginPageNew();
		loginPage.enterTextOnUserName("As05744");
		loginPage.enterTextOnPassword("asdf");
		loginPage.clickOnLogin();
	}

}
