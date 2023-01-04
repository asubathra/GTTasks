package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SubathraSpace\\eclipse-workspace\\WebTable\\driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement table = dr.findElement(By.xpath("//table[@id='customers']"));
		
		
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		for (int i = 0; i < allRows.size(); i++) {
			WebElement itrRow = allRows.get(i);

		List<>
		
			
		WebElement fourthRow = allRows.get(4);
		
		List<WebElement> fourthRowAllDatas = fourthRow.findElements(By.tagName("td"));
		WebElement firstData = fourthRowAllDatas.get(1);
		String text = firstData.getText();
		System.out.println(text);
		
	}
}
