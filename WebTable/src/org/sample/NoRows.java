package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NoRows {
	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","D:\\SubathraSpace\\eclipse-workspace\\WebTable\\driver\\msedgedriver.exe");
	WebDriver dr = new EdgeDriver();
	dr.manage().window().maximize();
	dr.get("http://demo.guru99.com/test/write-xpath-table.html");

	WebElement table = dr.findElement(By.xpath("//body[@aria-hidden='false']"));
	 List<WebElement> totalRows = table.findElements(By.tagName("script"));
	  
	
		//WebElement findRows = allDatas.get(i);
		//String text = findRows.getText();
	System.out.println("Total no of Rows:"+ totalRows.size());
	 }
}
