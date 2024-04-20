import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Automation_Practical\\\\Software\\\\Chrome\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		//getwindowhandle method will store the unique Session id of opened window
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
		button.click();
		
		//it will store the all the opened window after clicking on button
		Set<String> childwindow = driver.getWindowHandles();
		Iterator<String> i = childwindow.iterator();
		while(i.hasNext())
		{
			String childwindow1 = i.next();
			System.out.println(childwindow1);
			if(!parentWindow.equalsIgnoreCase(childwindow1))
			{
				driver.switchTo().window(childwindow1);
				WebElement download = driver.findElement(By.linkText("Downloads"));
				download.click();
			}
		}
		

	}

}
