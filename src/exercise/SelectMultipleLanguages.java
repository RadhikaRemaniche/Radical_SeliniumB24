package exercise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class SelectMultipleLanguages {
	@Test
	public void TestCase1() throws InterruptedException {

		EdgeOptions options= new EdgeOptions();
		options.addArguments("==remote allow origins==== ");
		options.addArguments("==disable notifications=====");

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		
		//validate if we can select multiple options from launguage dropdown  
		
		//List<WebElement> element = driver.findElement(By.xpath("//multi-select/div[@id='msdd']"));
		
		driver.findElement(By.id("msdd")).click();
		Thread.sleep(5000);
		List<WebElement> listOfLangOptions = driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']"));
		System.out.println(listOfLangOptions.size());
		
		
		System.out.println("Languages are as follows ");

		for(WebElement displayOptions : listOfLangOptions ) {
			System.out.println(displayOptions.getText());
		}
		
		
//		
//		 driver.findElement(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']")).click();
//		 driver.findElement(By.xpath(" //a[normalize-space()='Italian']")).click();
//		 driver.findElement(By.xpath("//multi-select/div/ul/li/a[contains(text(),'Danish')]")).click();
//		 driver.findElement(By.xpath("//multi-select/div/ul/li/a[contains(text(),'Dutch')]")).click();
//		
		
	//	driver.quit();
		
	}
}
