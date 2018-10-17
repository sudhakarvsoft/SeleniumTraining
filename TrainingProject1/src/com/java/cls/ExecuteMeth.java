package com.java.cls;

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
	}

}
