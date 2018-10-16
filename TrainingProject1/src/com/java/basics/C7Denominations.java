package com.java.basics;

public class C7Denominations {
	public static void main(String[] args) {
		// get denominations

		int n = 7799;

		int den[] = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

		for (int d = 0; d < den.length; d++) {
			int nD = n / den[d];
			if (nD != 0) {

				System.out.println(nD + "*" + den[d]);
				n = n % den[d];
			}
		}

	}
}
