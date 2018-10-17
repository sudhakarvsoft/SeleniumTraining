package com.java.cls;

import java.util.HashMap;

public class MapSample {

	public static void main(String[] args) {
		
		HashMap<String, String> userDetails = new HashMap<>();
		userDetails.put("password", "asdf");

		userDetails.put("username", "admin");
		
		System.out.println(userDetails.get("username"));
		
	}

}
