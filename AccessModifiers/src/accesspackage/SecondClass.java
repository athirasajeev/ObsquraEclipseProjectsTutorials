package accesspackage;

public class SecondClass extends FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondClass ob=new SecondClass();
	//	ob.privateMethod();
		ob.protectMethod();
		ob.publicMethod();
		ob.defaultMethod();
	}

}
