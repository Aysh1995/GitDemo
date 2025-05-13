package Day9_20042025;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Day7_18042025.OrangeHRM_login_POM;
import Day7_18042025.OrangeHRM_logout_Pom;

public class KeywordDrivenFramework {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		OrangeHRM_login_POM li=new OrangeHRM_login_POM (driver);
		OrangeHRM_logout_Pom lo=new OrangeHRM_logout_Pom (driver);
		

		String filepath="E:\\Growskill-IT\\DataDiven\\DataDriven.xlsx";
		FileInputStream fs=new FileInputStream (filepath);
		
		XSSFWorkbook WB=new XSSFWorkbook (fs);
		XSSFSheet Sheet=WB.getSheet("Keyword");
		
		int rows=Sheet.getLastRowNum();
		System.out.println("Total No of Rows:"+rows);
		
		for(int i=1;i<=rows;i++)
		{
			XSSFRow row=Sheet.getRow(i);
			XSSFCell key=row.getCell(1);
			System.out.println("Keywords:---" +key);
			
			switch(key.toString())
			{
			case "url": li.url();
			System.out.println("url keywords is match");
			break;
			
			
			case "EnterUsername": li.EnterUsername("Admin");
			System.out.println("EnterUsername keywords is match");
			break;

			
			case "Enterpass": li.Enterpass("admin123");
			System.out.println("Enterpass keywords is match");
			break;
			
			
			case "Clickloginbtn": li.Clickloginbtn();
			System.out.println("Clickloginbtn keywords is match");
			break;
			
			case "ClickonProfile": lo.ClickonProfile();
			System.out.println("ClickonProfile keywords is match");
			break;
			
			case "ClickLogOut": lo.ClickLogOut();
			System.out.println("ClickLogOut keywords is match");
			break;
			
			default: System.out.println("Invalid keywords");
			}
	
	}

		fs.close();	
	}
}
