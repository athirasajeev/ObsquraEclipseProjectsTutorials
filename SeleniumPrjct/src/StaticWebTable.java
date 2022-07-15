import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		//Static WebTable
		List<WebElement> allheader= driver.findElements(By.xpath("//table[@id='dtBasicExample']/thead/tr/th"));
	      System.out.println(allheader.size());
	      boolean status=false;
	      //System.out.println("Total Rows found: "+alltr.size());
	      for(WebElement row:allheader)
	      {
	    	  String value=row.getText();
	    	  System.out.println(value);
	    	  if(value.contains("Name"))
	    	  {
	         status=true;
	         break;
	         
	    	  }
	      }
			/*
			 * List<WebElement> allRows= driver.findElements(By.xpath("//table/tbody/tr"));
			 * 
			 * for(int i=1;i<=allRows.size();i++) { WebElement
			 * nameColumn=driver.findElement(By.xpath(
			 * "(//table[@id='dtBasicExample']/thead/tr/th)[1]"));
			 * if(nameColumn.getText().toLowerCase().equalsIgnoreCase("Garrett Winters")) {
			 * WebElement tableColumns=driver.findElement(By.xpath("//table/tbody/tr"));
			 * System.out.println(tableColumns.getText()); } }
			 */
	      
	}
}
