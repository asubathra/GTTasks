package org.sample;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UserDefined extends EmployeeDetails {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	Set<EmployeeDetails> S = new LinkedHashSet<EmployeeDetails>();
	
	
	System.out.println("Enter Employee Details:");
	for (int i = 0; i < 10; i++) {
	if(i%2==0) {
		
			EmployeeDetails ED = new EmployeeDetails();
			System.out.println("Enter EmployeeID: ");
			ED.setEmpId("Employee Id:"+scan.nextLine());
			System.out.println("Enter EmployeeName:");
			ED.setName("Employee Name:"+scan.nextLine());
		    System.out.println("Enter Emolpyee Phone:");
			ED.setPhone("Employee Phone:"+scan.nextLine());
		    System.out.println("Enter Employee Address:");
			ED.setAddress("Employee City:"+scan.nextLine());
            System.out.println("Enter Employee DoB:");
			ED.setDob("Employee DoB:"+scan.nextLine()); 
            System.out.println("Enter Employee DoJ:");
			ED.setDoj("Employee DoJ:"+scan.nextLine());
            System.out.println("Enter Employee EMail:");
			ED.setEMail("Employee Email:"+scan.nextLine());
            System.out.println("Enter Employee Gender:");
			ED.setGender("Employee Gender:"+scan.nextLine());
           System.out.println("Enter Employee Salary:");
			ED.setSalary("Employee Salary:"+scan.nextLine());
             S.add(ED);
	}
	}
	
             for (EmployeeDetails empD : S) {
			System.out.println(empD.getempId());
        	System.out.println(empD.getName());
        	System.out.println(empD.getPhone());
        	System.out.println(empD.getAddress());
        	System.out.println(empD.getDob());
        	System.out.println(empD.getDoj());
        	System.out.println(empD.getEMail());
        	System.out.println(empD.getGender());
        	System.out.println(empD.getSalary());
		}
}
}
