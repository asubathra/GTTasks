package org.emp;

public class EmployeeRunner {
	public static void main(String[] args) {
		Employee employee  = new Employee(1, "aadhini", "27-01-2019", 0000000000, "aadhini.venba@gmail.com", "karaikudi");
		System.out.println("Employee Id... " + employee.getEmpId());
		System.out.println("Employee Name... " + employee.getEmpName());
		System.out.println("Employee Dob... " + employee.getEmpDob());
		System.out.println("Employee Phone... " + employee.getEmpPhone());
		System.out.println("Employee Email... " + employee.getEmpEmail());
		System.out.println("Employee Address... " + employee.getEmpAddress());	
		
		EmployeeRunner runner = new EmployeeRunner();
		System.out.println("Employee Id... " + runner.empId());
	}
	
	public int empId() {
		return 1;
	}

}
