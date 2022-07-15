package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	//POM Without Page Object Factory
	WebDriver driver;
	By username=By.id("user-name");
	By password=By.cssSelector("input[placeholder*='Pass']");
	By loginbtn=By.cssSelector("#login-button");
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement uname()
	{
		return driver.findElement(username);
	}
	public WebElement pswd()
	{
		return driver.findElement(password);
	}
	public WebElement loginbutton()
	{
		return driver.findElement(loginbtn);
	}

}
