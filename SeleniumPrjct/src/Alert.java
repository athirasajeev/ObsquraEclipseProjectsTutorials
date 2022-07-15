import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.findElement(By.xpath("//button[@id='runbtn']")).click();
		//IFRAME
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
		//Thread.sleep(2000);
		//ALERT
		String a=driver.switchTo().alert().getText();
		System.out.println(a);
		driver.switchTo().alert().accept();
		//Thread.sleep(2000);		
		
		//commit

	}

}
