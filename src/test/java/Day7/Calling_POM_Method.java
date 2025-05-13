package Day7;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Day7_18042025.OrangeHRM_login_POM;
import Day7_18042025.OrangeHRM_logout_Pom;

public class Calling_POM_Method
{

@Test
public void ExecutionMethod() throws InterruptedException
{
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	OrangeHRM_login_POM li=new OrangeHRM_login_POM (driver);
	OrangeHRM_logout_Pom lo=new OrangeHRM_logout_Pom (driver);
	li.url();
	li.EnterUsername("Admin");
	li.Enterpass("admin123");
	li.Clickloginbtn();
	lo.ClickonProfile();
	lo.ClickLogOut();
	
}

}
