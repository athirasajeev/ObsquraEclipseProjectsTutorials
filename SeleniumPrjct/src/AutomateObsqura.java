import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateObsqura {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.findElement(By.xpath("//a[@href='simple-form-demo.php']")).click();
		//Simple Form Demo
		driver.findElement(By.xpath("//a[@href='simple-form-demo.php']")).click();
		driver.findElement(By.id("single-input-field")).click();
		driver.findElement(By.className("form-control")).sendKeys("Hai Welcome");
		driver.findElement(By.id("button-one")).click();
		//ASSERTION
		String exp="Your Message : Hai Welcome";
		String actual=driver.findElement(By.id("message-one")).getText();
		System.out.println(actual);
		//HARD ASSERT
		Assert.assertEquals(actual,exp);//actual //expected
		System.out.println("Assertion passed");
		driver.findElement(By.id("value-a")).click();
		driver.findElement(By.id("value-a")).sendKeys("5");
		driver.findElement(By.id("value-b")).click();
		driver.findElement(By.id("value-b")).sendKeys("5");
		driver.findElement(By.id("button-two")).click();
		//Thread.sleep(3000);
		//ASSERTION
				String expr="Total A + B : 10";
				String actualr=driver.findElement(By.id("message-two")).getText();
				System.out.println(actualr);
				//HARD ASSERT
				Assert.assertEquals(actualr,expr);//actual //expected
				System.out.println("Assertion passed");
		//Checkbox Demo
		driver.findElement(By.linkText("Checkbox Demo")).click();
		driver.findElement(By.className("form-check-input")).click();
	//SOFT ASSERT
		SoftAssert sassert=new SoftAssert();
		String chechexp="Success - Check box is checked";
		String checkact=driver.findElement(By.id("message-one")).getText();
		//sys
		sassert.assertEquals(true, false);
		System.out.println("Assert is failed but i got executed");
		
		/*	//ASSERTION
				String expc="Success - Check box is checked";
				String actualc=driver.findElement(By.id("message-one")).getText();
				System.out.println(actualc);
				//HARD ASSERT
				Assert.assertEquals(actualc,expc);//actual //expected
				System.out.println("Assertion passed");*/
		driver.findElement(By.id("button-two")).click();
		
		//Radio Buttons Demo
		driver.findElement(By.xpath("//a[@href='radio-button-demo.php']")).click();
		driver.findElement(By.className("form-check-label")).click();
		driver.findElement(By.id("button-one")).click();
		//ASSERTION
		String exprm="Radio button 'Male' is checked";
		String actualrm=driver.findElement(By.id("message-one")).getText();
		System.out.println(actualrm);
		//HARD ASSERT
		Assert.assertEquals(actualrm,exprm);//actual //expected
		System.out.println("Assertion passed");		
        driver.findElement(By.id("button-two")).click();
		driver.findElement(By.cssSelector("label[for='inlineRadio2']")).click();
		driver.findElement(By.id("button-one")).click();
		//ASSERTION
				String exprf="Radio button 'Female' is checked";
				String actualrf=driver.findElement(By.id("message-one")).getText();
				System.out.println(actualrf);
				//HARD ASSERT
				Assert.assertEquals(actualrf,exprf);//actual //expected
				System.out.println("Assertion passed");
		driver.findElement(By.cssSelector("label[for='inlineRadio11']")).click();
		driver.findElement(By.cssSelector("label[for='inlineRadio23']")).click();
		driver.findElement(By.id("button-two")).click();
	/*	//ASSERTION
				String expra="Gender : Male  Age group: 19 to 44";
				String actualra=driver.findElement(By.id("message-two")).getText();
				System.out.println(actualra);
				//HARD ASSERT
				Assert.assertEquals(actualra,expra);//actual //expected
				System.out.println("Assertion passed");
	*/	
		
		//Select Input
				driver.findElement(By.partialLinkText("Select Input")).click();
				//static drop down list(select class object)
				WebElement st = driver.findElement(By.id("single-input-field"));//Taking the address of drop down list
				st.click();
				Select dropdown=new Select(st);
				dropdown.selectByValue("Red");
				driver.findElement(By.id("message-one")).click();
				//ASSERTION
				String exprr="Selected Color : Red";
				String actualrr=driver.findElement(By.id("message-one")).getText();
				System.out.println(actualrr);
				//HARD ASSERT
				Assert.assertEquals(actualrr,exprr);//actual //expected
				System.out.println("Assertion passed");
				dropdown.selectByVisibleText("Green");
				driver.findElement(By.id("message-one")).click();
				//ASSERTION
				String exprg="Selected Color : Green";
				String actualrg=driver.findElement(By.id("message-one")).getText();
				System.out.println(actualrg);
				//HARD ASSERT
				Assert.assertEquals(actualrg,exprg);//actual //expected
				System.out.println("Assertion passed");
				
				//driver.findElement(By.id("button-first")).click();
				
				
		/*		//ASSERTION
				String expy="First selected color is : Yellow";
				String actualy=driver.findElement(By.id("message-two")).getText();
				System.out.println(actualy);
				//HARD ASSERT
				Assert.assertEquals(actualy,expy);//actual //expected
				System.out.println("Assertion passed");
				
				driver.findElement(By.id("button-all")).click();
				driver.findElement(By.cssSelector("option[value='Red']")).click();
				driver.findElement(By.cssSelector("option[value='Yellow']")).click();
				driver.findElement(By.cssSelector("option[value='Green']")).click();
				driver.findElement(By.id("button-first")).click();
				//ASSERTION
				String expra="First selected color is : Red";
				String actualra=driver.findElement(By.id("message-two")).getText();
				System.out.println(actualra);
				//HARD ASSERT
				Assert.assertEquals(actualra,expra);//actual //expected
				System.out.println("Assertion passed");*/
				
				
				
		//Form Submit
		driver.findElement(By.xpath("//a[@href='form-submit.php']")).click();
		//driver.findElement(By.partialLinkText("Form")).click();
		driver.findElement(By.className("form-control")).click();
		driver.findElement(By.id("validationCustom01")).sendKeys("ATHIRA");
		driver.findElement(By.cssSelector(".form-control")).click();
		driver.findElement(By.id("validationCustom02")).sendKeys("SAJEEV");
		driver.findElement(By.cssSelector("#validationCustomUsername")).click();
		driver.findElement(By.id("validationCustomUsername")).sendKeys("AthiraK");
		driver.findElement(By.cssSelector("#validationCustom03")).click();
		driver.findElement(By.id("validationCustom03")).sendKeys("MUVATTUPUZHA");
		driver.findElement(By.cssSelector("#validationCustom04")).click();
		driver.findElement(By.id("validationCustom04")).sendKeys("KERALA");
		driver.findElement(By.cssSelector("#validationCustom05")).click();
		driver.findElement(By.id("validationCustom05")).sendKeys("90210");
		driver.findElement(By.cssSelector(".form-check-input")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		//ASSERTION
		String exprs="Form has been submitted successfully!";
		String actualrs=driver.findElement(By.id("message-one")).getText();
		System.out.println(actualrs);
		//HARD ASSERT
		Assert.assertEquals(actualrs,exprs);//actual //expected
		System.out.println("Assertion passed");
		
		
		
		

	}

}
