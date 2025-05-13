package Day2_8042025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangeHRM_Annotation 
{
	WebDriver Driver;

	@BeforeSuite
	public void Setup()
	{
		Driver=new ChromeDriver();	
		Driver.manage().window().maximize();
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test (priority=1)
	public void Login()
	{
		Driver.findElement(By.name("username")).sendKeys("Admin");
		Driver.findElement(By.name("password")).sendKeys("admin123");
		Driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test (priority=2)
	public void VerifyHomepage()
	{
	String dash= Driver.findElement(By.xpath("//div[@id='app']/descendant::h6")).getText();
	if(dash.equals("Dashboard"))
	{
		System.out.println("TC-Passed");
	}
	else
	{
		System.out.println("TC-Failed");

	}
	
	}

	@Test (priority=3)
		public void logout() throws InterruptedException
	{
		Driver.findElement(By.className("oxd-userdropdown-name")).click();
		Driver.findElement(By.xpath("//ul[@role='menu']/child::li[4]/child::a")).click();
		Thread.sleep(5000);
	}
	@AfterSuite
	public void teardowm()
	{
		Driver.close();
	}	
}
