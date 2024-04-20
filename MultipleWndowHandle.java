import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWndowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Automation_Practical\\\\Software\\\\Chrome\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		button.click();
		
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button"));
		button1.click();
		
		Set<String> childwindows = driver.getWindowHandles();
		Iterator<String> i = childwindows.iterator();
		while(i.hasNext())
		{
			String childwindow1 = i.next();
			if(!parentWindow.equalsIgnoreCase(childwindow1))
			{
				driver.switchTo().window(childwindow1);
				if(driver.getTitle().equalsIgnoreCase("Selenium"))
				{
					WebElement download = driver.findElement(By.linkText("Downloads"));
					download.click();
					Thread.sleep(5000);
					driver.close();
				}
				else
				{
					WebElement image = driver.findElement(By.id("enterimg"));
					image.click();
					Thread.sleep(5000);
					driver.close();
				}
				
			}
		}
	
	}

}
