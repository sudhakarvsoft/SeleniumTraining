package com.tng.ohrm;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import com.wd.util.DriverFactory;

public class WorkingWithAngularApp_Table {
	WebDriver driver;
	NgWebDriver ngWebDriver;
	@BeforeClass
	public void openApplication() {
		driver = DriverFactory.getDriverFor("chrome");
		// driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://sudhakarvsoft-trials646.orangehrmlive.com/auth/login");
		
		 ngWebDriver = new NgWebDriver((JavascriptExecutor)driver);
	}

	@Test
	public void login() {
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("qtpsudhakar");
		driver.findElement(By.id("btnLogin")).click();
	}

	@Test(dependsOnMethods="login")
	public void addEmployee() throws InterruptedException {
		ngWebDriver.waitForAngularRequestsToFinish();
		driver.findElement(By.linkText("PIM")).click();
		
		driver.findElement(By.linkText("Employee List")).click();
		
		ngWebDriver.waitForAngularRequestsToFinish();
		WebElement tblElement = driver.findElement(By.id("employeeListTable"));
		System.out.println(
				tblElement.findElements(ByAngular.repeater("employee in vm.employees track by employee.empNumber"))
						.size());
	}
	
	@AfterClass
	public void closeApplication() {
		//driver.quit();
	}
}









