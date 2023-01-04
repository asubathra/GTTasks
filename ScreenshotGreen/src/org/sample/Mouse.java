package org.sample;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.edge.driver", "D:\\SubathraSpace\\eclipse-workspace\\Screenshot\\Driver\\msedgedriver.exe");
	WebDriver dr = new EdgeDriver();
	System.out.println("Testing");

	dr.manage().window().maximize();
	 dr.get("https://www.flipkart.com/");

    WebElement close = dr.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
    close.click();
    
    Actions a = new Actions(dr);
    WebElement app= dr.findElement(By.xpath("//div[text()='Appliances']"));
    a.moveToElement(app).perform();
    app.click();
    Thread.sleep(2000);
    
    WebElement women = dr.findElement(By.xpath("//span[text()='Women']"));
    a.moveToElement(women).perform();
    Thread.sleep(1000);
    TakesScreenshot ts = ((TakesScreenshot)dr);
	 
	 File ssc = ts.getScreenshotAs(OutputType.FILE);
	 
	File desc = new File("D:\\SubathraSpace\\eclipse-workspace\\ScreenshotGreen\\ScreenshotGreenTech\\women.png");
	 
	FileUtils.copyFile(ssc,desc); 
     
   
}
}
