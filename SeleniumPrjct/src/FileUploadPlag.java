import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPlag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.grammarly.com/plagiarism-checker");
		JavascriptExecutor jscript=(JavascriptExecutor)driver;
		jscript.executeScript(Window.)
		driver.findElement(By.cssSelector(".btn.btn-primary.btn-lg")).click();


	}

}
