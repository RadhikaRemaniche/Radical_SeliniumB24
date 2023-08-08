package exercise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertBoxTest {

		@Test(groups = { "exer" })
		
		public void TestCase3() throws InterruptedException {
			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("===allow-remote-origin====");
			option.addArguments("===disable notifications====");
	
			ChromeDriver driver = new ChromeDriver(option);
			driver.get("https://demo.automationtesting.in/Alerts.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			

			driver.findElement(By.xpath("//div[@id='OKTab']")).click();
			Thread.sleep(2000);

			//alert box 
			Alert alert = driver.switchTo().alert();//creating object of alert class
			
			Thread.sleep(2000);

			String actualMessageString = alert.getText();
			
			String expectedMessageString = "I am an alert box!";// no spaces at atart and end 

			Assert.assertEquals(actualMessageString, expectedMessageString);

			alert.accept();// use for ok button

			//confirmation box 
			Thread.sleep(2000);

			driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//div[@id='CancelTab']")).click();
			Thread.sleep(2000);

			Alert alert1 = driver.switchTo().alert();
			String actualmessage = alert1.getText();
			String expectedmessage = "Press a Button !" ;
			
			Assert.assertEquals(actualmessage, expectedmessage);

			alert.dismiss();//use for cancel button 
			
			driver.quit();

		}
}
