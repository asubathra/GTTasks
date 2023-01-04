package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Content {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","D:\\SubathraSpace\\eclipse-workspace\\WebTable\\driver\\msedgedriver.exe");
	WebDriver dr = new EdgeDriver();
dr.manage().window().maximize();
dr.get("http://demo.guru99.com/test/write-xpath-table.html");

WebElement table = dr.findElement(By.xpath("//table[@border='l']"));
String text = table.getText();
System.out.println(text);


}
}
