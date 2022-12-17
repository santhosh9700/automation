package kumar;
import static org.testng.AssertJUnit.assertTrue;

import java.io.IOException;

import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v105.io.IO;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Ram01.Excel_read;
public class Datadriven {
WebDriver driver;
@BeforeClass
public void setup()
{
System.setProperty("webdriver.chrome.driver","E:\\selenium fiit\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize(); //Maximizes the browser window
}
@Test(dataProvider="loginData")
public void loginTest(String user, String pwd)
{
//driver.get("https:\\www.facebook.com");
driver.get("https://www.saucedemo.com/");
//WebElement Email = driver.findElement(By.id("email"));
WebElement Email = driver.findElement(By.id("user-name"));
Email.sendKeys(user);
//WebElement Pwd = driver.findElement(By.id("pass"));
WebElement Pwd = driver.findElement(By.id("password"));
Pwd.sendKeys(pwd);
//driver.findElement(By.name("login")).click();
driver.findElement(By.id("login-button")).click();
}
@DataProvider(name="loginData")
public String [][]getdata() throws IOException
{
/*String loginData[][]= {{"admin","admin123","PASS"},
		{"admin","admin123","PASS"}
};*/
	String path="E:\\User.xlsx";
	Excel_read utilis = new Excel_read(path);
	int totalrows=utilis.getRowCount("Data");
	int totalcols=utilis.getCellCount("Data",1);
	String loginData[][]=new String[totalrows][totalcols];
	for(int i=1;i<=totalrows;i++) //1
	{
	for(int j=0;j<totalcols;j++) //0
	{
	loginData[i-1][j]=utilis.getCellData("Data", i, j);
	}
	}
return loginData;
}
@AfterClass
public void teardown()
{
driver.close();
}
}