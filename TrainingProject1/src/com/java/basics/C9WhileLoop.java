package com.java.basics;

import javax.swing.JOptionPane;

public class C9WhileLoop {

	public static void main(String[] args) {

		boolean isMsgDisplayed = true;

		while (!isMsgDisplayed) {

			isMsgDisplayed = Boolean.parseBoolean(JOptionPane.showInputDialog("Is Message Displayed"));
			System.out.println(isMsgDisplayed);
		}
		
		System.out.println("while execution completed");
		do {

			isMsgDisplayed = Boolean.parseBoolean(JOptionPane.showInputDialog("Is Message Displayed"));
			System.out.println(isMsgDisplayed);
		} while (!isMsgDisplayed);

	}

}
