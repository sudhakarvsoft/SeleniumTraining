package com.java.cls;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetSample {

	public static void main(String[] args) {

		TreeSet<String> lst = new TreeSet<>();
		lst.add("a1");
		
		lst.add("10");
		lst.add("f");
		lst.add("a1");
		lst.add("d");
		lst.add("10");
		lst.add("f");
		lst.add("c");
		lst.add("x");
		lst.add("c");
		lst.add("f");
		lst.add("a");
		lst.add("a1");

		System.out.println(lst.size());
		
		for (String str:lst) {
			System.out.println(str);
		}
	}

}
