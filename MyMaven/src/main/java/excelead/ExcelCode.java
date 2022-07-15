package excelead;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	static FileInputStream f;//FIleInputStream is class
	static XSSFWorkbook w;
	static XSSFSheet s;
	public static String readStringData(int row,int col) throws IOException
	{
		f=new FileInputStream("C:\\Users\\user.PC010422\\Desktop\\Book1.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		Row r=s.getRow(row);//Row Is interface
		Cell c=r.getCell(col);
		return c.getStringCellValue();
	}
	public static String readIntegerData(int row,int col) throws IOException
	{
		f=new FileInputStream("C:\\Users\\user.PC010422\\Desktop\\Book1.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		Row r=s.getRow(row);//Row Is interface
		Cell c=r.getCell(col);
		int v=(int) c.getNumericCellValue();
		return String.valueOf(v);
	}
	
}
