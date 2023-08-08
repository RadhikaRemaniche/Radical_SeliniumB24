package basic;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;


public class MyFileDownloadChrome {

	@Test(groups = { "basic" })
	
	public void myDownload() throws InterruptedException {
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", null);
		chromePrefs.put("download.default_directory", "C:\\Users\\radhi\\OneDrive\\Desktop\\MINE\\rad\\Software Testing course\\download_test");

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		options.addArguments("--test-type--");
		options.addArguments("--disable-extensions--"); // to disable browser extension popup
		options.addArguments("--remote-allow-origins--");
		options.addArguments("--disable-notifications--l");

		WebDriver driver = new ChromeDriver(options);

		driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));//waits for atleast 25 secs

		driver.findElement(By.xpath("//a[contains(text(),'Download Text File')]")).click();// Download Text File
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Download PDF File')]")).click();// Download pdf File
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Download CSV File')]")).click();// Download csv File
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Download Excel File')]")).click();// Download excel File
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Download Doc File')]")).click();//Download document File
		Thread.sleep(2000);

		driver.quit();
	}
}
