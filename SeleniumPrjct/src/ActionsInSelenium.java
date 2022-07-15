import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsInSelenium {

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/");// TO GET ADDRESS
		driver.findElement(By.id("txtUsername")).click();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//ACTIONS--->MOUSE HOVER
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.cssSelector(".firstLevelMenu"))).build().perform();
		act.moveToElement(driver.findElement(By.id("menu_admin_UserManagement"))).perform();
		//WE CAN DO THE STEP IN ONE LINE INSTEAD OF USING THE perform() FUNCTION MULTIPLE TIMES
		//act.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule"))).
		//moveToElement(driver.findElement(By.id("menu_admin_UserManagement"))).perform();
		act.moveToElement(driver.findElement(By.id("menu_admin_viewSystemUsers"))).click().perform();
		//Thread.sleep(3000);
		//commit
		
		
		
		

		}

}
