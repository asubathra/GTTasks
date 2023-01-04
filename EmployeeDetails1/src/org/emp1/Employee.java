package org.emp1;

public class Employee {
private void empId() {
	System.out.println("Emp Id = 56789");
}
private void empName() {
	System.out.println("Emp Name=Nareen");
}
private void empDob() {
	System.out.println("Emp DOB= 5.7.2021");
}
private void empPhone() {
	System.out.println("Emp Mobile No is 9876543210");
}
private void empEmail() {
	System.out.println("Emp Email naren@23gmail.com");
	
}
private void empAddress() {
	System.out.println("medavakkam,Chennai");

}
public static void main(String[] args) {
	Employee e = new Employee();
	e.empId();
	e.empName();
	e.empDob();
	e.empPhone();
	e.empEmail();
	e.empAddress();
}
}
