package Utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Utilities.ConfigReader;

public class ExcelRead 
{
	XSSFWorkbook wbook=null;
	XSSFSheet ws=null;
	public ExcelRead()
	{
		ConfigReader reader= new ConfigReader();
	try
	{
	File src=new File(reader.getExcelpath());
	FileInputStream fis=new FileInputStream(src);
	wbook= new XSSFWorkbook(fis);
	
	}
	catch(Exception e)
	{
		e.getMessage();
		System.out.print("Unable to read excel data");
	}
}

	public String getStringDataCellvalue(String sheetName,int row,int col)
	{
		
		 ws=wbook.getSheet(sheetName);
		String data= ws.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	public String getStringDataCellvalue(int sheetindex,int row,int col)
	{
		
		 ws=wbook.getSheetAt(sheetindex);
		String data= ws.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	
	public double getintDataCellvalue(String sheetName,int row,int col)
	{
		
		 ws=wbook.getSheet(sheetName);
		double data= ws.getRow(row).getCell(col).getNumericCellValue();
		return data;
	}
	public int getrowcount(String sheetname)
	{
		 int rowcount=wbook.getSheet(sheetname).getLastRowNum();
		 rowcount=rowcount+1;
		 return rowcount;
	}
	public int getcolcount(String sheetname)
	{
		int colcount=wbook.getSheet(sheetname).getRow(0).getLastCellNum();
		 
		 return colcount;
		 
		
	}
	}

