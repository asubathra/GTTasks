package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\SubathraSpace\\eclipse-workspace\\Frame\\Driver\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.manage().window().maximize();
	dr.get("https://demo.guru99.com/test/guru99home/");
	JavascriptExecutor js = (JavascriptExecutor)dr;
	
	WebElement txt = dr.findElement(By.xpath("//h3[contains(text(),'adBlock')]"));
	js.executeScript("arguments[0].scrollIntoView(true)",txt);
	Thread.sleep(1000);
	
	WebElement frmWebEle = dr.findElement(By.id("a077aa5e"));
	dr.switchTo().frame(frmWebEle);
	
	WebElement img = dr.findElement(By.xpath("//img [@src='Jmeter720.png']"));
	img.click();
	
	dr.switchTo().defaultContent();
	
	WebElement txtWebEle = dr.findElement(By.xpath("//h3[contains(text(),'adBlock')]"));
	String text = txtWebEle.getText();
	System.out.println(text);
}



}
