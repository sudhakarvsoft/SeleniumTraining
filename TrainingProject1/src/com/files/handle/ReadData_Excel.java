package com.files.handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_Excel {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// hssf: horrible spread sheet format : xls
		// xssf: xml spread sheet format : xlsx

		String flPath = "C:\\Users\\skakunuri\\Desktop\\Notes\\Data\\Ohrm.xlsx";
		Workbook wb = null;

		if (flPath.endsWith(".xlsx")) {
			wb = new XSSFWorkbook(new FileInputStream(flPath));
		} else if (flPath.endsWith(".xls")) {
			wb = new HSSFWorkbook(new FileInputStream(flPath));
		}

		Sheet sht = wb.getSheet("Sheet1");

		int rc = sht.getLastRowNum();
		int cc = sht.getRow(0).getLastCellNum();

		for (int r = 0; r <= rc; r++) {
			for (int c = 0; c < cc; c++) {
				String dt = sht.getRow(r).getCell(c, MissingCellPolicy.CREATE_NULL_AS_BLANK).toString();
				System.out.println(dt);
			}
		}

		wb.close();
	}

}
