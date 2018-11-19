package com.wd.pom;

public class LssLoginPOM {

	public static void main(String[] args) {

		BasePage lss = new BasePage();
		
		LoginPage loginPage = lss.openApplication("chrome");
		loginPage.enterTextOnUserName("As05744");
		loginPage.enterTextOnPassword("asdf");
		loginPage.clickOnLogin();
	}

}
