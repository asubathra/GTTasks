package org.bike;

public class Ktm extends Bike{
public void cost() {
	System.out.println("Cost 50000");
}
public void speed() {
	System.out.println("Speed 100m");

}
public static void main(String[] args) {
	Ktm km = new Ktm();
	km.cost();
	km.speed();
	
	

}
}

