package Testng.Framework;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testClass1 {

	@Test
	public void test1()
	{
		System.out.println("TC1 executed");
	}
	@Test
	public void test2()
	{
		System.out.println("TC2 executed");
	}
	@Test
	public void test3()
	{
		System.out.println("TC3 executed");
	}
	@Test
	public void test4()
	{
		System.out.println("TC4 executed");
	}
	@Test
	public void changes()
	{
		System.out.println("Changes wanna verify on git executed");
	}
	
}
