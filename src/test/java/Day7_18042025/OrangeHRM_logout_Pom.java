package Day7_18042025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM_logout_Pom 

{
	WebDriver driver;
	public  OrangeHRM_logout_Pom (WebDriver driver)
	
		{
			this.driver=driver;
		}
		
	//repository
	
	By profile=By.className("oxd-userdropdown-name");
	By logout=By.xpath("//ul[@role='menu']/child::li[4]/child::a");
	
	public void ClickonProfile() throws InterruptedException
	{
		driver.findElement(profile).click();
		Thread.sleep(4000);
	}
	public void ClickLogOut()
	{
		driver.findElement(logout).click();
	}
	
	
}


