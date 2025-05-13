package Day3_9042025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class parent
{
	WebDriver Driver;
	@Test 
	
    public void Setup()
    {
		Driver=new ChromeDriver();	
		Driver.manage().window().maximize();
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
	
}

public class DependencyMethod extends parent
{
	@Test (dependsOnMethods="Setup")
	public void Login()
	{
		Driver.findElement(By.name("username")).sendKeys("Admin");
		Driver.findElement(By.name("password")).sendKeys("admin123");
		Driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
