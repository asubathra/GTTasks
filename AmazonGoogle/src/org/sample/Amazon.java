package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","D:\\SubathraSpace\\eclipse-workspace\\AmazonGoogle\\Driver\\geckodriver.exe");
	
	WebDriver dr = new FirefoxDriver();
	dr.get(" https://www.amazon.in/");
	
	String title = dr.getTitle();
	System.out.println("Current Title:"+title);
	
	String url = dr.getCurrentUrl();
	System.out.println("Current PageUrl:"+url);
	
	dr.quit();
	

}
}
