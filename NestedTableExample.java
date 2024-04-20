import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/accessing-nested-table.html");
		driver.manage().window().maximize();
		
		List<WebElement> nestedTableRow = driver.findElements(By.xpath("/html/body/center/table/tbody/tr[2]/td[2]/table/tbody/tr"));
		int size = nestedTableRow.size();
		
		for(int i=0;i<size;i++)
		{
			String Value = nestedTableRow.get(i).getText();
			System.out.println(Value);
		}
		
		
	}

}
