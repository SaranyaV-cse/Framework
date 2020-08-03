package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Utilities.ConfigReader;

public class ExcelRead 
{
	public  XSSFWorkbook wbook=null;
	public  XSSFSheet ws=null;
	
	
	public ExcelRead()
	{
		ConfigReader reader=new ConfigReader();
	try
	{
	//File src=new File("C:\\Users\\Dycmmryps\\Documents\\GitHub\\Framework\\SeleniumJavaFramework\\TestData\\TestDataInput.xlsx");
	
		File src=new File(reader.getExcelpath());
		
		System.out.print(reader.getExcelpath());
	System.out.print(src);
	
	try {
	FileInputStream fis=new FileInputStream(src);
	
	wbook= new XSSFWorkbook(fis);
	
	}
	catch(IOException ex )
	{
		ex.getMessage();
	}
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

