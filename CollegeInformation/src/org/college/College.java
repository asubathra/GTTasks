package org.college;

public class College {
private void collegeName() {
	System.out.println("SRC College");
}
private void collegeCode() {
	System.out.println("6808");

}
private void collegeRank() {
	System.out.println("A");
}
public static void main(String[] args) {
	College c = new College();
	Student s = new Student();
	Hostal h = new Hostal();
	Dept d = new Dept();
	
	c.collegeName();
	c.collegeCode();
	c.collegeRank();
    s.stuName();
    s.stuDept();
    s.stuId();
    h.hostelName();
    d.deptName();
}
}
