import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		
		
		
		//To find the element by using id locators firstly we need to create reference variable of WebElement interface and need to use below syntax
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.id("u_0_b"));
		
		
		//sendkeys method is used to enter the value in textbox
		
		username.sendKeys("pareshrana7@gmail.com");
		password.sendKeys("Paresh123");
		
		//click method is sued to click on any button, radio button checkbox or link
		login.click();
		

	}

}
