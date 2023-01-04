package org.phone;

public class PhoneInfo {

private void phoneNo() {
System.out.println("Phone No= 1234567890");	

}
private void phonemieinum() {
	System.out.println("Phone mieinum= ");
	
}	
	private void camera() {
		System.out.println("It is 4G camera mobile");
	}
	
	private void Storage() {
		System.out.println("256 GB camera mobile");

	}
	private void osName() {
		
		System.out.println("Android");
	}
	public static void main(String[] args) {
		PhoneInfo pi = new PhoneInfo();
				pi.phoneNo();
		pi.phonemieinum();
		pi.camera();
		pi.Storage();
		pi.osName();
	}
	
	}

