package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\SubathraSpace\\eclipse-workspace\\Dom2\\Driver\\chromedriver.exe" );

	WebDriver dr = new ChromeDriver();
	dr.manage().window().maximize();
	
	dr.get(" http://toolsqa.com/automation-practice-form/"); 
	dr.findElement(By.xpath("//a[text()='Go back to Homepage']")).click();
	dr.findElement(By.xpath("//a[@class='btn btn-primary-shadow btn-block']")).click();
	dr.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Ram");
	dr.findElement(By.xpath("//input[@name='LastName']")).sendKeys("kumar");
	dr.findElement(By.xpath("//textarea[@name='Adress']")).sendKeys("chennai");
	dr.findElement(By.xpath("//input[@type='email']")).sendKeys("ramana@gmail");
}
}