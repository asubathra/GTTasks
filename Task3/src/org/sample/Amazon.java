package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\SubathraSpace\\eclipse-workspace\\Task3\\Driver\\chromedriver.exe");
	
	WebDriver d = new ChromeDriver();
	
	d.manage().window().maximize();
	d.get(" http://greenstech.in/selenium-course-content.html");
    d.findElement(By.xpath(//div[@id='heading20']))


}}