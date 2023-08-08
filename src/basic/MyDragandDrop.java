package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class MyDragandDrop {

		@Test//(groups = { "basic" })
		public void Test() {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--allow-remote--origins");
			options.addArguments("--disable---notifications--");
			
			System.out.println("Launching Browser");
			ChromeDriver driver = new ChromeDriver(options);
			driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			// use action class to drag and drop the event 
			WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
			
			WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
			
			Actions myaction = new Actions(driver);
			
			myaction.dragAndDrop(source , target).build().perform();// used to find source and target 
			//aand build the event and perform  
			
			
			
		}
}
