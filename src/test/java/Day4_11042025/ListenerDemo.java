package Day4_11042025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (Day4_11042025.ListnerTest.class)
public class ListenerDemo 
{
@Test
public void login()
{
    
	WebDriver Driver=new ChromeDriver();	
	Driver.manage().window().maximize();
	Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Driver.findElement(By.name("username")).sendKeys("Admin");
	Driver.findElement(By.name("password")).sendKeys("admin123");
	Driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}

@Test
public void testtobeFailed ()
{
	Assert.assertTrue(false);
}



@Test
public void testtobeSkipped () throws Exception
{
throw new Exception("Skipping Delability");
}

}



	

