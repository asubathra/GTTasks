package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\SubathraSpace\\eclipse-workspace\\Frame\\Driver\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.manage().window().maximize();
	dr.get(" https://retail.onlinesbi.com/retail/login.htm");
	JavascriptExecutor js = (JavascriptExecutor)dr;

	WebElement icici = dr.findElement(By.id("DUMMY1"));
	dr.switchTo().frame(icici);
}
}
