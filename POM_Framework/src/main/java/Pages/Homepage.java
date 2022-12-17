package Pages;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BasePage.BaseClass;
public class Homepage extends BaseClass
{
@FindBy(name="add-to-cart-sauce-labs-backpack")
WebElement prod1;
@FindBy(name="add-to-cart-sauce-labs-onesie")
WebElement prod2;
@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
WebElement cart;
public Homepage()
{
PageFactory.initElements(driver, this);
}
public systempage add_products()
{
prod1.click();
prod2.click();
cart.click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
return new systempage();
}
}
