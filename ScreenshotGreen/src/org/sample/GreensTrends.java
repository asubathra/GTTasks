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

public class GreensTrends {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\SubathraSpace\\eclipse-workspace\\ScreenshotGreen\\Driver\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	System.out.println("Testing");

	dr.manage().window().maximize();
	 dr.get(" http://greenstech.in/selenium-course-content.html");
	 
	 JavascriptExecutor js = (JavascriptExecutor)dr;
	 
	 WebElement Scr = dr.findElement(By.xpath("(//h3[@class='mb-0'])[12]"));
	 
	 js.executeScript("arguments[0].scrollIntoView(true)",Scr);
	 
	 TakesScreenshot ts = ((TakesScreenshot)dr);
	 
	 File ssc = ts.getScreenshotAs(OutputType.FILE);
	 
	 File desc = new File("D:\\SubathraSpace\\eclipse-workspace\\ScreenshotGreen\\ScreenshotGreenTech\\textTrend.png");
	 
	 
	 FileUtils.copyFile(ssc,desc);
	 
}
}

