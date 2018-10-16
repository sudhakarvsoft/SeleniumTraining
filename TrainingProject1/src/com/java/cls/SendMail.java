package com.java.cls;

public class SendMail {

	public static void main(String[] args) {
		
		Gmail gm = new Gmail();
		gm.openApplication();
		gm.userName="admin";
		Gmail.password ="newpassword";
		
		gm.login();
		gm.composeMail("hi","how are you");
		gm.sendMail();
		gm.logout();
		gm.closeApplication();
		
		Gmail gm1 = new Gmail();
		gm1.openApplication();
		gm1.userName="newadmin";
		gm1.login();
		gm1.logout();
		gm1.closeApplication();
	}

}
