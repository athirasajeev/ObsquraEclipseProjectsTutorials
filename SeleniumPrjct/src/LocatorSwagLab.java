import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorSwagLab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Thread.sleep(3000);
		//Locators id,name,Class name,Xpath
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		//driver.findElement(By.className("input_error form_input")).click();
		//format---->//tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@type='password']")).click();
		//driver.findElement(By.name("password")).sendKeys("secret_sauce");
		//CSS Selector
		//format---->tagname[attribute='value']
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();
		//Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Facebook")).click();
		//Thread.sleep(2000);
		/*driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//Locators Linked text
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(3000);*/
		

	}

}
