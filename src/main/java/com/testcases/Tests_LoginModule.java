package com.testcases;

import org.testng.annotations.BeforeTest;

import com.testng.base.ProjectSpecificMethods;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/features/Login.feature", glue = {"com.steps.pages"} ,monochrome = true)
public class Tests_LoginModule extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcase = "VerifyLogin";
		testdescription ="Verify Login functionality";
	}
	

}
