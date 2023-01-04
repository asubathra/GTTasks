package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
  public static WebDriver driver;
  public static void browserLaunch(String launch) {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();	 
	}
  public static void launchUrl(String Url) {
	driver.get(Url);
}
  public static void getThePageTitle() {
	String title = driver.getTitle();
	System.out.println(title);
}
  public static void getUrl() {
	String currenturl = driver.getCurrentUrl();
	System.out.println(currenturl);
}
  public static void emailtxt(WebElement txtEle,String txt) {
	txtEle.sendKeys(txt);
}
  public static void passtxt(WebElement passEle,String txt) {
		passEle.sendKeys(txt);
	}
 public static void click(WebElement btnTxt) {
	 btnTxt.click();
}
 public static void closeTheBrowser() {
	System.out.println("close the Browser");

}
}
