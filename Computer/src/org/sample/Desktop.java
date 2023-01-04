package org.sample;

public class Desktop extends Computer
{
private void desktopName() {
	System.out.println("The desktop size is 44 inches");
}
public static void main(String[] args) {
	Desktop desk = new Desktop();
	desk.desktopName();
	desk.computerModel();
}
}
