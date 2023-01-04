package org.edu;

public class Arts extends Education {
private void bsc() {

	System.out.println("Bsc CS");

}
private void bEd() {
	System.out.println("BEd Tamil");
}
private void ba() {
System.out.println("BA English");
}
private void bba() {
 System.out.println("BBA com");

}
public void ug() {
System.out.println("BSc");
}
public void  pg() {
	System.out.println("MSc");
}
public static void main(String[] args) {
	Arts a = new Arts();
	a.bsc();
	a.bEd();
	a.ba();
	a.bba();
	a.ug();
	a.pg();
}
}

