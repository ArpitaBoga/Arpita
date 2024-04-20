import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndClearMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Automation_Practical\\\\Software\\\\Chrome\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("paresh");
		
		//To clear the populated text in texbox we need to use clear method
		username.clear();
		
		WebElement text = driver.findElement(By.tagName("h1"));
		
		//to fetch the value of perticular elements we can use gettext method
		String value = text.getText();
		System.out.println(value);
		

	}

}
