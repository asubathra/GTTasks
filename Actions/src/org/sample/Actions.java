package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Actions {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","D:\\SubathraSpace\\eclipse-workspace\\Actions\\Driver\\msedgedriver.exe");
	WebDriver dr = new EdgeDriver();
	dr.manage().window().maximize();
	dr.get( "http://www.amazon.in");
	
	Actions a = new Actions()
}
}
