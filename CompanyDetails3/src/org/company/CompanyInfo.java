package org.company;

public class CompanyInfo {
private void companyName() {
	System.out.println("Company Details");
}
private void companyName(int comid) {
	System.out.println(comid);

}
private void companyName(String name) {
System.out.println(name);
}
private void companyName(String city,char gender) {
	System.out.println(city+"\n"+gender);
}
private void companyName(long phno,float salary) {
	
	System.out.println(phno+"\n"+salary);
}
public static void main(String[] args) {
	CompanyInfo ci = new CompanyInfo();
	ci.companyName();
	ci.companyName(101);
	ci.companyName("MNC" );
	ci.companyName("chennai",'M');
	ci.companyName(9876543211l,3000.3445f);
}
}
