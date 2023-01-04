package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Task {
public static void main(String[] args){
	
	System.setProperty("webdriver.edge.driver","D:\\SubathraSpace\\eclipse-workspace\\Dom3\\Driver\\msedgedriver.exe");
	
	WebDriver dr = new EdgeDriver();
	dr.manage().window().maximize();
	dr.get(" https://www.amazon.in/");
	
	dr.findElement(By.xpath("//div[@id='g6TAI8pVprrbpea4FTdGgQ']")).click();
	dr.findElement(By.xpath("//input[@value='Go']")).click();
	
}
	
}


