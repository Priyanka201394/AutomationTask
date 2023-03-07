package com.steps.pages;


import org.testng.Assert;

import com.testng.base.ProjectSpecificMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethods {
	
	
	@Given("Enter the invalid email")
	public LoginPage enterUserName() {
		clearAndType(locateElement("id","username"), usermail);
		reportStep("The username "+usermail+ " is entered","Pass");
		return this;	
	}
	
	
	
	@Given("Enter the invalid password")
	public LoginPage enterPassword() {
		clearAndType(locateElement("id","password"), password);
		reportStep("The username "+password+ " is entered","Pass");
		return this;	
	}
	
	@When("Click on the login")
	public LoginPage clickLogin() {
		click(locateElement("id","loginbutton"));
		reportStep("The login button is clicked","Pass");
		return this;
	}
	
	@Given("The user clicks on the Forgot Password link")
	public ForgotPassword forgotPwdLink() {
		click(locateElement("id","forgotpasswordlink"));
		reportStep("The login button is clicked","Pass");
		return new ForgotPassword();
	}
		
	
	@Given("The login page should display error with fail status")
	public LoginPage userCredentialsCheck() {
		boolean verifyPartialText = verifyPartialText(locateElement("id","errormessage"),"Invalid username or password");
		reportStep("The error message is obatined when invalid credentials are provided","Pass");
		Assert.assertTrue(verifyPartialText);
		return this;
	}
	
	

}
