package com.selenium.automationpractice;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TestNG_Class1 extends CommonClasses{

	TestNGFunctions obj = new TestNGFunctions();
	SoftAssert sa = new SoftAssert();

	@BeforeMethod
	public void beforeMethod1(){
		System.out.println("Running -->beforeMethod1");
	}
	
	
	
	@AfterMethod
	public void afterMethod1(){
		System.out.println("Running -->afterMethod1");
	}
	
	@BeforeClass(alwaysRun = true)
	public void beforeClass1(){
		System.out.println("Running -->beforeClass1");
	}
		
	@AfterClass(alwaysRun = true)
	public void afterClass1(){
		System.out.println("Running -->afterClass1");
	}
		
	
	@Test(timeOut=100)
	public void testMethod1() throws InterruptedException {

		System.out.println("Running -->testMethod1 ");
		int result = obj.sumMethod(1, 2);
		System.out.println(result);
		/*sa.assertEquals(result, 4);
		sa.assertEquals(result, 3);
		System.out.println("Pass");
		sa.assertAll();*/
		Thread.sleep(300);
	}

	@Test
	public void testMethod2() {

		System.out.println("Running -->testMethod2");
		String expectedResult = "Hello W orld";
		String result = obj.addStrings("Hello", "World");
		System.out.println(result);
		Assert.assertEquals(result,expectedResult );

	}

	@Test
	public void testMethod3() {

		System.out.println("Running -->testMethod3 ");
		int[] expectedResult = {1,2,3};
		int[] result = obj.arrayDisplay();
		sa.assertEquals(result, expectedResult);

	}
}
