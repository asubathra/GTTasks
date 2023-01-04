package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Dom {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "D:\\SubathraSpace\\eclipse-workspace\\Dom\\Driver\\msedgedriver.exe");

	WebDriver dr = new EdgeDriver();
	dr.manage().window().maximize();
	
	dr.get(" https://www.facebook.com/ ");
	
	WebElement emailText = dr.findElement(By.id("email"));
	
	emailText.sendKeys("Facecookies@gmail.com");
WebElement pass = dr.findElement(By.id("pass"));
	
	pass.sendKeys("Facecookies@gmail.com");  
	
System.out.println(pass);

	
	
}

}