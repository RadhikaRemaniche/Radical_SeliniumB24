package basic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class MyScreenShot {
	@Test
	public void Test() throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--allow-remote--origins");
		options.addArguments("--disable---notifications--");

		System.out.println("Launching Browser");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Selinium");

		MyScreenShotUtility utility = new MyScreenShotUtility();
		utility.takeScreenshot(driver);
		
		driver.quit();
	}

}
