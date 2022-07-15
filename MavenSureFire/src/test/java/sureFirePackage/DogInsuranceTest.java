package sureFirePackage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DogInsuranceTest {
	@BeforeSuite
	public void BeforeSuitMethod()
	{
		System.out.println("I will run first(BEFORE SUIT)");
	}
	
	@BeforeTest
	public void DBReset()
	{
		System.out.println("First Excecuted(BEFORE TEST)");
	}
	@BeforeClass
	public void BeforeclassMethod()
	{
		System.out.println("I will Excecuted before each class(BEFORE CLASS)");
	}
	@BeforeMethod
	public void BeforeMeth()
	{
		System.out.println("I will be excecuting Before each method (BEFORE METHOD)");
		
	}
	@Test(groups= {"Reg"})
	public void WebLogin()
	{
		System.out.println("Dog Insurance Web Login");
	}
	@Test(groups= {"Reg"})
	//If priority is not given ,default priority is 0
	public void WebLogout()
	{
		System.out.println("Dog Insurance Web LogOut");
		
	}
	@Test(groups= {"smk"})
	public void MobileLogIn()
	{
		System.out.println("Dog Insurance Mobile LogIn");
		
	}
	@Test(groups= {"smk"})
	public void MobileLogout()
	{
		System.out.println("Dog Insurance Mobile LogOut");
		
	}
	@AfterMethod
	public void AfterMeth()
	{
		System.out.println("I will be excecuting after each method (AFTER METHOD)");
		
	}
	@AfterClass
	public void AfterclassMethod()
	{
		System.out.println("Excecuted After Each Class (AFTER CLASS)");
	}
	@AfterTest
	public void ReportGeneration()
	{
		System.out.println("Last Excecuted (AFTER TEST)");
	}
	@AfterSuite
	public void AfterSuitMethod()
	{
		System.out.println("I will run last (AFTER SUITE)");
	}

}
