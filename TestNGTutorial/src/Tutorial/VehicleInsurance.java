package Tutorial;

import org.testng.annotations.Test;

public class VehicleInsurance {
	@Test(priority=1,groups= {"Reg"})
	public void WebLogin()
	{
		System.out.println("Vehicle Insurance Web Login");
	}
	@Test(groups= {"Reg"})
	//If priority is not given ,default priority is 0
	public void WebLogout()
	{
		System.out.println("Vehicle Insurance Web LogOut");
		
	}
	@Test(groups= {"Dog"})
	public void MobileLogIn()
	{
		System.out.println("Vehicle Insurance Mobile LogIn");
		
	}
	@Test(priority=-4,groups= {"Dog"})
	public void MobileLogout()
	{
		System.out.println("Vehicle Insurance Mobile LogOut");
		
	}
	

}
