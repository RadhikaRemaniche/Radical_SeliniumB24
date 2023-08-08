package advanced;

import java.io.IOException;

public class MyPrintDataFromExcel {

	public static void main(String[] args) throws IOException {
		MyReadExcelUtility excelUtility = new MyReadExcelUtility("src/advanced/login_demo.xlsx",0);
		
		int totalRows = excelUtility.getLastRowNum();
		int totalCols= excelUtility.getLastColNum();
		String cellData=null;
		for(int i=0;i<totalRows ; i++) {
			for(int j=0;j<totalCols ;j++ ) {
				
				cellData=excelUtility.getCellValue(0, i, j);//0 is sheetnum , i is rownum, j is colnum
				System.out.println("Data is " +cellData);
			}
		}
	}

}
