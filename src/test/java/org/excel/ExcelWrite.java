package org.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[]args) throws IOException{
		File f= new File("C:\\Users\\Nirma\\eclipse-workspace\\Javaproject\\Project1\\src\\test\\resources\\Excel\\ExcelWrite.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.createSheet();
		Row row = sheet.createRow(0);
		Cell Createcell = row.createCell(0);
		Createcell.setCellValue("selenium");
		FileOutputStream f1 = new FileOutputStream(f);
		w.write(f1);
	}
}
