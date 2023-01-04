package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","D:\\SubathraSpace\\eclipse-workspace\\Act1\\Driver\\msedgedriver.exe");
	WebDriver dr = new EdgeDriver();
	 dr.manage().window().maximize();
	 dr.get(" http://greenstech.in/selenium-course-content.html");
	 Actions a = new Actions(dr);
	
	 
	 WebElement text = dr.findElement(By.xpath("//a[text()='RPA']"));
	 text.click();
	 a.doubleClick(text).perform();
	 a.contextClick(text).perform();
	 
	 Thread.sleep(1000);
}
}
