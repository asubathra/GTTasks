package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;


public class Screen {

	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.edge.driver","D:\\SubathraSpace\\eclipse-workspace\\Act1\\Driver\\msedgedriver.exe");
		WebDriver dr = new EdgeDriver();
		 dr.manage().window().maximize();
		 dr.get("http://www.flipkart.com");
		 
		
		
		
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * "D:\\SubathraSpace\\eclipse-workspace\\Screenshot\\Driver\\chromedriver.exe")
			 * ; WebDriver dr = new ChromeDriver(); dr.manage().window().maximize();
			 * dr.get("http://www.greenstechnologys.com/");
			 */
		
		TakesScreenshot ts =((TakesScreenshot)dr);
	
		File ss = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("D:\\SS\\test.jpg");
		
	  
		FileUtils.copyFile(ss, dest);
	}
}

