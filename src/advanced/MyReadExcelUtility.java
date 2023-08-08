package advanced;

import java.io.IOException;

import org.apache.poi.hslf.dev.SlideAndNotesAtomListing;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyReadExcelUtility {
	XSSFWorkbook wb = null;
	XSSFSheet sheet = null;
	String xlPathString = null;
	
	
	public MyReadExcelUtility(String xlPathString, int sheetNum) throws IOException {
		// refering to excel sheet in eclipse
	//	XSSFWorkbook wb = new XSSFWorkbook("src/advanced/login_demo.xlsx",0);
		XSSFWorkbook wb = new XSSFWorkbook(xlPathString);
		//get the sheet num like sheet 1 index is 0 so  the sheet num will always be on 0th position
		sheet = wb.getSheetAt(sheetNum);
	}
	
	
	public String getCellValue(int sheetNumber, int rowNum, int colNum) {
		String cellValue =null;
		try{
			cellValue=sheet.getRow(rowNum).getCell(colNum).toString();
	}catch (Exception e) {
		System.out.println("Value is " +cellValue);
	}
		System.out.println("Value is : " + cellValue);
		return cellValue;				

	}


	public int getLastRowNum() {
		return sheet.getLastRowNum();
	}

	
	public int getLastColNum() {
		return sheet.getRow(0).getLastCellNum();
	}

}

/*
 * 2nd way of writing the program or to find all the exteries in xcel XSSFSheet
 * sheet = wb.getSheetAt(0);
 * 
 * 
 * 
 * //iterate row for(Row row : sheet) { //iterate cell in each row for(Cell cell
 * : row) { //get cell value and print it CellType celltype =
 * cell.getCellType(); if(celltype == CellType.STRING ) {
 * System.out.println(cell.getStringCellValue()); }else if(celltype==
 * CellType.NUMERIC) { System.out.println(cell.getNumericCellValue()); }else
 * if(celltype== CellType.BOOLEAN) {
 * System.out.println(cell.getBooleanCellValue()); } }System.out.println(); } }
 * 
 * }
 */
// String cellValue = sheet.getRow(1).getCell(0).toString();
// System.out.println();
