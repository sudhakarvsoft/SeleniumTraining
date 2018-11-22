package com.files.handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateData_Excel {

	public static void main(String[] args) throws IOException {
		String flPath = "C:\\Users\\envy\\Desktop\\June11\\Data\\OutPut.xlsx";
		Workbook wb = new XSSFWorkbook(new FileInputStream(flPath));
		Sheet sht = wb.getSheet("demo");
		
		Row r2 = sht.createRow(2);
		r2.createCell(0).setCellValue("2");
		r2.createCell(1).setCellValue("selenium");
		r2.createCell(2).setCellValue("12");
		
		
		FileOutputStream fs = new FileOutputStream(flPath);
		
		wb.write(fs);
		wb.close();
		
	}

}





