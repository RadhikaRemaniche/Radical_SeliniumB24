package advanced;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTableGridAuto {
	
	@Test(groups = { "adv" })
	public void testAlert() throws InterruptedException {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		
		EdgeDriver driver = new EdgeDriver(options);
		driver.get("https://money.rediff.com/mutual-funds/liquid");
		driver.manage().window().maximize();
		
		String col1 = "Company";
		String col2 = "Returns(%)";
		String col1_Item = "Tata Asset Management Ltd.";
		
		MyTableUtility table = new MyTableUtility();
		String value1=   table.getTableCellText(driver, col1, col2, col1_Item);
		Assert.assertEquals("7.04", value1);
		
		
		String col11 = "Company";
		String col22 = "Plan";
		String col_Item11 = "HDFC Asset Management Company Ltd.";
		String value2=   table.getTableCellText(driver, col11, col22, col_Item11);
		Assert.assertEquals("Growth", value2);
		
	}
 
}