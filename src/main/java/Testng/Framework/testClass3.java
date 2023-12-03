package Testng.Framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testClass3 {
	
	@AfterSuite
	public void test8()
	{
		System.out.println("Quit Browser");
	}
	@Test
	public void test9()
	{
		System.out.println("T9 executed");
	}
	@BeforeSuite
	public void test10()
	{
		System.out.println("Initializing browser");
	}
}
