package com.tng.basics;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail {

	@Test
	public void openApplication() {
		System.out.println("open application");
	}

	@Test(dependsOnMethods="openApplication")
	public void login() {
		System.out.println("login");
	}

}
