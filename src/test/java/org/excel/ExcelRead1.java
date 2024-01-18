package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {
	public static void main(String[]args) throws IOException{
		File f= new File("C:\\Users\\Nirma\\eclipse-workspace\\Javaproject\\Project1\\src\\test\\resources\\Excel\\ExcelRead.xlsx");
		FileInputStream f1=new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet sheet = w.getSheet("Sheet1");
		for(int i=0;i<=sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(i);
			for(int j=0;j<=sheet.getPhysicalNumberOfRows();j++) {
				Cell cell = row.getCell(i);
			System.out.println(cell.getStringCellValue());
		}
}
}
	
}