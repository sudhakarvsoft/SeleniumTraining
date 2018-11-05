package com.wd.loc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wd.config.BrowserConfig;
import com.wd.util.DriverFactory;

public class LssLoginProp {
	static Properties p;
	static WebDriver driver;

	public static void main(String[] args) throws FileNotFoundException, IOException {

		p = new Properties();
		p.load(new FileInputStream("src\\com\\wd\\loc\\Lss.properties"));

		System.out.println(p.getProperty("txt_LoginPage_UserName"));

		driver = DriverFactory.getDriverFor(BrowserConfig.testBrowser);
		driver.get(BrowserConfig.testUrl);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(getLocator("txt_LoginPage_UserName")).sendKeys("As05744");
		driver.findElement(getLocator("txt_LoginPage_Password")).sendKeys("asdf");
		driver.findElement(getLocator("btn_LoginPage_Login")).click();

		getElement("txt_LoginPage_UserName").sendKeys("As05744");
		getElement("btn_LoginPage_Login").sendKeys("asdf");
		getElement("btn_LoginPage_Login").click();
		
		enterTextOn("txt_LoginPage_UserName", "As05744");
	}

	// id;user_name
	public static By getLocator(String pStrName) {

		String pStrVal = p.getProperty(pStrName);
		String[] pAr = pStrVal.split(";");
		String pName = pAr[0];
		String pVal = pAr[1];

		switch (pName.toLowerCase()) {
		case "id":
			return By.id(pVal);
		case "name":
			return By.name(pVal);
		case "tagname":
			return By.tagName(pVal);
		case "classname":
			return By.className(pVal);
		case "linktext":
			return By.linkText(pVal);
		case "partiallinktext":
			return By.partialLinkText(pVal);
		case "xpath":
			return By.xpath(pVal);
		case "cssselector":
			return By.cssSelector(pVal);
		default:

			System.out.println("No valid locator");
			return null;
		}
	}

	public static WebElement getElement(String pStrName) {
		return driver.findElement(getLocator(pStrName));
	}

	public static void clickOn(String pStrName) {
		getElement(pStrName).click();
		System.out.println("Clicked on " + pStrName);
	}

	public static void enterTextOn(String pStrName, String txtToEnter) {
		getElement(pStrName).sendKeys(txtToEnter);
		System.out.println(txtToEnter + " entered on " + pStrName);
	}
}
