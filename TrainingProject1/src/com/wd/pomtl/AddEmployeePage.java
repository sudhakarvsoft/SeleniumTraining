package com.wd.pomtl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage extends OhrmBaseThread{

	
	public AddEmployeePage() {
		PageFactory.initElements(driver.get(), this);
	}

	@FindBy(id="firstName") WebElement txtFirstName;

	@FindBy(id="lastName") WebElement txtLastName;
	
	@FindBy(xpath="//div[@id='location_inputfileddiv']//input[@class='select-dropdown']") WebElement lstLocation;
	
	@FindBy(linkText="SAVE") WebElement lnkSAVE; 
	

	public void enterTextOnFirstName(String valToEnter) {
		txtFirstName.sendKeys(valToEnter);
		System.out.println(valToEnter + " entered on FirstName");
	}

	public void enterTextOnLastName(String valToEnter) {
		txtLastName.sendKeys(valToEnter);
		System.out.println(valToEnter + " entered on LastName");
	}

	public void selectLocation(String lstItemName) {
		lstLocation.click();
		WebElement elmLstItem = driver.get().findElement(By.xpath("//span[contains(text(),'" + lstItemName + "')]"));
		((JavascriptExecutor) driver.get()).executeScript("arguments[0].scrollIntoView();", elmLstItem);
		elmLstItem.click();

		System.out.println(lstItemName + " is selected from Location");
	}

	public void clickOnSave() {
		lnkSAVE.click();
		System.out.println("Clicked on Save");
	}
}
