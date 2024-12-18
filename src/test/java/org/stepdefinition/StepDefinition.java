package org.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.reporters.EmailableReporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass { 
	
	@Given("User have to enter the facebook application through chrome browser")
	public void user_have_to_enter_the_facebook_application_through_chrome_browser() {
		 launch();
		   toGetUrl("https://www.facebook.com/");
	}

	@When("User have to enter valid username and valid password")
	public void user_have_to_enter_valid_username_and_valid_password() throws IOException {
		LoginPojo l=new LoginPojo();
		//WebElement txtemail = driver.findElement(By.id("email"));
		WebElement txtemail = l.getEmail();
		txtemail.sendKeys(excelRead("Sheet1", 2, 0));
		
		//WebElement password = driver.findElement(By.id("pass"));
	WebElement password = l.getPassword();
		password.sendKeys(excelRead("Sheet1", 2, 1));
		
	}

	@When("User have to click login button")
	public void user_have_to_click_login_button() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}

	@Then("User reach the valid or invalid credential page")
	public void user_reach_the_valid_or_invalid_credential_page() {
		String url = driver.getCurrentUrl();
		if (url.contains("privacy_mutation_token")) {
			System.out.println("User reached the invalid credential page");
		}
		else {
			System.out.println("User reached the valid credential page");
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
