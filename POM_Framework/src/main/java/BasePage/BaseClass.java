package BasePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Pages.Homepage;
import Pages.LoginPage;

public class BaseClass {
public static WebDriver driver;
public LoginPage loginpage;
Homepage homepage;

@BeforeMethod
public void setup()
{
System.setProperty("webdriver.chrome.driver","E:\\selenium fiit\\chromedriver_win32\\chromedriver.exe");

driver=new ChromeDriver();
driver.manage().window().maximize(); //Maximizes the browser window
driver.get("https://www.saucedemo.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
loginpage = new LoginPage();
}
@AfterMethod
public void teardown()
{
driver.close();
}
}

