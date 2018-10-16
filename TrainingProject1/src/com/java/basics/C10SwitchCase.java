package com.java.basics;

import javax.swing.JOptionPane;

public class C10SwitchCase {

	public static void main(String[] args) {

		String stCode = JOptionPane.showInputDialog("enter state code");

		switch (stCode) {
		case "ap":
			System.out.println("avaravathi");
			// break;
		case "ts":
			System.out.println("Hyderabad");
			break;

		case "tn":
			System.out.println("chennai");
			break;
		case "ka":
			System.out.println("bengaluru");
			break;

		default:
			System.out.println("no statecode found");
			break;
		}
	}

}
