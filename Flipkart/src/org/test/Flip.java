package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SubathraSpace\\eclipse-workspace\\Flipkart\\driver\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.flipkart.com");
		
		String title = dr.getTitle();
		System.out.println("Current Title:" +title);
		
		String url = dr.getCurrentUrl();
		System.out.println("Current PageUrl:"+url);
		
		dr.close();
		
	}		
}
