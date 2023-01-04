package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
public static void main(String[] args) {
	
	System.setProperty("webdriver.edge.driver", "D:\\SubathraSpace\\eclipse-workspace\\Demo\\Driver\\msedgedriver.exe");
	
	WebDriver dr = new EdgeDriver();
	
	dr.get("http://demo.automationtesting.in/Register.html/");
	
	String title = dr.getTitle();
	System.out.println("Current Title:" +title);
	
	String url = dr.getCurrentUrl();
	System.out.println("Current PageUrl:"+url);
	
	
	dr.quit();
	
}
}
