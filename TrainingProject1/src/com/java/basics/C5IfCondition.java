package com.java.basics;

import javax.swing.JOptionPane;

public class C5IfCondition {

	public static void main(String[] args) {
		
		// find a number is odd number
		String strN = JOptionPane.showInputDialog("enter number");

		System.out.println(strN);
		int n = Integer.parseInt(strN);

		if (n % 2 == 0) {
			System.out.println(n + " is not odd number");
		} else {
			System.out.println(n + " is an odd number");
		}

		// find big number
		int x = 20;
		int y = 20;

		if(x<y) {
			System.out.println("y is bigger");
		}else if(x>y){
			System.out.println("x is bigger");
		}else{
			System.out.println("both are equal");
		}
	}

}
