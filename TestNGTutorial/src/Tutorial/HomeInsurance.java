package Tutorial;

import org.testng.annotations.Test;

public class HomeInsurance {
	@Test(groups= {"Reg"})
	public void WebLogin()
	{
		System.out.println("Home Insurance Web Login");
	}
	@Test(groups= {"Reg"})
	//If priority is not given ,default priority is 0
	public void WebLogout()
	{
		System.out.println("Home Insurance Web LogOut");
		
	}
	@Test(groups= {"Dog"})
	public void MobileLogIn()
	{
		System.out.println("Home Insurance Mobile LogIn");
		
	}
	@Test(groups= {"Dog"})
	public void MobileLogout()
	{
		System.out.println("Home Insurance Mobile LogOut");
		
	}

}
