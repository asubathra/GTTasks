package org.selenium;

public class Employee {
   static Employee e = null;  

private Employee()
{
	
}
 static public Employee getInstance() {
	 if (e==null) {
		e = new Employee();
	}
	 return e;
	 }
private void empId() {
	System.out.println("EmpId:327427");
}
 public static void main(String[] args) {
	Employee in = getInstance();
	System.out.println(System.identityHashCode(in));
	in.empId();
	
	Employee in1 = getInstance();
	System.out.println(System.identityHashCode(in1));

	Employee in2 = getInstance();
	System.out.println(System.identityHashCode(in2));

 }
} 