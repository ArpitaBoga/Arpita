import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Automation_Practical\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		//to fetch the columns from the table we will use the below code
		 
		List<WebElement> columns= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		int size=columns.size();
		System.out.println("total number of columns are"+size);
		for(int i=0;i<size;i++)
		{
			String columnName=columns.get(i).getText();
			System.out.println(columnName);
			if(columnName.equalsIgnoreCase("company"))
			{
				System.out.println("We have the column name as per requirement");
			}
		}
		
		//to fetch the all the rows from the table we will use the below code
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		int size1 = rows.size();
		System.out.println("Total no. of rows are "+size1);
		
		 for(int j=0;j<size1;j++)
			 {
				 String rowName=rows.get(j).getText();
				 System.out.println(rowName);
			 }
		
 // to fetch the cell data we  will use the below code
		 WebElement cellData = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[6]/td[2]"));
		 System.out.println(cellData.getText());
		

	}

}
