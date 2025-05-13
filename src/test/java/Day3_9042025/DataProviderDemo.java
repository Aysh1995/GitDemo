package Day3_9042025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo 
{
WebDriver Driver;
@BeforeSuite

public void Setup()
{
	Driver=new ChromeDriver();	
	Driver.manage().window().maximize();
	Driver.get("https://www.flipkart.com/");
	Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@DataProvider (name="dataset")
public Object[][]mobileDataSet()

{
Object[][] data=new Object[3][2];

data[0][0] ="oppo";
data[0][1] ="Reno 13";

data[1][0] ="OnePluse";
data[1][1] ="11R";

data[2][0] ="iphone";
data[2][1] ="16";


return data;


}
	
@Test (dataProvider="dataset")
public void Searchmobile(String brand, String model)
{
WebElement Searchbox=Driver.findElement(By.name("q"));
Searchbox.sendKeys(brand+""+ model);
Searchbox.sendKeys(Keys.ENTER);
Searchbox.clear();
}
	
}
