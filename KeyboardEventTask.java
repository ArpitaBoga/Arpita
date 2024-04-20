import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEventTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/text-box");
			driver.manage().window().maximize();
			
			WebElement current = driver.findElement(By.id("currentAddress"));
			WebElement permanent = driver.findElement(By.id("permanentAddress"));
			
			Actions action = new Actions(driver);
			
			//enter the value in current address tab
			current.sendKeys("Pune");
			
			//we will select the all the value from current Address
			action.keyDown(Keys.CONTROL);
			action.sendKeys("a");
			
			//keyup method will use to release to given key
			action.keyUp(Keys.CONTROL);
			action.build().perform();
			
			//now we will copy the entire address
			action.keyDown(Keys.CONTROL);
			action.sendKeys("c");
			action.keyUp(Keys.CONTROL);
			action.build().perform();
			
			// we will switch to the the next element we will use tab key 
			action.sendKeys(Keys.TAB);
			action.build().perform();
			
			//last we will paste the address in permanent address tab
			action.keyDown(Keys.CONTROL);
			action.sendKeys("v");
			action.keyUp(Keys.CONTROL);
			action.build().perform();
			
		
	}

}
