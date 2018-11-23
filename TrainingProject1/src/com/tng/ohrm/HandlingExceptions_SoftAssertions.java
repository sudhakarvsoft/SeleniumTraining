package com.tng.ohrm;

import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import com.wd.util.DriverFactory;
import com.wd.util.WebUtil;

public class HandlingExceptions_SoftAssertions {
	WebDriver driver;
	NgWebDriver ngWebDriver;

	@BeforeClass
	public void openApplication() {

		try {
			driver = DriverFactory.getDriverFor("chrome");
			// driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.get("https://sudhakarvsoft-trials646.orangehrmlive.com/auth/login");

			ngWebDriver = new NgWebDriver((JavascriptExecutor) driver);
			
			/*if (WebUtil.isElementExist(driver, By.id("txtUsername1"))) {
				System.out.println("Application Opened");
			}
			else {
				Assert.fail("Application not opened");
			}*/
			assertTrue(WebUtil.isElementExist(driver, By.id("txtUsername")), "IsApplicationOpened");
			System.out.println("Application Opened");
			
		} catch (Error | Exception e) {
			System.out.println("Exception occured while opening application:" + e.getMessage());
			driver.quit();
			throw e;
		}
	}

	@Test
	public void loginScrren() {

		try {
			SoftAssert sAssert = new SoftAssert();
			
			sAssert.assertTrue(WebUtil.isElementExist(driver, By.id("txtUsername")), "IsUserNameExist");
			
			sAssert.assertTrue(WebUtil.isElementExist(driver, By.id("txtPassword1")), "IsPasswordExist");
			sAssert.assertTrue(WebUtil.isElementExist(driver, By.id("btnLogin")), "IsLoginExist");
			sAssert.assertAll();
			
		} catch (Error | Exception e) {
			System.out.println("Element that are not exist:" + e.getMessage());
			throw e;
		}
	}

	@AfterClass
	public void closeApplication() {
		driver.quit();
	}
}
