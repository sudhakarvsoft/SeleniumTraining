package com.wd.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wd.config.BrowserConfig;
import com.wd.util.DriverFactory;

public class Wd12WorkingWithTables {

	public static void main(String[] args) {

		WebDriver driver = DriverFactory.getDriverFor(BrowserConfig.testBrowser);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(BrowserConfig.testUrl);

		driver.findElement(By.id("user_name")).sendKeys("As05744");
		driver.findElement(By.name("user_password")).sendKeys("vsc1234");
		driver.findElement(By.xpath("//button[text()='Login']")).click();

		WebElement elmTble = driver.findElement(By.xpath("//h3[text()='Groups']/following::table[1]"));
		List<WebElement> lstTrs = elmTble.findElements(By.tagName("tr"));

		for (int rIndex = 1; rIndex < lstTrs.size(); rIndex++) {

			List<WebElement> lstD = lstTrs.get(rIndex).findElements(By.tagName("td"));

			if (lstD.get(0).getText().equalsIgnoreCase("StewartTitle")) {
				System.out.println(lstD.get(2).getText());
				break;
			}
		}
		
		System.out.println(getContactNameFromGroup(driver, "StewartTitle"));
	}

	public static String getContactNameFromGroup(WebDriver driver,String GroupName) {
		
		WebElement elm = driver.findElement(By.xpath("//h3[text()='Groups']/following::table[1]//td[1][normalize-space()='"+GroupName+"']/../td[3]"));
		return elm.getText();
	}
	
	
}
