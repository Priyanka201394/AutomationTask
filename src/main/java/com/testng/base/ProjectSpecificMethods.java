package com.testng.base;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.selenium.basemethods.BaseMethods;

public class ProjectSpecificMethods extends BaseMethods{
	
	@Parameters({"browser"})
	@BeforeMethod
	public void initiateApp(String browser) {
		startApp(browser, websiteUrl , headlessBrowser);
		
	}
	
	@AfterMethod
	public void closeApp() {
		quit();
	}

}
