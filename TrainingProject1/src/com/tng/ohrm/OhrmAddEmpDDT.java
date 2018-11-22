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

public class OhrmAddEmpDDT {
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

	@Test(dependsOnMethods="login",dataProvider="genEmpData",dataProviderClass=OhrmDP.class)
	public void addEmployee(HashMap<String, String> empData) throws InterruptedException {
		ngWebDriver.waitForAngularRequestsToFinish();
		if(!driver.findElement(By.linkText("PIM")).getAttribute("class").endsWith("active")) {
			driver.findElement(By.linkText("PIM")).click();
		}
		
		
		driver.findElement(By.linkText("Add Employee")).click();
		ngWebDriver.waitForAngularRequestsToFinish();
		//driver.findElement(By.id("firstName")).sendKeys(empData.get("fname"));
		driver.findElement(ByAngular.model("model['firstName']")).sendKeys(empData.get("fname"));
		
		driver.findElement(By.id("lastName")).sendKeys(empData.get("lname"));
		driver.findElement(By
			.xpath("//div[@id='location_inputfileddiv']//input[@class='select-dropdown']")).click();
		
		WebElement lstItem = driver.findElement(By
				.xpath("//span[contains(text(),'Canadian Development Center')]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", lstItem);
		lstItem.click();
		driver.findElement(By.linkText("NEXT")).click();
		
	}
	
	@AfterClass
	public void closeApplication() {
		//driver.quit();
	}
}









