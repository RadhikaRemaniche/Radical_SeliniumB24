package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class MyImplicitWait {

	@Test
	public void TestCase() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--allow-remote--origins");
		options.addArguments("--disable---notifications--");
		
		System.out.println("Launching Browser");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));//waits for atleast 25 secs
		driver.get("https://www.google.com/");

		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Selinium");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));//do not use implicit here if selinium should visible 
		//Thread.sleep(1000);
		
		driver.navigate().back();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.navigate().forward();
		//driver.quit();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));//timeout for loading page 
		
		

	}

}
