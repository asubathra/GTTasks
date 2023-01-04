package org.emp;

public class Employee {
private void emp() {
	System.out.println("Employee Details");
}
private void emp(int id,String name) {
System.out.println(id+"\n"+name);
}
public static void main(String[] args) {
	Employee e = new Employee();
	e.emp();
	e.emp(123,"john");
}
}
