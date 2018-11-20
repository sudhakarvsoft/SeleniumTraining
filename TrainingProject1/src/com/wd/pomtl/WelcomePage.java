package com.wd.pomtl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends OhrmBaseThread{

	//public WebDriver driver;

	public WelcomePage() {
		PageFactory.initElements(driver.get(), this);
	}
	
	@FindBy(linkText="PIM") WebElement lnkPIM;
	@FindBy(linkText="Add Employee") WebElement lnkAddEmployee;
	
	
	public void clickOnPIM() {
		lnkPIM.click();
		System.out.println("Clicked on PIM link");
	}
	
	public AddEmployeePage clickOnAddEmployee() {
		lnkAddEmployee.click();
		System.out.println("Clicked on AddEmployee link");
		return new AddEmployeePage();
	}
}














