package Screenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class screenshot1 
{
public static void screenShot(WebDriver driver, String filename) {
TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
try {
FileUtils.copyFile(source, new
File(System.getProperty("user.dir")+"\\ScreenShot\\"+filename+".png"));
} catch (Exception e) {
// TODO Auto-generated catch block
e.getMessage();
}
}
}