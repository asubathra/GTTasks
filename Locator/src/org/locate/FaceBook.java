package org.locate;



public class FaceBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","D:\\SubathraSpace\\eclipse-workspace\\Locate\\Driver");
		WebDriver dr = new EdgeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("http://www.facebook.com/");
		
		WebElement emailText = dr.findElement(By)
		
		
		WebElement PassTxt = dr.findElement(By.name("pass"));
		
		PassTxt.sendKeys("98y098m");
		
		WebElement loginButn = dr.findElement(By.class("login"));
	
	loginButn.click();
	
	}
	

}