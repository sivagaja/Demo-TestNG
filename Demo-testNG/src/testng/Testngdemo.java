package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	
	@Test
	public void f()
	{
		System.out.println("Review 1");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("HReview 2");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Review 3");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Review 4");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("Review 5");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Review 6");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("Review 7");
	}
}
