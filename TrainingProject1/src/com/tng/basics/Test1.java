package com.tng.basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test1 {

	@BeforeGroups(groups="m1")
	public void bg1() {
		System.out.println("this is before group mtehod");
	}
	@BeforeSuite
	public void bs1() {
		System.out.println("this is before suite");
	}

	@BeforeClass
	public void bc1() {
		System.out.println("open application");
	}
	
	@AfterClass
	public void ac1() {
		System.out.println("close application");
	}
	
	@BeforeMethod
	public void bm1() {
		System.out.println("login");
	}
	@AfterMethod
	public void am1() {
		System.out.println("Logout");
	}
	@Test(groups = "m1",priority=2)
	public void t1() {
		System.out.println("this is a t1 test method");
	}

	@Test(priority=1)
	public void t2() {
		System.out.println("this is a t2 test method");
	}

}
