package org.allvehicles;

import org.fourwheeler.FourWheeler;
import org.threewheeler.Threewheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
private void vehicleNecessary() {
	System.out.println("The people used these vehicles");
}
public static void main(String[] args) {
	Vehicle v = new Vehicle();
	TwoWheeler tw = new TwoWheeler();
	Threewheeler thw = new Threewheeler();
	FourWheeler fw = new FourWheeler();
	v.vehicleNecessary();
	tw.bike();
	tw.cycle();
	thw.auto();
	fw.car();
	fw.bus();
	fw.lorry();
}
}
