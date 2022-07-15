import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		//driver.findElement(By.linkText("Try it Yourself »")).click();
		//driver.findElement(By.xpath("//button[@id='runbtn']")).click();
		WebElement source= driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	    WebElement target= driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source,target).perform();
		
		//Thread.sleep(6000);
		
		
		
		
		

	}

}
