package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dom {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\SubathraSpace\\eclipse-workspace\\Dom33\\Driver\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	
	dr.manage().window().maximize();
	dr.get(" https://www.flipkart.com/ ");
	//dr.findElement(By.xpath("//a[text()='Login']")).click();

	dr.findElement(By.xpath("//div[@class='_36HLxm col col-3-5']//form//input[@type='text']")).sendKeys("testing@gmail.com");
	dr.findElement(By.xpath("//div[@class='_36HLxm col col-3-5']//form//input[@type='password']")).sendKeys("ddfghjjj");
	dr.findElement(By.xpath("//div[@class='_36HLxm col col-3-5']//form//button[@type='submit']")).click();
	
	//dr.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("testting@gmail.com");
	//dr.findElement(By.xpath("(//input[@type='password'])")).sendKeys("testting@gmail.com");
	//dr.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
}
}
