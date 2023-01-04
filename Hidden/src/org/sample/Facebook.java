package org.sample;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws AWTException {

	System.setProperty("webdriver.chrome.driver", "D:\\SubathraSpace\\eclipse-workspace\\Hidden\\Driver\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.manage().window().maximize();
	dr.get(" http://www.greenstechnologys.com/");

    JavascriptExecutor js = (JavascriptExecutor)dr;
    WebElement scroll = dr.findElement(By.xpath("(//span[@class='red_text'])[5]"));
	js.executeScript("arguments[0].scrollIntoView(true)",scroll);
	
	
}
}
 