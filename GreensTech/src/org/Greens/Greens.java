package org.Greens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Greens {
	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","D:\\SubathraSpace\\eclipse-workspace\\GreensTech\\Driver\\msedgedriver.exe");
	
	WebDriver dr = new EdgeDriver();
	dr.get("http://www.greenstechnologys.com/");
	
	String title = dr.getTitle();
	System.out.println("Current Title:" +title);
	
	String url = dr.getCurrentUrl();
	System.out.println("Current PageUrl:"+url);
	
	
	dr.quit();
	
}
}
