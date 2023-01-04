package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Act {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","D:\\SubathraSpace\\eclipse-workspace\\Act\\Driver\\msedgedriver.exe");
		WebDriver dr = new EdgeDriver();
		dr.manage().window().maximize();
		dr.get( " http://www.flipkart.com");
		
		Actions a = new Actions(dr);
		WebElement items = dr.findElement(By.xpath("//div[text()='Home']"));
		a.moveToElement(items).perform();
		
		
	}
}
