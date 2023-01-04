package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Script {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\SubathraSpace\\eclipse-workspace\\JavaScript\\Driver\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.manage().window().maximize();
	dr.get(" http://www.facebook.com/");

JavascriptExecutor js = (JavascriptExecutor)dr;

 WebElement passtxt = dr.findElement(By.xpath("(//div[@class='_6lux'])[2]"));
 js.executeScript("arguments[0].setAttribute('value'='567890')",passtxt);

 Object retrivedTxt = js.executeScript("return arguments[0].getAttritube('value')",passtxt);
 
 //WebElement addtxt = dr.findElement(By.xpath("//span[text()='Greens Technologies Porur']"));
 //js.executeScript(" return arguments[0].getAttribute('value')",addtxt);

}
}





