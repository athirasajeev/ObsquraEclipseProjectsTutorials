import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fprogram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		//Web Page is Opened in Google Chrome
		//Old way to initiate browsers
		//System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		//New way to initiate browsers
		WebDriver driver=WebDriverManager.edgedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Web Page is Opened in MS Edge
		//System.setProperty("webdriver.edge.driver","E:\\drivers\\msedgedriver.exe");
        //EdgeDriver driver=new EdgeDriver();	
		//Web Page is Opened in Mozilla Firefox
		//System.setProperty("webdriver.gecko.driver","E:\\drivers\\geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
	    driver.get("https://selenium.obsqurazone.com/index.php");
		driver.navigate().to("https://selenium.obsqurazone.com/index.php");
		//Thread.sleep(5000);
		driver.navigate().refresh();
		//Thread.sleep(5000);
		driver.navigate().back();
		//Thread.sleep(5000);
		driver.navigate().forward();
		String title=driver.getTitle();
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		System.out.println(driver.getPageSource());
		System.out.println(title);
		
		
		//driver.close();
		//driver.quit();

	}

	private static String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

}
