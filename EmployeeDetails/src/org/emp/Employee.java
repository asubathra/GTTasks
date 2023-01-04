package org.emp;

public class Employee {

	int empId;
	String empName;
	String empDob;
	int empPhone;
	String empEmail;
	String empAddress;
	
	public Employee(int empId, String empName, String empDob, int empPhone, String empEmail, String empAddress) {
		this.empId = empId;
		this.empName = empName;
		this.empDob = empDob;
		this.empPhone = empPhone;
		this.empEmail = empEmail;
		this.empAddress = empAddress;
	}
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empDob
	 */
	public String getEmpDob() {
		return empDob;
	}
	/**
	 * @param empDob the empDob to set
	 */
	public void setEmpDob(String empDob) {
		this.empDob = empDob;
	}
	/**
	 * @return the empPhone
	 */
	public int getEmpPhone() {
		return empPhone;
	}
	/**
	 * @param empPhone the empPhone to set
	 */
	public void setEmpPhone(int empPhone) {
		this.empPhone = empPhone;
	}
	/**
	 * @return the empEmail
	 */
	public String getEmpEmail() {
		return empEmail;
	}
	/**
	 * @param empEmail the empEmail to set
	 */
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	/**
	 * @return the empAddress
	 */
	public String getEmpAddress() {
		return empAddress;
	}
	/**
	 * @param empAddress the empAddress to set
	 */
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	
}
