package com.tng.ohrm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OhrmDP {

	@DataProvider
	public Object[][] genEmpData() throws FileNotFoundException, IOException {
		// first dimension : number of iterations
		// second dimension: number of parameters		
		
		String flPath = "C:\\Users\\skakunuri\\Desktop\\Notes\\Data\\Ohrm.xlsx";
		Workbook wb = null;
		if(flPath.endsWith(".xlsx")) {
			 wb = new XSSFWorkbook(new FileInputStream(flPath));
		}else if(flPath.endsWith(".xls")){
			wb = new HSSFWorkbook(new FileInputStream(flPath));
		}
		
		Sheet sht = wb.getSheet("Sheet1");

		int rc = sht.getLastRowNum();
		int cc = sht.getRow(0).getLastCellNum();
		
		Object[][] tData = new Object[rc][1];
		
		
		for(int r=1;r<=rc;r++) {
			HashMap<String, String> rMap = new HashMap<>();
			for(int c=0;c<cc;c++) {
				String kName =sht.getRow(0).getCell(c,MissingCellPolicy.CREATE_NULL_AS_BLANK).toString();
				String kVal =sht.getRow(r).getCell(c,MissingCellPolicy.CREATE_NULL_AS_BLANK).toString();
				rMap.put(kName, kVal);
			}
			tData[r-1][0]=rMap;
		}
		
		wb.close();

		
		return tData;
	}
}
