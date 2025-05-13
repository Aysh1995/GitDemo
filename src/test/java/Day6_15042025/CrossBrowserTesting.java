package Day6_15042025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting 

{
	WebDriver driver;
	@Parameters("Browser")
	@Test (priority=0)
	public void launchbrowser (String Browser)
    
	{
    if (Browser.equalsIgnoreCase("chrome"))
    {
    	driver=new ChromeDriver();
    }
    
    
    else if(Browser.equalsIgnoreCase("edge"))
    {
    	driver=new EdgeDriver();
    }
    
    
    else if(Browser.equalsIgnoreCase("firefox"))
    {
    	driver=new FirefoxDriver();
    
    }
		
	}
	
    @Test(priority=1)
    public void login()
    {
    	driver.get("https://www.facebook.com/");
    }
	}
    
	

