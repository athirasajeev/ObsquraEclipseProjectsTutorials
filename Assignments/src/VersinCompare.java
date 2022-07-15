import java.util.Scanner;
public class VersinCompare {
	public static int compareFunction(String v1,String v2) 
	{
		int vn1 = 0, vn2 = 0; 
		int v1l=v1.length();
		System.out.println(v1l);
		int v2l=v2.length();
        // loop until both String are processed
        for (int i = 0, j = 0; (i < v1l|| j < v2l);) 
        {
            // Storing numeric part of
            // version 1 in vn1
            while (i < v1.length()&& v1.charAt(i) != '.')
            {
                vn1 = vn1 * 10+ (v1.charAt(i) - '0');
                i++;
            }
 
            // storing numeric part
            // of version 2 in vn2
            while (j < v2.length()&& v2.charAt(j) != '.')
            {
                vn2 = vn2 * 10+ (v2.charAt(j) - '0');
                j++;
            }
 
            if (vn1 > vn2)
                return 1;
            if (vn2 > vn1)
                return -1;
 
            // if equal, reset variables and
            // go for next numeric part
            vn1 = vn2 = 0;
            i++;
            j++;
        }
        return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String v1,v2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First version     :");
		v1=s.nextLine();
		System.out.println("Enter Second version     :");
		v2=s.nextLine();
		int res=compareFunction(v1,v2);
		if ( res<0)
            System.out.println(v2 +" is Latest Version");
        else if (res>0)
            System.out.println(v1 + " is Latest Version");
        else
            System.out.println("Both versions are equal");

	}

}
