package basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeliniumTest_Chrome {
		@Test(groups = { "basic" })
		public void testCase1()
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("----remote-allow-origins----");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.selenium.dev/");
		}
}
