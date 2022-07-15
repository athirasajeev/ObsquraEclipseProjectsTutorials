package Tutorial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterInTestNg {
	@Parameters({"Uname","pwd","URL"})
	@Test
	public void pgm(String Username,String Password,String link)
	{
		System.out.println(Username);
		System.out.println(Password);
		System.out.println(link);


	}
	//For Gitbash commit

}
