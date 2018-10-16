package com.java.basics;

public class C8ForLoop {

	public static void main(String[] args) {

		// print number 10 for 5 times

		for (int c = 1; c <= 5; c++) {
			System.out.println(10);
		}

		// print numbers from 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		//print numbers from 10 to 1
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		//print odd numbers between 10 and 30
		for(int i=10;i<=30;i++) {
			
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		//print values of an array
		int den[] = {2000,500,200,100,50,20,10,5,2,1};
		
		for(int i=0;i<den.length;i++) {
			System.out.println(den[i]);
		}
		
		//extended for loop
		for(int val:den) {
			System.out.println(val);
		}
	}

}










