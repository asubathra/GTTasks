package org.network;

public class Wifi {
private void wifiName() {

	System.out.println("The WifiName is BSNL");
}
public static void main(String[] args) {
	Wifi w = new Wifi();
MobileData md = new MobileData();
	Lan l = new Lan();
	Wireless wl = new Wireless();
	w.wifiName();
	md.datatype(); 
	l.lanName();
	wl.modemName();
}
}
