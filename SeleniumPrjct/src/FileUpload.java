import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.remove.bg/upload");
		driver.findElement(By.cssSelector(".btn.btn-primary.btn-lg")).click();

		
		String path="C:\\Users\\user.PC010422\\desktop\\image1.jpg";
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_C);



		

		
		Thread.sleep(6000);

	}

}
 