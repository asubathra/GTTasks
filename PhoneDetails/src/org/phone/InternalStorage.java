package org.phone;

public class InternalStorage {
private void processorName() {
System.out.println("Apple 15A");	
}
private void ramSize() {
	System.out.println("2GB to 32GB");
} 
public static void main(String[] args) {
	InternalStorage is = new InternalStorage();
	ExternalStorage es = new ExternalStorage();
	is.processorName();
	is.ramSize();
	es.size();
}
}
