package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle {
	
	public void VehicleNecessery() {
		System.out.println("YES");
		// TODO Auto-generated method stub

	}
	

	
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		v.VehicleNecessery();
		
		TwoWheller tw= new TwoWheller();
		tw.bike();
		tw.cycle();
		
		ThreeWheeler  tww= new ThreeWheeler();
		tww.Auto();
		
		FourWheeler fw= new FourWheeler();
		
		fw.bus();
		fw.car();
		fw.lorry();
		
	}
}
