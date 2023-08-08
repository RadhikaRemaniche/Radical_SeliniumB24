package basic;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeliniumTest_Firefox {
	@Test(groups = { "basic" })
	public void testCase1()
	{
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.selenium.dev/");
	}

}
