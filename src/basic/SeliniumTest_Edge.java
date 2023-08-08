package basic;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeliniumTest_Edge {
	@Test(groups = { "basic" })
	public void testCase1()
	{
		
		EdgeDriver driver3 = new EdgeDriver();
		driver3.get("https://www.selenium.dev/");

	}

}
