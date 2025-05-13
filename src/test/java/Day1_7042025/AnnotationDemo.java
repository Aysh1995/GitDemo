package Day1_7042025;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo 


{
	@BeforeSuite
	public void beforeSuiteMethod()
	{
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void beforetestMethod()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void beforeclassMethod()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforemethodMethod()
	{
		System.out.println("Before Method");
	}
	@Test

	public void test1()
	{
		System.out.println("Test1");
	}


	@Test

	public void test2()
	{
		System.out.println("Test2");
	}

	@AfterMethod
	public void AftermethodMethod()
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void AfterclassMethod()
	{
		System.out.println("After Class");
	}
	@AfterTest

	public void AftertestMethod()
	{
		System.out.println("After Test");
	}
	@AfterSuite

	public void AfterSuiteMethod()
	{
		System.out.println("After Suite");
	}
 
	
	
	
	
	
	
	
}
