package basic;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class MyFileAttachment {
	@Test(groups = { "basic" })
	
	public void TestCase2() throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("===allow-remote-origin====");
		option.addArguments("===disable notifications====");

		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.freefileconvert.com/");
		//driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div/input[@id='first_file']"))
		.sendKeys("C:\\Users\\radhi\\OneDrive\\Desktop\\MINE\\rad\\Software Testing course\\sytaxs.txt");
		
	}
}
