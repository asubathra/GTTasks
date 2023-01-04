package org.college;

public class College extends Student {
private void collegeName() {
	System.out.println("College Name = SAC");
}
private void collegeCode() {
	System.out.println("College Code=102");
}
private void collegeBank() {
	System.out.println("College Bank= SBI");
}
public static void main(String[] args) {
	College c = new College();
	c.collegeName();
	c.collegeCode();
	c.collegeBank();
	c.studentName();
	c.studentDept();
	c.studentId();
	c.hostelName();
	c.deptname();
}

}
