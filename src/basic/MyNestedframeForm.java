package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class MyNestedframeForm{

	@Test
	public void TestCase() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--allow-remote--origins");
		options.addArguments("--disable---notifications--");

		System.out.println("Launching Browser");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/nestedframes");
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//parent frame
		driver.switchTo().frame("frame1");// by string value
		String text = driver.findElement(By.xpath("//body[contains(text(),'Parent frame')]")).getText();
		System.out.println("Frame 1 test : " + text);

		// child frame
		// WebElement element= driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child
		// Iframe</p>']"));
		// driver.switchTo().frame(element);

		// above or below code works for childframe

		driver.switchTo().frame(0);// by index
		String text1 = driver.findElement(By.xpath("//body/p[contains(text(),'Child Iframe')]")).getText();
		System.out.println("Frame 2 test : " + text1);

		//back to parent 
		driver.switchTo().parentFrame();// goes back to previous frame of child frame i.e. parent frame
		String text2 = driver.findElement(By.xpath("//body[contains(text(),'Parent frame')]")).getText();
		System.out.println("Frame 3 test : " + text2);
		
		//back to main window 
		driver.switchTo().defaultContent();
		String text3 = driver.getTitle();
		System.out.println("Frame 4 test : " + text3);

	}
}
