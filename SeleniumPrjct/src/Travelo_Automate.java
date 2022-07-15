import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Travelo_Automate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.travolook.in/");//TO GET ADDRESS

		driver.findElement(By.id("flying_from_N")).click();//CLICK FROM PLACE
		driver.findElement(By.id("flying_from")).sendKeys("tri"); 
		//Thread.sleep(3000);
		//LIST OF FROM AIRPORTS
		List<WebElement> choices = driver.findElements(By.xpath("//li[@class='ac_odd']"));
		for (WebElement option : choices) {
			if (option.getText().contains("TRV-Thiruvananthapuram Airport")) {
				option.click();
				break;
			}
		}
		driver.findElement(By.id("flying_to_N")).click();//CLICK TO PLACE TEXT BOX
		driver.findElement(By.id("flying_to")).sendKeys("del");
		//LIST OF TO AIRPORTS
		List<WebElement> choicest = driver.findElements(By.xpath("//li[@class='ac_odd']"));
		for (WebElement optiont : choicest) {
			if (optiont.getText().contains("DEL-Indira Gandhi International Airport")) {
				optiont.click();
				break;
			}
		}

		// date selection
		driver.findElement(By.id("Fly_depdate_val")).click();// DEPARTURE DATE
		driver.findElement(By.linkText("24")).click();
		//driver.findElement(By.id("Fly_retdate_val")).click();// RETURN DATE
		//driver.findElement(By.linkText("24")).click();
		driver.findElement(By.xpath("//big[@id='travel_id']")).click();// TRAVELLERS DETAILS TEXT BOX
		driver.findElement(By.xpath("//input[@id='sub1plus']")).click();// TO ADD ADULTS NUMBER
		// TO ADD TWO CHILDRENS BY PRESSING PLUS BUTTON
		for (int i = 0; i < 2; i++) {
			driver.findElement(By.xpath("//input[@id='sub2plus']")).click();

		}
	

		// FIRST CLASS SELECTION
		WebElement st = driver.findElement(By.xpath("//select[@name='ddlCabinClass']"));// Taking the address of drop
																						// down list
		st.click();
		Select dropdown = new Select(st);
		dropdown.selectByIndex(1);
		driver.findElement(By.linkText("Done")).click();//DONE BUTTON
		driver.findElement(By.id("searchengine_btn")).click();// SEARCH BUTTON
		
		//SORT AND PRINT CHEAPEST FLIGHT
		String amount=driver.findElement(By.xpath("//div[@class='resultwaybx div_outbound']/div/div/div")).getText();
		System.out.println(amount);
		//driver.findElement(By.name("Vistara")).getText();

		Thread.sleep(6000);
		//Hai Its to check git commit

	}

}
