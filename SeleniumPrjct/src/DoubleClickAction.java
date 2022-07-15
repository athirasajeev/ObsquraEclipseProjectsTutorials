import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");

		// DOUBLE CLICK
		Actions action = new Actions(driver);
		WebElement dclick = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		action.doubleClick(dclick).perform();
		// ALERT
		String alertmsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(alertmsg);
		// RIGHT CLICK
		Actions ract = new Actions(driver);
		WebElement rclick = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		ract.contextClick(rclick).perform();
		Thread.sleep(2000);

	}

}
