package com.java.cls;

public class MethodSamples {

	public boolean isOdd(int n) {

		if (n % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	// write a method to register user
	public void registerUser(String[] uDetails) {
		for (String ud : uDetails) {
			System.out.println(ud);
		}
	}

	public void registerUser1(String... uDetails) {
		for (String ud : uDetails) {
			System.out.println(ud);
		}
	}

	// return odd numbers between a range
	public int[] getOddNumbers(int rStart, int rEnd) {

		int odNumbers[] = new int[rEnd - rStart];

		int c = 0;
		for (int i = rStart; i <= rEnd; i++) {
			if (i % 2 == 1) {
				odNumbers[c] = i;
				c++;
			}
		}

		return odNumbers;
	}

	// Write a method to find a number is prime

	public void isPrime(int n) {

		boolean isPrimeNumber = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		if (isPrimeNumber) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not prime number");
		}

	}

	public boolean isPrime1(int n) {

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
