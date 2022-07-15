
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ATHIRA";
		int n=s.length();
		String rev="";
		for(int i=n-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("String Before Conversion  "+s);
		System.out.println("String After Conversion  "+rev);

	}

}
