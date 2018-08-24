package com.cname.core.framework.datalayer;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.cname.core.framework.utils.Global;

public class Excel 
{
	
	public static String getData(String sheetName, int rowNum, int colNum)
	{
		String data = null;;
		try
		{
			FileInputStream fis = new FileInputStream(Global.testDataPath);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			XSSFRow row = sheet.getRow(rowNum);
			XSSFCell cell = row.getCell(colNum);
			data = cell.getStringCellValue();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return data;
	}
	
	public static void setDataToExcel(String sheetName, int rowNum, int colNum, String value)
	{
		try
		{
			FileInputStream fis = new FileInputStream(Global.testDataPath);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			XSSFRow row = sheet.getRow(rowNum);
			XSSFCell cell = row.createCell(colNum);
			cell.setCellType(CellType.STRING);
			cell.setCellValue(value);
			
			FileOutputStream fos = new FileOutputStream(Global.testDataPath);
			workbook.write(fos);
			fos.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	
	public static String[] getAllRowValue(String sheetName, int rowNum)
	{
		String[] data = null;
		try
		{
			FileInputStream fis = new FileInputStream(Global.testDataPath);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			XSSFRow row = sheet.getRow(rowNum);
			int colNum = row.getLastCellNum();
			data = new String[colNum];
			for(int i=0; i<=colNum; i++)
			{
				XSSFCell cell =row.getCell(i);
				data[i]= cell.getStringCellValue();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	
	public static String[] getAllColumnValue(String sheetName, int colNum)
	{
		String[] data = null;
		try
		{
			FileInputStream fis = new FileInputStream(Global.testDataPath);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			int rowNum = sheet.getLastRowNum();
			data = new String[rowNum];
			for(int i=0; i<=rowNum; i++)
			{
				XSSFRow row  = sheet.getRow(i);
				XSSFCell cell = row.getCell(colNum);
				data[i]	=cell.getStringCellValue();
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	
	
}
