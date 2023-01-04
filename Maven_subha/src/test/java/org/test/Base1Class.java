package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base1Class {
public static WebDriver driver;


public static void browserLaunch(String browserName) {
	if(browserName.equals("Chrome")) {
      WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
}
	else if (browserName.equals("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		}
	else if (browserName.equals("Edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		}
	driver.manage().window().maximize();
}
    public static void launchUrl(String Url) {
	driver.get(Url);
}
	 public static void getThePageTitle() {
		String title = driver.getTitle();
		System.out.println(title);		
	}
	public static void getTheUrl() {
	     String	currentUrl = driver.getCurrentUrl();
	     System.out.println(currentUrl);
	 }
	public static void passtext(WebElement txtElement,String txt) {
		txtElement.sendKeys(txt);
	}
  public static void clickElement(WebElement btn) {
		btn.click();
	}
 public static void takeScreenshot(String imgName) throws IOException {
	TakesScreenshot ts =(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File des = new File("D:\\SubathraSpace\\eclipse-workspace\\Maven_subha\\screenshot\\picture\\"+imgName+".png");
	FileUtils.copyFile(src, des);
}
 public static Actions a;

public static void moveTheCursor(WebElement targetWebElement) {
	a = new Actions(driver);
	a.moveToElement(targetWebElement).perform();
	
}
//public static void dragAndDrop(WebElement src,WebElement des) {
	//a = new Actions(driver);
	//a.dragAndDrop(src, des).perform();
//}
  public.................................................................................................................01
  void closeTheBrowser() {
	
System.out.println("Close The Browser");
}
	}

