package org.sample;

public class BaseClass {
public static void main(String[] args) {
	
  public static WebDriver driver;
  
  public static void browserLaunch() {
	  WebDriver.manager.ChromeDriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize()
	  
	  
  }
}
  
