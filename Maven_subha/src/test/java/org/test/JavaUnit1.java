package org.test;



import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JavaUnit1 extends BaseClass{
@BeforeClass
public static void preCondition() {
	browserLaunch("chrome");
}
	@Test
public void tc2() {
	System.out.println("Test case 2");
	launchUrl("https://www.facebook.com/");
	LoginPojo l =new LoginPojo();
	passtxt(l.getEmailTxt(),"Selenium");
	passtxt(l.getPassTxt(),"8765456");
	}
	@After
	public void endDate() {
		
		Date d = new Date();
		System.out.println(d);
	}
@Test
public void tc1() {
	System.out.println("Test case 1");
launchUrl("https://www.snapdeal.com/");
}
@Before
public void startDate() {
	Date d = new Date();
	System.out.println(d);
}
@Test
public void tc3() {
	System.out.println("Test case 3");
launchUrl("https://www.amazon.in/");
}

@AfterClass
public static void postCondition() {
	System.out.println("close the browser");

}


}


