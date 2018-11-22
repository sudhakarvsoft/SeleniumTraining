package com.tng.ohrm;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;
import com.wd.util.DriverFactory;

public class WorkingWithCalculator {
	WebDriver driver;
	NgWebDriver ngWebDriver;
	@BeforeClass
	public void openApplication() {
		driver = DriverFactory.getDriverFor("chrome");
		// driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("http://juliemr.github.io/protractor-demo/");
		
		 ngWebDriver = new NgWebDriver((JavascriptExecutor)driver);
	}

	@Test
	public void add() {
		
		driver.findElement(ByAngular.model("first")).sendKeys("2");
		driver.findElement(ByAngular.model("second")).sendKeys("3");
		/*WebElement element = driver.findElement(ByAngular.model("operator"));
		new Select(element).selectByValue("MULTIPLICATION");*/
		
		driver.findElements(ByAngular.options("value for (key, value) in operators")).get(2).click();;
		
		driver.findElement(ByAngular.buttonText("Go!")).click();
		ngWebDriver.waitForAngularRequestsToFinish();
		System.out.println(driver.findElement(ByAngular.exactBinding("latest")).getText());
	}

		
	@AfterClass
	public void closeApplication() {
		//driver.quit();
	}
}









