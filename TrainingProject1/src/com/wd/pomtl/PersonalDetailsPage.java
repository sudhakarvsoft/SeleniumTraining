package com.wd.pomtl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPage extends OhrmBaseThread{

	
	public PersonalDetailsPage() {
		PageFactory.initElements(driver.get(), this);
	}

	public WebElement elmPersonalDetails() {
		return driver.get().findElement(By.xpath("//h4[text()='Personal Details']"));
	}
	
	
}
