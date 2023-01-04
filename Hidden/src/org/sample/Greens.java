package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Greens {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.edge.driver", "D:\\SubathraSpace\\eclipse-workspace\\Hidden\\Driver\\msedgedriver.exe");
	WebDriver dr = new EdgeDriver();

	dr.manage().window().maximize();
	 dr.get(" https://www.flipkart.com/");

	 
	 JavascriptExecutor js = (JavascriptExecutor)dr;
	 WebElement email= dr.findElement(By.xpath("//input[@type='text']"));
	 js.executeScript("arguments[0].setAttribute('value' , 'sam@gmail.com')",email);
	 
	 
	 JavascriptExecutor js1 = (JavascriptExecutor)dr;
	 WebElement pass= dr.findElement(By.xpath("//input[@type='password']"));
	 js.executeScript("arguments[0].setAttribute('value' , '8765456789')",pass);
	 Thread.sleep(1000);
	 Object retrievedTxt = js.executeScript("return arguments[0].getAttribute('value')",pass);
	 
	 String s = (String)retrievedTxt;
	 System.out.println(s);
	 WebElement log= dr.findElement(By.xpath("//input[@type='Submit']"));
	 js.executeScript("arguments[0].click()",log);
	 	 
}
}
