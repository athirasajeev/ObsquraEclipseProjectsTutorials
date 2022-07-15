package package2;

import accesspackage.FirstClass;

public class ChildClass extends FirstClass {

	public static void main(String[] args) {
		ChildClass ob=new ChildClass();
		ob.protectMethod();
		ob.publicMethod();
		//ob.privateMethod();
		//ob.defaultMethod();
		// TODO Auto-generated method stub

	}

}
