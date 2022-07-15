package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderPGM {
	@Test(dataProvider="getlogin")
	public void SwagLagsLogin(String Username,String Password)
	{
		//System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver.exe");
		WebDriver driver= WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		//WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).sendKeys(Username);
		//String value=driver.findElement(By.id("user-name")).getText();
		System.out.println(Username);
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("login-button")).click();
		
		//ASSERTION		
			if(Username=="locked_out_user")	{
			String exp="Epic sadface: Sorry, this user has been locked out.";
			String actual=driver.findElement(By.cssSelector(".error-message-container.error")).getText();
			//System.out.println(actual);
			//HARD ASSERT
			Assert.assertEquals(actual,exp);//actual //expected
			System.out.println("Assertion passed");
		}

	}
	@DataProvider
	public Object[][] getlogin()
	{
		Object[][] data=new Object[4][2];
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";
		data[1][0]="locked_out_user";
		data[1][1]="secret_sauce";
		data[2][0]="problem_user";
		data[2][1]="secret_sauce";
		data[3][0]="performance_glitch_user";
		data[3][1]="secret_sauce";
		return data;
	}

}
