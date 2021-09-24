package org.network;

public class Wifi {
	private void wifiName() {
		System.out.println("wifi");
		// TODO Auto-generated method stub

	}
	
	
	public static void main(String[] args) {
		Wifi w= new Wifi();
		w.wifiName();
		
		
		MobileData md = new MobileData();
		md.dataName();
		
		Lan l= new Lan();
		l.lanName();
		
		Wireless wr= new Wireless();
		wr.modamName();
	}

}
