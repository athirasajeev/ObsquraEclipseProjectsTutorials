package POMtestpackage;
import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepo.HomePage;
import objectRepo.LoginPage;
public class Logintest {
	@Test
	public void login() throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		LoginPage pg=new LoginPage(driver);
		pg.uname().click();
		pg.uname().sendKeys("standard_user");
		pg.pswd().click();
		pg.pswd().sendKeys("secret_sauce");
		pg.loginbutton().click();	
		//Assert
		HomePage hp=new HomePage(driver);
		boolean a=hp.Hlist().isDisplayed();
		Assert.assertEquals(a,true);
		System.out.println("Assertion Passed");
		hp.Hlist().click();
		hp.allItemsmeth().click();
		//hp.aboutmeth().click();
		Actions act=new Actions(driver);
		//System.out.println(hp.logoutmeth());
		act.moveToElement(hp.aboutmeth()).build().perform();
		act.moveToElement(hp.logoutmeth()).build().perform();
		act.moveToElement(hp.resetmeth()).build().perform();
		hp.logoutmeth().click();
		Thread.sleep(3000);

	}

	
}
