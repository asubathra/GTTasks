package org.company;

import org.client.Client;

public class Company extends Client {
private void companyName() {
	
System.out.println("Company name = HCL");
}
public static void main(String[] args) {
	Company com= new Company();
	com.companyName();
	com.clientName();
}
}

