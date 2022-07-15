package excelead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelInsCode {
	public XSSFSheet s;
	public ExcelInsCode() throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\\\Users\\\\user.PC010422\\\\Desktop\\\\Book1.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
	}
public String readData(int i,int j)
{
	Row r=s.getRow(i);
	Cell c=r.getCell(j);
	int celltype=c.getCellType();
	switch(celltype)
	{
	case Cell.CELL_TYPE_NUMERIC:
	{
		double a=c.getNumericCellValue();
		return String.valueOf(a);
	}
	case Cell.CELL_TYPE_STRING:
	{
		return c.getStringCellValue();
	}
	}
	return null;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
