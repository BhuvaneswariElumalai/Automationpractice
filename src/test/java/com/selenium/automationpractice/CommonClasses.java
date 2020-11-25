package com.selenium.automationpractice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class CommonClasses {
	
	
	@BeforeSuite
	public void SetUp(){
		System.out.println("Running Before Suite");
	}
	
	@AfterSuite
	public void CleanUp(){
		System.out.println("Running After Suite");
	}

	@BeforeTest
	public void beforeTest(){
		System.out.println("Running Before Test");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("Running After Test");
	}
	
}
