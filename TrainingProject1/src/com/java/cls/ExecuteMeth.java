package com.java.cls;

import java.util.ArrayList;

public class ExecuteMeth {

	public static void main(String[] args) {
		MethodSamples ms = new MethodSamples();
		System.out.println(ms.isOdd(11));
		
		String userData[] = { "a", "b", "c","d" };
		ms.registerUser(userData);
		
		ms.registerUser1("a","b","c","d","e");
		ms.registerUser1(userData);
		
		int x[] = ms.getOddNumbers(10, 20);
		
		
		for(int val:x) {
			System.out.println(val);
		}
		
		ArrayList<Integer> y = ms.getOddNumbers1(20, 30);
		for(int val:y) {
			System.out.println(val);
		}
		
	}

}
