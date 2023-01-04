package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SuperClass extends BaseClass{

	public static void main(String[] args) {
	browserLaunch("chrome");
		
		launchUrl("https://www.facebook.com");
		getThePageTitle();
		
		getUrl();
		
		WebElement email = driver.findElement(By.id("email"));
		passtxt(email,"selva@gmail");
		
		WebElement pass = driver.findElement(By.name("pass"));
		passtxt(pass,"56789089");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
	    click(loginBtn);	
	
	}

	
	}
