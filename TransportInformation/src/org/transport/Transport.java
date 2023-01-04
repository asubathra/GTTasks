package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
public void transportForm() {
	System.out.println("list of the transports:");
}
public static void main(String[] args) {
Transport t = new Transport();
Air a = new Air();
Road r = new Road();
Water w = new Water();
t.transportForm();
r.bike();
r.cycle();
r.bus();
r.car();
a.aeroplane();
a.helicopter();
w.boat();
w.ship();
}
}
