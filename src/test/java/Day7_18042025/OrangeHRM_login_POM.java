package Day7_18042025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM_login_POM 
{
	WebDriver driver;	
	public  OrangeHRM_login_POM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//repository
	By username=By.name("username");
	By pass=By.name("password");
	By loginbtn=By.xpath("//button[@type='submit']");
	
	public void url() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}
	
	public void EnterUsername(String string)
	{
	driver.findElement(username).sendKeys("Admin");	
	
	}
	
	public void Enterpass(String string)
	{
	driver.findElement(pass).sendKeys("admin123");
	
	}
	
	public void Clickloginbtn()
	{
	driver.findElement(loginbtn).click();
	
	}
	
	
}
