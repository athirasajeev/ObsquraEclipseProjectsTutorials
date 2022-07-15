import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.findElement(By.id("runbtn")).click();
		//IFRAME
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		//Thread.sleep(2000);
		//Exit from IFRAME and click on go to website button
		driver.findElement(By.id("getwebsitebtn")).click();
		//driver.switchTo().alert().sendKeys("Selenium");
		//Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		//driver.switchTo().defaultContent();
		//alert print
		//String almsg=driver.switchTo().alert().getText();
		//System.out.println(almsg);
		
		//Thread.sleep(5000);
		//hai

	}

}
