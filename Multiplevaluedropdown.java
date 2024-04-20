import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiplevaluedropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Automation_Practical\\\\Software\\\\Chrome\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select select = new Select(fruits);
		
		// to check the if we can select the multiple value from the dropdown we can us ismultiple
		
		if(select.isMultiple())
		{
			select.selectByIndex(0);
			select.selectByVisibleText("Apple");
			select.selectByValue("orange");
			
		}
		
		//select.deselectByIndex(0);
		//select.deselectByVisibleText("Apple");
		//select.deselectByValue("orange");
		
		select.deselectAll();
		
		
		
	}

}
