import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("username")).sendKeys("Arpita");
			driver.findElement(By.id("password")).sendKeys("Arpita@123");
			driver.findElement(By.id("login")).click();
	}

}
