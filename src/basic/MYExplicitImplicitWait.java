package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MYExplicitImplicitWait {
	@Test
	public void TestCase() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--allow-remote--origins");
		options.addArguments("--disable---notifications--");
		
		System.out.println("Launching Browser");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//below 2 lines is explicit way , used to make only a particular element to wait
		// at different time duration and implicit way applies to all the elements   
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(25));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//textarea[@title='Search']")));

		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("selinium");
		driver.quit();
		}
	}
