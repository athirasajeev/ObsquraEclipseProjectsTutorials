import java.util.Scanner;

public class SplitVersionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String v1,v2;
		Scanner s=new Scanner(System.in);
		//Code for first string - split and store
		System.out.println("Enter First version     :");
		v1=s.nextLine();
		String ar1[]=new String[v1.length()];
		String[] version=v1.split("\\.");
		for(int i=0;i<version.length;i++)
		{
			 ar1[i]=version[i]; 
		}
		/*for(int i=0;i<ar1.length-1;i++)
		{
		System.out.print(ar1[i]);
		}
		System.out.println();*/
		
		//Code for second string - split and store
		System.out.println("Enter Second version     :");
		v2=s.nextLine();
		String ar2[]=new String[v2.length()];
		String[] versions=v2.split("\\.");
		for(int i=0;i<versions.length;i++)
		{
			 ar2[i]=versions[i]; 
		}
		/*for(int i=0;i<ar2.length-1;i++)
		{
		System.out.print(ar2[i]);
		}*/
		
		//Comparing strings
		int flag=0;
		for(int i=0;i<ar1.length&&i<ar2.length;i++)
		{
			if(Integer.parseInt(versions[i]) > Integer.parseInt(version[i]))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Latest Version Is "+v1);
		}
		else
		{
			System.out.println("Latest Version Is "+v2);
		}
		
	}

}
