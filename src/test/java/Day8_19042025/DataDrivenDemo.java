package Day8_19042025;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Day7_18042025.OrangeHRM_login_POM;
import Day7_18042025.OrangeHRM_logout_Pom;	

@Test
public class DataDrivenDemo 

{
	public void ExecutionMethod() throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		OrangeHRM_login_POM li=new OrangeHRM_login_POM (driver);
		OrangeHRM_logout_Pom lo=new OrangeHRM_logout_Pom (driver);
		
		li.url();
		Thread.sleep(5000);
		
		String filepath="E:\\Growskill-IT\\DataDiven\\DataDriven.xlsx";
		FileInputStream fs=new FileInputStream (filepath);
		
		XSSFWorkbook WB=new XSSFWorkbook (fs);
		XSSFSheet Sheet=WB.getSheet("Data");
		
		int rows=Sheet.getLastRowNum();
		System.out.println("Total No of Rows:"+rows);
		
		for(int i=1;i<=rows;i++)
		{
			XSSFRow row=Sheet.getRow(i);
			XSSFCell Usernm=row.getCell(0);
			XSSFCell pass=row.createCell(1);
			System.out.println("UserName:---" +Usernm+            "Password:---"+pass);
			try
			{
			li.EnterUsername(Usernm.toString());
			li.Enterpass(pass.toString());
			li.Clickloginbtn();
			lo.ClickonProfile();
			lo.ClickLogOut();
			System.out.println("valid data");
			}
			
			catch (Exception e)
			{
				System.out.println("Invalid data");
					
			}
			
			
		}
		fs.close();
		
	}	
	

}
