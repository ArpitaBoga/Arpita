import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/facebook.html");
			driver.manage().window().maximize();
			
			//1.firstly we need to create object of webdriver wait class
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			
			//2.We will use until method of webdriverwait class to implement the 
			//conditions of expected class
			WebElement username = driver.findElement(By.id("email"));
			wait.until(ExpectedConditions.visibilityOf(username));
			username.sendKeys("Arpita");
			
			WebElement password = driver.findElement(By.id("pass"));
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass")));
			password.sendKeys("Arpita123");
			
			WebElement login = driver.findElement(By.id("u_0_b"));
			wait.until(ExpectedConditions.elementToBeClickable(login));
			login.click();
			
	}

}
