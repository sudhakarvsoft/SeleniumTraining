package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wd.config.BrowserConfig;
import com.wd.util.DriverFactory;

public class Wd10GetListOptions_SelectTag {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = DriverFactory.getDriverFor(BrowserConfig.testBrowser);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://apsrtconline.in/oprs-web/");

		String fPlace = "HYDERABAD";
		String tPlace = "VIJAYAWADA";

		driver.findElement(By.id("fromPlaceName")).sendKeys(fPlace);
		driver.findElement(By.linkText(fPlace)).click();

		driver.findElement(By.id("toPlaceName")).sendKeys(tPlace);
		driver.findElement(By.linkText(tPlace)).click();
		driver.findElement(By.id("txtJourneyDate")).click();
		driver.findElement(By.linkText("31")).click();

		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.linkText("31")));

		driver.findElement(By.id("searchBtn")).click();

		driver.findElement(By.id("BpFid")).click();
		
		List<WebElement> lstOptions = driver.findElements(By.xpath("//span[@id=\"BpFid\"]/..//li"));
		
		for(WebElement opt:lstOptions) {
			//System.out.println(opt.getAttribute("textContent").trim());
			System.out.println(opt.getText().trim());
		}
	
	
	}

}
