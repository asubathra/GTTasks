package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Green {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\SubathraSpace\\eclipse-workspace\\Greens1\\Driver\\chromedriver.exe");
   WebDriver dr = new ChromeDriver();
	dr.manage().window().maximize();
	dr.get(" https://www.snapdeal.com/");
	
	Actions a = new Actions(dr);
	WebElement shop = dr.findElement(By.xpath(""));
	a.moveToElement(shop).perform();
	
	WebElement purch = dr.findElement(By.xpath("//span[text()='Footwear']"));

	purch.click();
	
}
}
