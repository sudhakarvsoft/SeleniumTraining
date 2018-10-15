package com.java.basics;

public class C4Arrays {

	public static void main(String[] args) {

		String[] userDetails = new String[3];
		userDetails[0] = "selenium";
		userDetails[1] = "hq";
		userDetails[2] = "3.14";

		System.out.println(userDetails[0]);
		System.out.println(userDetails[1]);
		System.out.println(userDetails[2]);

		String users[] = { "a", "b", "c" };
		System.out.println(users[0]);

		String usersData[][] = new String[2][3];

		// 1st user data
		usersData[0][0] = "selenium";
		usersData[0][1] = "hq";
		usersData[0][2] = "3.14";
		// 2nd user data
		usersData[1][0] = "web";
		usersData[1][1] = "driver";
		usersData[1][2] = "4";

	}

}
