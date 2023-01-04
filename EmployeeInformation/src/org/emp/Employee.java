package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {

	private void empname() {
		System.out.println("Company Name = John");
	}
	public static void main(String[] args) {
		Employee e =new Employee();
		Client c = new Client();
		Company cp = new Company();
		Project p = new Project();
		
		e.empname();
		c.clientName();
        cp.companyName();
        p.projectName();
	
		
	}
}
