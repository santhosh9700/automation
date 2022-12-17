package kumar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class San01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium fiit\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("santhoshkumar.mech97@gmail.com");

	}

}
