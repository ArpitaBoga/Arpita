import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMtehodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Automation_Practical\\\\Software\\\\Chrome\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//1. to open the url we need to use get method
		driver.get("https://www.amazon.in/");
		
		//3. to get the title of current opened url we can use get title method
		String title = driver.getTitle();
		System.out.println(title);
		
		//4. to get the currently opened url we can use get current url method
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//5. to get the source code of opened url we can use this method get page source
		String source = driver.getPageSource();
		System.out.println(source);
		
		
		//2. to close the current opened URl we need to use close method
		driver.close();
		
		//6. to close the all the opened url we need to use quit method
		driver.quit();
	}

}
