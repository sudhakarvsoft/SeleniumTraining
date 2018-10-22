package com.java.cls;

import java.util.LinkedList;
import java.util.List;

public class CreateCars {

	public static void main(String[] args) {

		TataNano car1 = new TataNano();
		car1.addChildMode();
		car1.addRearEngine();
		
		TataCars car2 = new TataIndica();
		car2.addChildMode();
		car2.addRearCam();
		car2.makeGPS();
		
		
		List<Integer> lst = new LinkedList<>();
		lst.add(10);
		lst.add(20);
		
		System.out.println(lst.get(0));
		
	}

}
