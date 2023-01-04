package org.sample;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\SubathraSpace\\eclipse-workspace\\Hidden\\Driver\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();

	dr.manage().window().maximize();
	 dr.get("");

	 JavascriptExecutor js = (JavascriptExecutor)dr;
}
}
