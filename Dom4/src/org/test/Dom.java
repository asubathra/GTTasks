package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dom {
public static void main(String[] args) throws InterruptedException, AWTException {
System.setProperty("webdriver.chrome.driver","D:\\SubathraSpace\\eclipse-workspace\\Dom33\\Driver\\chromedriver.exe");
WebDriver dr = new ChromeDriver();

dr.manage().window().maximize();
dr.get(" https://www.snapdeal.com/");

WebElement pro = dr.findElement(By.xpath("//input[@onkeypress='clickGo(event, this)']"));
pro.sendKeys("Home");


Thread.sleep(1000);
Actions a = new Actions(dr);
a.doubleClick(pro).perform();
a.contextClick(pro).perform();

Robot r = new Robot();

	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);

     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
     
     r.keyPress(KeyEvent.VK_TAB);
     r.keyRelease(KeyEvent.VK_TAB);
     
     a.doubleClick(pro).perform();
     a.contextClick(pro).perform();

     r.keyPress(KeyEvent.VK_DOWN);
  	r.keyRelease(KeyEvent.VK_DOWN);
}}