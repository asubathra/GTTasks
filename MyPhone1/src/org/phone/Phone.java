package org.phone;

public class Phone {
private void phoneInfo() {
	System.out.println("Smart Phone");
}
private void phoneInfo(int id, String name) {
	System.out.println(id+"\n"+name);
}
private void phoneInfo(long phno, double gst)
{
	System.out.println(phno+"\n"+gst);
}
public static void main(String[] args) {
	Phone p = new Phone();
	p.phoneInfo();
	p.phoneInfo(212,"OPPO");
	p.phoneInfo(98765432210l,87.56f);
}
}
