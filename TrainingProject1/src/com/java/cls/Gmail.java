package com.java.cls;

public class Gmail {

	public String userName = "guest";
	public static String password = "guestpassword";

	
	public void login() {
		System.out.println("Logged in to application using " + userName + " and " + password);
	}

	public void openApplication() {
		System.out.println("Application Opened");
	}

	public void closeApplication() {
		System.out.println("application closed");
	}

	public void logout() {
		System.out.println("Loghed out of gmail");
	}

	public void composeMail(String subject, String mBody) {
		System.out.println("mail composed with subject "+subject+" body "+mBody);
	}

	public void sendMail() {
		System.out.println("Mail sent");
	}
}
