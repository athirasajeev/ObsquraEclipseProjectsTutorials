import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=WebDriverManager.edgedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://selenium.obsqurazone.com/index.php");
		//Locator Link text to open another window identified using <a> tag
		//Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Input")).click();
		
		//Thread.sleep(3000);
		//Locators Class name
		driver.findElement(By.className("form-control")).click();
		driver.findElement(By.id("single-input-field")).sendKeys("Selenium");
		driver.findElement(By.id("button-one")).click();
		//Thread.sleep(3000);
		

	}

}
