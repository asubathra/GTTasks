package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensPerum {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\SubathraSpace\\eclipse-workspace\\Screenshot\\Driver\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	System.out.println("Testing");

	dr.manage().window().maximize();
	 dr.get(" http://greenstech.in/selenium-course-content.html");
	 
	 JavascriptExecutor js = (JavascriptExecutor)dr;
	 
	 WebElement Scroll = dr.findElement(By.xpath("//div[@id='heading2011']"));
	 
	 js.executeScript("arguments[0].scrollIntoView(true)",Scroll);
	 
	 TakesScreenshot ts = ((TakesScreenshot)dr);
	 
	 File ssc = ts.getScreenshotAs(OutputType.FILE);
	 
	 File desc = new File("D:\\SubathraSpace\\eclipse-workspace\\ScreenshotGreen\\ScreenshotGreenTech\\textJob.png");
	 
	 
	 FileUtils.copyFile(ssc,desc);
	 
WebElement Scrollup = dr.findElement(By.xpath("//h3[text()='Online Classroom']"));
	 
	 js.executeScript("arguments[0].scrollIntoView(false)",Scrollup);
	 
}
}
