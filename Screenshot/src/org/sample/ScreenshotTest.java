package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\SubathraSpace\\eclipse-workspace\\Screenshot\\Driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		System.out.println("Test");

		dr.manage().window().maximize();
		 dr.get("http://www.google.com");
		 
	
		
		
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * "D:\\SubathraSpace\\eclipse-workspace\\Screenshot\\Driver\\chromedriver.exe")
			 * ; WebDriver dr = new ChromeDriver(); dr.manage().window().maximize();
			 * dr.get("http://www.greenstechnologys.com/");
			 */
		 
		
		TakesScreenshot ts =((TakesScreenshot)dr);
	
		File ss = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("D:\\SubathraSpace\\eclipse-workspace\\Screenshot\\Screenshot\\test.jpg");
		
	  
		FileUtils.copyFile(ss, dest);
		
		
		dr.findElement(By.name("q")).sendKeys("snapdeal");
		dr.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		File newSS = ts.getScreenshotAs(OutputType.FILE);
		
//		File dest1 = new File("D:\\SubathraSpace\\eclipse-workspace\\Screenshot\\Screenshot\\test1.jpg");

		FileUtils.copyFile(newSS, new File("D:\\SubathraSpace\\eclipse-workspace\\Screenshot\\Screenshot\\test1.jpg"));
		
		
		
	}}
		
		