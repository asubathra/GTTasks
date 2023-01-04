package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
public void LogPojo(){
	PageFactory.initElements(driver,this);
}
@FindBy(id="email")
private WebElement emailTxt;

@FindBy(id="pass")
private WebElement passTxt;

@FindBy(id="login")

private WebElement loginBtn;


public WebElement getEmailTxt() {
	return emailTxt;
} 
	public WebElement getPassTxt() {
		return passTxt;
	}
		public WebElement getLoginBtn() {
			return loginBtn;
}
}

