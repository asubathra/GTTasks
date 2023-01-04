package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo1 extends BaseClass {
public void LoginPojo1()  {
	PageFactory.initElements(driver,this);
}
@CacheLookup
@FindBy(id="email")
private WebElement emailTxt;
@CacheLookup
@FindBy(name="pass")
private WebElement passTxt;
@CacheLookup
@FindBy(id="u_0_5_ym")
private WebElement loginBtn;
@CacheLookup
@FindBy(xpath=("//button[@type='submit']"))
private WebElement submitBtn;
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
