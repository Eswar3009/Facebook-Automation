package org.stepdefinition;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement email;


	@FindBy(id="pass")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	public WebElement getEmail() {
		return email;
	}
}
