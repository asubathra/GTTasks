package org.sample;

public class Desktop implements Computer,Software {

public void desktopModel() {
	System.out.println("Hardware and Software");
}
@Override
public void hardwareResources() {	
	System.out.println("Hardware Resources");
}
@Override
public void softwareResources() {
	System.out.println("Software Resources");
}


public static void main(String[] args) {
	Desktop dt = new Desktop();
	dt.desktopModel();
	dt.hardwareResources();
	dt.softwareResources();
}
}