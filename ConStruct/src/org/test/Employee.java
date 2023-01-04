package org.test;


public class Employee {
		  public Employee() {
		    this("chennai",3456789l,345.567567f);
		    System.out.println("Employee Blood Group:B");
		  }

		  public Employee(int id,String name) {
		  this();
		    System.out.println("Employee Id:"+id);
		    System.out.println("Employee Name:"+name);
		  }

		  public Employee(String address,long phNo,float salary) {
		  		    System.out.println("Employee Address:"+address);
	
		  		    System.out.println("Employee Phno:"+phNo);
		  		 System.out.println("Employee salary:"+salary);
		  }

		  

		 public static void main(String[] args) {
			  Employee e1= new Employee(123,"greens");
		  }
}

