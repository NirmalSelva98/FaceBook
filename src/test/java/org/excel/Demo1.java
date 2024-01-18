package org.excel;



import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Demo1 {
	public static void main(String[]args) throws IOException{
		File f= new File("C:\\Users\\Nirma\\eclipse-workspace\\Javaproject\\Project1\\src\\test\\resources\\Excel\\ExcelRead.xlsx");
		FileInputStream f1=new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet sheet = w.getSheet("Sheet1");
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
	            CellType cellType = cell.getCellType();
	            int cellType = cell.getCellType();
				switch(cellType) {
				case STRING:
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					break; 
					default:
						if(DateUtil.isCellDateFormatted(cell)) {
							Date DateCellValue = cell.getDateCellValue();
		SimpleDateFormat sd = new SimpleDateFormat("dd/mm/yyy")		;
			String format = sd.format(DateCellValue);
		System.out.println(format);
		break;
						}
						else {
							double numericCellValue = cell.getNumericCellValue();
							//long l=(long)numericCellValue;
							//System.out.println(l);
		BigDecimal Valueof= BigDecimal.valueOf(numericCellValue)	;
		String string= Valueof.toString();
		System.out.println(string);
		break;
						}
			}	
		}

	}
}
}
