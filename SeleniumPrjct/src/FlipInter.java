import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/flipkart-elec-end-of-season-sale-store?param=19867736376343&fm=neo%2Fmerchandising&iid=M_5d106a89-f975-483a-8fcf-077acd537a21_1_EM1OLCDXDYHG_MC.8TVKUWT87M16&otracker=hp_rich_navigation_7_1.navigationCard.RICH_NAVIGATION_Electronics_8TVKUWT87M16&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_7_L0_view-all&cid=8TVKUWT87M16");
		//Actions act=new Actions(driver);
		//act.moveToElement(driver.findElement(By.className("_2I9KP_"))).build().perform();
		//act.moveToElement(driver.findElement(By.partialLinkText("DSLR"))).click().perform();
		driver.findElement(By.cssSelector("._3704LK")).click();
		//TAKING COUNT OF IMG TAG
		List<WebElement> list=driver.findElements(By.xpath("//*[@class='_1AtVbE col-12-12']"));
		System.out.println(list.size());
	  //  driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//div//div//img"));
	}

}
