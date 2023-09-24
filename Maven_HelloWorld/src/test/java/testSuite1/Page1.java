package testSuite1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Page1 {

	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This is before method in mod1");
	}
	@Test(priority = 1)
	public void test001()
	{
		System.out.println(" Mod1 I am executing testcase 001");
	}
	@Test(dependsOnMethods = {"test001"})
	
	public void test002()
	{
		System.out.println(" Mod1 I am executing testcase 002");
	}
	@Test(priority = 2)
	public void test003()
	{
		System.out.println("Mod1 I am executing testcase 003");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This is after method in mod1");
	}
	
}
