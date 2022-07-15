import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/flipkart-elec-end-of-season-sale-store?param=19867736376343&fm=neo%2Fmerchandising&iid=M_5d106a89-f975-483a-8fcf-077acd537a21_1_EM1OLCDXDYHG_MC.8TVKUWT87M16&otracker=hp_rich_navigation_7_1.navigationCard.RICH_NAVIGATION_Electronics_8TVKUWT87M16&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_7_L0_view-all&cid=8TVKUWT87M16");
		/*//driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("._2IX_2-.VJZDxU")).click();
		driver.findElement(By.cssSelector("._2IX_2-.VJZDxU")).sendKeys("9497156798");
		driver.findElement(By.cssSelector("._2IX_2-._3mctLh.VJZDxU")).click();
		driver.findElement(By.cssSelector("._2IX_2-._3mctLh.VJZDxU")).sendKeys("Athira@123");
		driver.findElement(By.cssSelector("._2KpZ6l._2HKlqd._3AWRsL")).click();*/
		
		//driver.findElement(By.linkText("Electronics")).click();
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.className("_2I9KP_"))).build().perform();
		act.moveToElement(driver.findElement(By.partialLinkText("DSLR"))).click().perform();
		//Thread.sleep(6000);
		
		

	}

}
