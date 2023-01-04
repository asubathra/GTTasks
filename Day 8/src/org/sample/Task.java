package org.sample;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.edge.driver", "D:\\SubathraSpace\\eclipse-workspace\\Day 8\\Driver\\msedgedriver.exe");
	WebDriver dr = new EdgeDriver();
	dr.manage().window().maximize();
	dr.get(" http://demo.automationtesting.in/Alerts.html\r\n");
	dr.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
   dr.findElement(By.xpath("//button[contains(text(),'confirm')]")).click();
   
   Alert a = dr.switchTo().alert();
   String txt = a.getText();
   System.out.println(txt);
   //a.sendKeys("true");
   a.accept();
  
   dr.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
   dr.findElement(By.xpath("//button[contains(text(),'confirm')]")).click();
   
   
   Alert al = dr.switchTo().alert();
   String text =al.getText();
   System.out.println(text);
   al.dismiss();
 
  
  // a.sendKeys("cancel");
  // a.accept();
   
}
}