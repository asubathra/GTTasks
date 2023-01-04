package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","D:\\SubathraSpace\\eclipse-workspace\\Act1\\Driver\\msedgedriver.exe");
	WebDriver dr = new EdgeDriver();
	 dr.manage().window().maximize();
	 dr.get("http://www.flipkart.com");
	 
	 
	 dr.findElement((By.xpath("//div[@class='xtXmba'][text()='Electronics']"))).click();
	 
	
	 Actions a = new Actions(dr);
	 
		/*
		 * WebElement log =
		 * dr.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")); log.click();
		 * 
		 * WebElement elect = dr.findElement(By.xpath("//div[text()='Electronics']"));
		 * elect.click();
		 */
	 
	 WebElement mouseHoverElectronics = dr.findElement(By.xpath("//span[text()='Electronics']"));
	 a.moveToElement(mouseHoverElectronics).build().perform();
//	 a.moveToElement(mouseHoverElectronics).perform();
	 
	//div[@class='xtXmba'][text()='Electronics']
	 
}}
