package org.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class JavaUnit extends BaseClass{
@BeforeClass
public static void preCondition() {
	System.out.println("Launch the browser....");
}
	@Test
public void tc2() {
	System.out.println("Test case 2");
}
	
	@After
	public void endDate() {
		System.out.println("Ending date and Time of Test Case");
	}
@Test
public void tc1() {
	System.out.println("Test case 1");

}
@Before
public void startDate() {
	System.out.println("Starting date and Time of Test Case");
}
@Test
public void tc3() {
	System.out.println("Test case 3");

}@AfterClass
public static void postCondition() {
	System.out.println("close the browser");

}


}
