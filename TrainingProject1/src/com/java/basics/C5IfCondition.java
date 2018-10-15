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
	}

}
