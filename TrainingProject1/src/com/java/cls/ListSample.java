package com.java.cls;

import java.util.ArrayList;

public class ListSample {

	public static void main(String[] args) {

		ArrayList<String> lst = new ArrayList<>();
		lst.add("10");
		lst.add("sudhakar");
		lst.add("sudhakar");
		lst.add("sudhakar");
		lst.add("sudhakar");
		System.out.println(lst.size());
		
		
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
	}

}
