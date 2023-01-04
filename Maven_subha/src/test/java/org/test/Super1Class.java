package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class Super1Class extends Base1Class {
	public static void main(String[] args) throws InterruptedException, IOException {
		browserLaunch("Edge");
		
		launchUrl("https://www.facebook.com");
		getThePageTitle();
		
		getTheUrl();
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		passtext(email,"subhama1992@gmail");
		takeScreenshot("facbook1");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		passtext(pass,"567890567");
		takeScreenshot("facbook2");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
	    clickElement(loginBtn);	

	    takeScreenshot("facbook3");
}
}