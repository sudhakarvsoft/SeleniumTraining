package com.files.handle;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData_Excel {

	public static void main(String[] args) throws IOException {
		
		Workbook wb = new XSSFWorkbook();
		Sheet sht = wb.createSheet("demo");
		
		Row hr = sht.createRow(0);
		hr.createCell(0).setCellValue("SN");
		hr.createCell(1).setCellValue("empName");
		hr.createCell(2).setCellValue("age");
		
		Row r1 = sht.createRow(1);
		r1.createCell(0).setCellValue("1");
		r1.createCell(1).setCellValue("sudhakar");
		r1.createCell(2).setCellValue("33");
		
		String flPath = "C:\\Users\\skakunuri\\Desktop\\Notes\\Data\\OutPut.xlsx";
		FileOutputStream fs = new FileOutputStream(flPath);
		
		wb.write(fs);
		wb.close();
		
	}

}





