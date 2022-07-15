package Tutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsPgm {
	@BeforeSuite
	public void BSM()
	{
		System.out.println("before suit-first");
	}
	@BeforeTest
	public void BTM()
	{
		System.out.println("before Test-first");
	}
	@BeforeClass
	public void BCM()
	{
		System.out.println("before Class-first");
	}
	@BeforeMethod
	public void BMM()
	{
		System.out.println("before Method-first");
	}
	@Test
	public void WebLogin()
	{
		System.out.println("Annotation Web Login");
	}
	@Test
	public void WebLogout()
	{
		System.out.println("Annotation Web LogOut");
		
	}
	@Test(groups= {"smk"})
	public void MobileLogIn()
	{
		System.out.println("Annotation Mobile LogIn");
		
	}
	@Test(groups= {"smk"})
	public void MobileLogout()
	{
		System.out.println("Annotation Mobile LogOut");
		
	}
	@AfterMethod
	public void AMM()
	{
		System.out.println("After Method-first");
	}
	@AfterClass
	public void ACM()
	{
		System.out.println("After Class-last");
	}
	@AfterTest
	public void ATM()
	{
		System.out.println("After Test-lastst");
	}
	@AfterSuite
	public void ASM()
	{
		System.out.println("After suit-last");
	}

}
