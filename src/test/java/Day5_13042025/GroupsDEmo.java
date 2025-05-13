package Day5_13042025;

import org.testng.annotations.Test;

public class GroupsDEmo
{
	@Test (groups= {"smoke"})
	public void test1()
	{
		System.out.println("Test case 1 {\"smoke\"}" );
		
	}

	@Test(groups= {"sanity"})
	public void test2()
	{
		System.out.println("Test case 2{\"sanity\"}");
		
	}

	@Test (groups= {"smoke","sanity"})
	public void test3()
	{
		System.out.println("Test case 3{\"smoke\",\"sanity\"}");
		
	}

	@Test(groups= {"Regresstion"})
	public void test4()
	{
		System.out.println("Test case 4{\"Regresstion\"}");
		
	}

	@Test (groups= {"smoke","Regression"})
	public void test5()
	{
		System.out.println("Test case 5{\"smoke\",\"Regression\"}");
		
	}

	@Test (groups= {"sanity","Regression"})
	public void test6()
	{
		System.out.println("Test case 6 {\"sanity\",\"Regression\"}");
		
	}

	@Test (groups= {"smoke","sanity","Regression"})
	public void test7()
	{
		System.out.println("Test case 7{\"smoke\",\"sanity\",\"Regression\"}");
		
	}

	@Test (groups= {"Intigration"})
	public void test8()
	{
		System.out.println("Test case 8{\"Intigration\"}");
		
	}

	@Test  (groups= {"Retesting"})
	public void test9()
	{
		System.out.println("Test case 9{\"Retesting\"}");
		
	}


}
