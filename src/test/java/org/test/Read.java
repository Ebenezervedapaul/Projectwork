package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	public static void main(String[] args) throws IOException  {
		File f = new File("E:\\Selenium\\SampleMaven\\Datas\\Sample.xlsx");
		FileInputStream inp = new FileInputStream(f);
		Workbook w=new XSSFWorkbook(inp);
		org.apache.poi.ss.usermodel.Sheet sh = w.getSheet("Sheet1");
	
	   		Row r = sh.getRow(1);
		   	Cell c = r.getCell(2);
	   	System.out.println(c);			
	}
}
