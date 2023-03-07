package com.steps.pages;

import org.testng.Assert;

import com.testng.base.ProjectSpecificMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ForgotPassword extends ProjectSpecificMethods {

	@When("Enter the invalid email in forgotPassword page")
	public ForgotPassword invalidEmailForgotPwdPage() {
		clearAndType(locateElement("name","emailAddress"), usermail);
		reportStep("The username "+usermail+ " is entered","Pass");
		return this;	
	}
	
	@Given("Enter the invalid confirm email in forgotPassword page")
	public ForgotPassword invalidConfirmEmailForgotPwdPage() {
		clearAndType(locateElement("name","emailAddressConfirm"), usermail);
		reportStep("The username "+usermail+ " is entered","Pass");
		return this;	
	}
	@Given("The user clicks on the Reset Password link")
	public ForgotPassword ResetPwdLink() {
		click(locateElement("xpath","//input[@value=\"Reset Password\"]"));
		reportStep("The login button is clicked","Pass");
		return this;
	}
	@Given("The forgot page should display error with fail status")
	public ForgotPassword forgotPAssword() {
		boolean verifyPartialText = verifyPartialText(locateElement("id","errormessage"),"does not exist");
		reportStep("The error message is obatined when invalid credentials are provided","Pass");
		Assert.assertEquals(verifyPartialText, true);
		return this;
	}
}
