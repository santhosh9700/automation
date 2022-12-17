package TestCases;

import org.testng.annotations.Test;

import java.time.Duration;

import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import BasePage.BaseClass;
import Pages.Homepage;
import Pages.LoginPage;
import Screenshot.screenshot1;
public class Test_Login extends BaseClass
{
Homepage homepage;


@Test(priority=1)
public void LoginTest()
{
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
homepage=loginpage.login("standard_user","secret_sauce");
String expectdURL="https://www.saucedemo.com/inventory.html";
String actualURL=driver.getCurrentUrl();
AssertJUnit.assertEquals(actualURL, expectdURL);
screenshot1.screenShot(driver, "LoginTest");
}
}