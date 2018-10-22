package com.java.cls;

public class TataNano implements TataCars{

	public void makeGPS() {
		System.out.println("GPS Added to nano");
	}

	@Override
	public void addRearCam() {
		// TODO Auto-generated method stub
		System.out.println("RearCam Added to nano");
	}
	
	public void addRearEngine() {
		System.out.println("RearEngine Added to nano");
	}
}
