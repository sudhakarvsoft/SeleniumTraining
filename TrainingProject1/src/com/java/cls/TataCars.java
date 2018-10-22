package com.java.cls;

public interface TataCars {

	public void makeGPS();
	public void addRearCam();
	
	public default void addChildMode() {
		System.out.println("child mode added to tatacars");
	}
}
