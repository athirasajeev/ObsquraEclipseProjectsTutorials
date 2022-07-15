import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver_win32");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		
		

	}

}
 