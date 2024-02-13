import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=WebDriverManager.firefoxdriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.findElement(By.xpath("(//span[@role='textbox'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("In");
		String a="Wyoming";
		//Thread.sleep(5000);
		List<WebElement> choices=driver.findElements(By.xpath("//li[@role='option']"));
		for(WebElement option:choices)
		{
			if(option.getText().equalsIgnoreCase("Wyoming"))
			{
				option.click();
				break;
			}
		}
		String b=driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[1]")).getText();
		Assert.assertEquals(b, a);
		//Thread.sleep(5000);		
		//MULTIPLE OPTIONS SELECTION
		driver.findElement(By.cssSelector(".select2-search__field")).click();
		//Thread.sleep(5000);	
		List<WebElement> choicem=driver.findElements(By.xpath("//li[@role='option']"));
		for(WebElement optionm:choicem)
		{
			if(optionm.getText().equalsIgnoreCase("Alaska"))
			{
				optionm.click();
				break;
			}
		}
		driver.findElement(By.cssSelector(".select2-search__field")).click();
		Thread.sleep(5000);	
		List<WebElement> choicem1=driver.findElements(By.xpath("//li[@role='option']"));
		for(WebElement optionm1:choicem1)
		{
			if(optionm1.getText().equalsIgnoreCase("hawaii"))
			{
				optionm1.click();
				break;
			}
		}
		driver.findElement(By.cssSelector(".select2-search__field")).click();
		//Thread.sleep(5000);	
		List<WebElement> choicem2=driver.findElements(By.xpath("//li[@role='option']"));
		for(WebElement optionm2:choicem2)
		{
			if(optionm2.getText().equalsIgnoreCase("California"))
			{
				optionm2.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".select2-selection__choice__remove")).click();
		driver.findElement(By.cssSelector(".select2-selection__choice__remove")).click();
		driver.findElement(By.cssSelector(".select2-selection__choice__remove")).click();

		//DESELECT VALUES USING deselect() method
		
		//Thread.sleep(3000);
		//Commit
		}

}
 