package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Share {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "D:\\SubathraSpace\\eclipse-workspace\\Hidden\\Driver\\msedgedriver.exe");
	WebDriver dr = new EdgeDriver();

	dr.manage().window().maximize();
	 dr.get(" http://toolsqa.com/");
	 JavascriptExecutor js1 = (JavascriptExecutor)dr;
	 WebElement share= dr.findElement(By.xpath("//div[text()='Send us a message:']"));
	 js1.executeScript("arguments[0].scrollIntoView(true)",share);
	 
	 JavascriptExecutor js = (JavascriptExecutor)dr;
	 WebElement email= dr.findElement(By.xpath("//div[text()='Recent Tutorials']"));
	 js.executeScript("arguments[0].scrollIntoView(false)",email);
}
}
