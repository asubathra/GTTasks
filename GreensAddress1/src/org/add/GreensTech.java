package org.add;

public class GreensTech {
private void greensOmr() {
	System.out.println("Greens OMR");

}
private void greensOmr(int order) {
	System.out.println(order+"The order is") ;

}
private void greensOmr(String type) {
	System.out.println(type);
}
private void greensOmr(long number) {
	System.out.println(number);

}
public static void main(String[] args) {
	GreensTech gt = new GreensTech();
	gt.greensOmr();
	gt.greensOmr(500);
	gt.greensOmr("manual");
	gt.greensOmr(1232343448990l);
}


}
