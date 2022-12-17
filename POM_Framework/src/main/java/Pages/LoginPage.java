package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BasePage.BaseClass;
public class LoginPage extends BaseClass
{
@FindBy(id="user-name")
WebElement uname;
@FindBy(name="password")
WebElement pass;
@FindBy(id="login-button")
WebElement loginbutn;
public LoginPage() //Use Same Class Name
{
//this method will create web elements
PageFactory.initElements(driver, this);
}
public Homepage login(String Email, String Pwd)
{
uname.sendKeys(Email);
pass.sendKeys(Pwd);
loginbutn.click();
return new Homepage();
}
}