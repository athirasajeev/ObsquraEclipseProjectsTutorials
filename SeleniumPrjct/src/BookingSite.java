import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookingSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=WebDriverManager.chromedriver().create();
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.booking.com/index.en-gb.html?aid=304142&label=gen173nr-1DCAEoggI46AdIM1gEaGyIAQGYAQm4ARfIAQzYAQPoAQGIAgGoAgO4Auef-JIGwAIB0gIkMDA2NzU4MzUtYjZiOC00MWVkLWFiYjYtODg3MTQ0NjE0OWI52AIE4AIB&sid=bb5137322a9d15da86d74a546c48f17a&keep_landing=1&sb_price_type=total&");		
		driver.findElement(By.cssSelector("a[rel='nofollow']")).click();//flights
		driver.findElement(By.xpath("//div[@data-testid='searchbox_controller_trip_type_ONEWAY']")).click();//one way
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).click();//where to
		driver.findElement(By.xpath("//input[@class='css-1tl2oa1']")).sendKeys("DEL");
		//String a="Delhi";
		//Thread.sleep(3000);
		List<WebElement> choices=driver.findElements(By.xpath("//li/div/div/div/div/span"));
		//Thread.sleep(2000);
		for(WebElement option:choices)
		{
			if(option.getText().contains("Delhi International Airport"))
			{
				option.click();
				break;
			}
		}
		
		//Calendar
		driver.findElement(By.cssSelector(".css-qqvbcw")).click();
		driver.findElement(By.xpath("//input[@placeholder='Depart']")).click();	
		//driver.findElement(By.xpath("//td[@aria-current='date']")).click();//for current day date
		driver.findElement(By.xpath("//td[@data-date='2022-06-11']")).click();
		driver.findElement(By.cssSelector(".css-ya5gr9.wide")).click();
		
		//Thread.sleep(6000);
		//System.out.println("Complete");
		
	}

}
