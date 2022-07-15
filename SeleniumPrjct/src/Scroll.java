import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.selenium.dev/");
		//Scrolling In 3 Ways
		//Page Bottom
		//Particular Element
		//Page(X,Y)
		JavascriptExecutor jscript=(JavascriptExecutor)driver;
		//jscript.executeScript("window.scrollBy(0,250)");
		
		//Particular Element
		//WebElement link=driver.findElement(By.xpath("(//a[@href='/blog'])[2]"));
		//jscript.executeScript("arguments[0].scrollIntoView;",link);	
		//Page Bottom
		jscript.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);

	}

}
