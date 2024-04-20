import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEventExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/facebook.html");
			driver.manage().window().maximize();
		
			WebElement un= driver.findElement(By.id("email"));
			WebElement pass=driver.findElement(By.id("pass"));
			
			Actions action = new Actions(driver);
			//1. keydown- it will press the key and dones not release
			action.keyDown(un,Keys.SHIFT).sendKeys("arpita").perform();
			action.keyDown(pass,Keys.SHIFT).sendKeys("arpita").perform();
			
			action.keyDown(Keys.ENTER).perform();
	}

}
