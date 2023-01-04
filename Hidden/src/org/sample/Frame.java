package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\SubathraSpace\\eclipse-workspace\\Hidden\\Driver\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();

	dr.manage().window().maximize();
	 dr.get("http://greenstech.in/selenium-course-content.html");

	 JavascriptExecutor js = (JavascriptExecutor)dr;
	 
	 WebElement frame = dr.findElement(By.xpath("//div[@id='heading304']"));
	 js.executeScript("arguments[0].scrollIntoView(false)",frame);
}
}
