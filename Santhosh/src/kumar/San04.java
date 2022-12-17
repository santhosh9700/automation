package kumar;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Ram01.Excel_read;

public class San04 
{
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver","E:\\selenium fiit\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}
@Test(dataProvider="loginData")
public void loginTest(String user, String pwd)
{
	driver.get("https://www.instagram.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	WebElement Email = driver.findElement(By.name("username"));
	Email.sendKeys(user);
	WebElement Pwd = driver.findElement(By.name("password"));
	Pwd.sendKeys(pwd);
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[3]/button/div")).click();
}
	@DataProvider(name="loginData")
	public String [][]getdata() throws IOException
	{
	/*String loginData[][]= {{"admin","admin123","PASS"},
			{"ram","ram123","PASS"}};*/
		String path="E:\\User.xlsx";
		Excel_read utili = new Excel_read(path);
		int totalrows=utili.getRowCount("Data");
		int totalcols=utili.getCellCount("Data",1);
		String loginData[][]=new String[totalrows][totalcols];
		for(int a=1;a<=totalrows;a++) //1
		{
		for(int b=0;b<totalcols;b++) //0
		{
		loginData[a-1][b]=utili.getCellData("Data", a, b);
		}
		}	
	return loginData;
	}
	@AfterClass
	public void teardown()
	{
	//driver.close();
	}
	}
	

