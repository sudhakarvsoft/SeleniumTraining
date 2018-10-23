package com.java.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class C11DateGet {

	public static void main(String[] args) throws ParseException {
		
		String str = "20 June 1986";
		SimpleDateFormat d = new SimpleDateFormat("dd MMMM yyyy");
		Date dt = d.parse(str);
		
		System.out.println(new SimpleDateFormat("EEEE").format(dt));
		
	}

}
