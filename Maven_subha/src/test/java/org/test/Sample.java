package org.test;

import java.io.IOException;

public class Sample extends BaseClass{
	public static void main(String[] args)throws IOException {
browserLaunch("chrome");
		
		launchUrl("https://www.facebook.com/");
		LoginPojo l= new LoginPojo();
		passtxt(l.getEmailTxt(),"Selenium");
		passtxt(l.getPassTxt(),"8765456");
		
		driver.navigate().refresh();
		passtxt(l.getEmailTxt(),"java");
		passtxt(l.getPassTxt(),"654578");				
	}
}