package excelead;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 String s=ExcelCode.readStringData(0, 0);
System.out.println("String Data Is   -"+s);
 String s1=ExcelCode.readIntegerData(1, 0);
 System.out.println("Integer Data Is   -"+s1);
	}

}
