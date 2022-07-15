package accesspackage;

public class FirstClass {
	public int a=80;
	protected int b=20;
	private int c=30;
	int d=10;
	public void publicMethod()
	{
		System.out.println("Public Method");
	}
	protected void protectMethod()
	{
		System.out.println("Protect Method");
	}
	private void privateMethod()
	{
		System.out.println("Private Method");
	}
	void defaultMethod()
	{
		System.out.println("Default Method");
	}
	/*public static void main(String[] args) {
		FirstClass ob=new FirstClass();
		ob.privateMethod();
		ob.protectMethod();
		ob.publicMethod();
		ob.defaultMethod();
		// TODO Auto-generated method stub

	}*/

}
