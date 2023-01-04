package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\SubathraSpace\\eclipse-workspace\\Act1\\Driver\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.manage().window().maximize();
	dr.get("https://www.amazon.in/");
	dr.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("sanitizer");
	//dr.findElement(By.xpath("//input[@type='submit']")).click();
	
	//WebElement product = dr.findElement(By.xpath(""))
}
}
 