package excelead;

import java.io.IOException;

public class ExcelInsMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelInsCode ob=new ExcelInsCode();
		String a=ob.readData(0,0);
		System.out.println("Value Of a Is   "+a);
		String b=ob.readData(0,1);
		System.out.println("Value Of b Is   "+b);
		System.out.println("Updated");

	}

}
