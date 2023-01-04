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

public class Green {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\SubathraSpace\\eclipse-workspace\\Screenshot\\Driver\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	System.out.println("Testing");

	dr.manage().window().maximize();
	 dr.get(" http://toolsqa.com/");
	 
	 JavascriptExecutor js = (JavascriptExecutor)dr;
	 
	 WebElement art = dr.findElement(By.xpath("//a[text()='Latest Articles']"));
	 js.executeScript("arguments[0].scrollIntoView(true)",art);
	 
	 
	TakesScreenshot ts =((TakesScreenshot)dr);
	 
	 File sour = ts.getScreenshotAs(OutputType.FILE);
	 
    File dest = new File("D:\\SubathraSpace\\eclipse-workspace\\ScreenshotGreen\\ScreenshotGreenTech\\recent.jpg");
	 
	FileUtils.copyFile(sour, dest);		 
}
}
