package org.uni;

public class CollegeClass extends University {

	@Override
	public void ug() {
	System.out.println("BSc,BBA,BA");
		
	}

	@Override
	public void pg() {
		System.out.println("MSc,MBA,MA");
	}
public static void main(String[] args) {
	CollegeClass coll = new CollegeClass();
	coll.ug();
	coll.pg();
}
}
