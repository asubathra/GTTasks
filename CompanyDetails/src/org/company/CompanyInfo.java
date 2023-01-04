package org.company;

public class CompanyInfo {
	
private void companyName1()
{
 System.out.println("Company Name = ABC Technology");
}
private void companyId() {
	System.out.println("Company Id= 345567");
}
private void companyAddress() {
	System.out.println("Company Address = Chennai");
}
public static void main(String[] args) {
	CompanyInfo  info = new CompanyInfo();
	info.companyName1();
	info.companyId();
	info.companyAddress();
}
}
