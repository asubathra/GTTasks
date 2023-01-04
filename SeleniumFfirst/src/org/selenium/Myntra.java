package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Myntra {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\SubathraSpace\\eclipse-workspace\\SeleniumFfirst\\Driver\\msedgedriver.exe");
		WebDriver d= new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		d.findElement(By.xpath("//input[@type='tel']")).sendKeys("8838015449");
		d.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
		}
	}
