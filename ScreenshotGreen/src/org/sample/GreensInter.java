package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensInter {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\SubathraSpace\\eclipse-workspace\\Screenshot\\Driver\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	System.out.println("Testing");

	dr.manage().window().maximize();
	 dr.get(" https://www.snapdeal.com/");

	 WebElement ph = dr.findElement(By.xpath("//input[@name='keyword']"));
	 ph.sendKeys("HP laptop");
	 
     dr.findElement(By.xpath("//input[@name='keyword']")).sendKeys(Keys.ENTER);
	
     Thread.sleep(10000);
	 TakesScreenshot ts = ((TakesScreenshot)dr);
	 
	 File ssc = ts.getScreenshotAs(OutputType.FILE);
	 
	File desc = new File("D:\\SubathraSpace\\eclipse-workspace\\ScreenshotGreen\\ScreenshotGreenTech\\Hplaptop.png");
	 
	FileUtils.copyFile(ssc,desc);
  
}
}
