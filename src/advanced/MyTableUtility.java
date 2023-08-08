package advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyTableUtility {
	
	public String getTableCellText(WebDriver driver, String col1, String col2, String col1_Item ) {
		List<WebElement> allColNamesElements= driver.findElements(By.xpath("//table/thead/tr/th"));
		int totalNumOfColumns = allColNamesElements.size();
		
		System.out.println("total columns = "+totalNumOfColumns);
		int col1Position = 0;
		for(int i= 1;i<=totalNumOfColumns;i++) {
			String colName = driver.findElement(By.xpath("//table/thead/tr/th["+i+"]")).getText();
			if(col1.equals(colName)) {
				col1Position = i ;
				break;
			}
		}
		System.out.println("column 1 position is = "+col1Position);
		
		int col2Positiong = 0;
		for(int i= 1;i<=totalNumOfColumns;i++) {
			String colName = driver.findElement(By.xpath("//table/thead/tr/th["+i+"]")).getText();
			if(col2.equals(colName)) {
				col2Positiong = i ;
				break;
			}
		}
		System.out.println("column 2 position is = "+col2Positiong);
		
		List<WebElement> allItemsfromcol1 = driver.findElements(By.xpath("//table/tbody/tr"));
		int totalRows = allItemsfromcol1.size();
		int rowPostion = 0;
		for(int i= 1;i<=totalRows;i++) {
			String actuValue = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+col1Position+"]")).getText();
			if(col1_Item.equals(actuValue)) {
				rowPostion = i;
				break;
			}
		}
		System.out.println("Row position is = "+rowPostion);
		
		String returnPerIs = driver.findElement(By.xpath("//table/tbody/tr["+rowPostion+"]/td["+col2Positiong+"]")).getText();
		System.out.println(col2 + " of "+col1_Item +"is = "+returnPerIs);
		return returnPerIs;
	}

}
