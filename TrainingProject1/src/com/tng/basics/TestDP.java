package com.tng.basics;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDP {

	@Test(dataProvider="geData")
	public void t3(String p1) {
		System.out.println(p1);
	}

	@Test
	public void t4() {
		System.out.println("this is a t4 test method");
	}

	@DataProvider
	public String[][] geData() {
		//1st dimension: controls iterations
		//2nd dimension: controls parameters
		String[][] tData= new String[2][1];
		tData[0][0]="aaa";
		tData[1][0]="bbb";
		
		return tData;
	}
}
