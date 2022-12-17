package kumar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class San02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium fiit\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		//driver.findElement(By.id("")).click();
		//driver.findElement(By.xpath("")).click();
	}

}