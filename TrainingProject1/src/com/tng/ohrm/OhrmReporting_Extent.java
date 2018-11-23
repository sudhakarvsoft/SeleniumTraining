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
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.wd.util.DriverFactory;
import com.wd.util.WebUtil;

public class OhrmReporting_Extent {
	WebDriver driver;
	NgWebDriver ngWebDriver;
	ExtentReports report;
	ExtentTest test;
	@BeforeClass
	public void openApplication() {

		try {
			report = new ExtentReports("src\\..\\Reports\\"+this.getClass().getSimpleName()+".html");
			test = report.startTest(this.getClass().getSimpleName());
			
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
			assertTrue(WebUtil.isElementExist(driver, By.id("txtUsername1")), "IsApplicationOpened");
			System.out.println("Application Opened");
			test.log(LogStatus.PASS,"OpenApplication","Application Opened");
		} catch (Error | Exception e) {
			System.out.println("Exception occured while opening application:" + e.getMessage());
			String errImg = WebUtil.getScreen(driver);
			test.log(LogStatus.FAIL,"OpenApplication","Exception occured while opening application:" + e.getMessage()+test.addScreenCapture(errImg));
			driver.quit();
			report.endTest(test);
			report.flush();
			report.close();
			throw e;
		}
	}

	@Test
	public void login() {

		try {
			driver.findElement(By.id("txtUsername")).sendKeys("admin");
			driver.findElement(By.id("txtPassword")).sendKeys("qtpsudhakar");
			driver.findElement(By.id("btnLogin")).click();
			test.log(LogStatus.PASS,"Login","Login successful");

		} catch (Error | Exception e) {
			System.out.println("Exception while logging in:" + e.getMessage());
			test.log(LogStatus.FAIL,"Login","Login unsuccessful");
			throw e;
		}
	}

	@Test(dependsOnMethods = "login")
	public void addEmployee() {
		try {
			ngWebDriver.waitForAngularRequestsToFinish();
			if (!driver.findElement(By.linkText("PIM")).getAttribute("class").endsWith("active")) {
				driver.findElement(By.linkText("PIM")).click();
			}

			driver.findElement(By.linkText("Add Employee")).click();
			ngWebDriver.waitForAngularRequestsToFinish();
			// driver.findElement(By.id("firstName")).sendKeys(empData.get("fname"));
			driver.findElement(By.xpath("//input[@ng-model=\"model['firstName']\"]")).sendKeys("selenium");

			driver.findElement(By.id("lastName")).sendKeys("hq");
			driver.findElement(By.xpath("//div[@id='location_inputfileddiv']//input[@class='select-dropdown']"))
					.click();

			WebElement lstItem = driver.findElement(By.xpath("//span[contains(text(),'Canadian Development Center')]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", lstItem);
			lstItem.click();
			driver.findElement(By.linkText("NEXT")).click();
		} catch (Error | Exception e) {
			System.out.println("Exception while adding employee");
			throw e;
		}
	}

	@AfterClass
	public void closeApplication() {
		driver.quit();
		report.endTest(test);
		report.flush();
		report.close();
	}
}
