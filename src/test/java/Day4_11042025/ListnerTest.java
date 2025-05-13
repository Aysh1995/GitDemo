package Day4_11042025;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerTest implements ITestListener 
{
	public void onTestStart(ITestResult result)
	      {
		    System.out.println("new test execution started:"+result.getName());
		  }

	public void onTestSuccess(ITestResult result) 
	       {
		 System.out.println("on test case is passed:"+result.getName());
		  }

      public void onTestFailure(ITestResult result) 
         {
    	  System.out.println("On test case is passed:"+result.getName());
		  }

		public  void onTestSkipped(ITestResult result) 
		  {
			 System.out.println("on test case is skipped:"+result.getName());
		  }

		 public void onTestFailedButWithinSuccessPercentage(ITestResult result)
		  {
		    // not implemented
		  }

		  public void onTestFailedWithTimeout(ITestResult result) 
		  {
		    onTestFailure(result);
		  }

		  
		  public void onStart(ITestContext context)
		  {
			  System.out.println("verify starting point of execution:");
		  }

		  	public void onFinish(ITestContext context) 
		  		  {
		  		 System.out.println("execution end");
		  }

	
}
