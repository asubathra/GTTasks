package org.test;

public class Company extends Employee1{
	public Company() {
	  super(1234,"raj");
		System.out.println("Company Address:chennai");
	  }
public Company(String name) {
this();
System.out.println("Company Name:"+name);
}    

public static void main(String[] args) {
			  Company c = new Company ("Wipro");

}
}
