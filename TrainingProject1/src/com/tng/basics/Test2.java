package com.tng.basics;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	
	@BeforeTest
	public void bt1() {
		System.out.println("this is before test method");
	}
	
  @Test
  public void t3() {
	  System.out.println("this is a t3 test method");
  }
  
  @Test
  public void t4() {
	  System.out.println("this is a t4 test method");
  }
  
}
