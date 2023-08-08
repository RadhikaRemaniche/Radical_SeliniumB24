package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MyExplicitWait {

	@Test
	public void TestCase() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--allow-remote--origins");
		options.addArguments("--disable---notifications--");
		
		System.out.println("Launching Browser");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();

		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));//500 MILLSEC
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//textarea[@title='Searchzz']")));
		driver.findElement(By.xpath("//textarea[@title='Searchzzz']")).sendKeys("selinium");
}

	
	}
