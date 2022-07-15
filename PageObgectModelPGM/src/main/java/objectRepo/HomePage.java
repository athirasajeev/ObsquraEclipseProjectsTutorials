package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//POM with page Object factory
	WebDriver driver;

	//By menubtn=By.cssSelector("#react-burger-menu-btn");
	//By allitems=By.cssSelector("a[id='inventory_sidebar_link']");
	//By about=By.id("about_sidebar_link");
	//By logout=By.linkText("Logout");
	//By reset=By.partialLinkText("Reset");
	//By logo=By.cssSelector(".app_logo ");
	
	@FindBy(css="#react-burger-menu-btn")
	WebElement menubtn;
	
	@FindBy(css="a[id='inventory_sidebar_link']")
	WebElement allitems;
	
	@FindBy(id="about_sidebar_link")
	WebElement about;
	
	@FindBy(linkText="LOGOUT")
	WebElement logout;
	
	@FindBy(partialLinkText="RESET")
	WebElement reset;
	
	@FindBy(css=".app_logo")
	WebElement logo;
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement Hlist()
	{
		return menubtn;
	}
	public WebElement allItemsmeth()
	{
		return allitems;
	}
	public WebElement aboutmeth()
	{
		return about;
	}
	public WebElement logoutmeth()
	{
		return logout;
	}
	public WebElement resetmeth()
	{
		return reset;
	}
	public WebElement Hlogo()
	{
		return logo;
	}
	
	

}
