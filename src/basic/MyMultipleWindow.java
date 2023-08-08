package basic;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class MyMultipleWindow {

	@Test
	public void TestCase() throws InterruptedException {

		EdgeOptions options = new EdgeOptions();
		options.addArguments("--allow-remote--origins--");
		options.addArguments("--disable---notifications--");

		EdgeDriver driver = new EdgeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		 driver.manage().window().maximize();

		// get title of both the windows
		String mainwindowtitle = driver.getTitle();
		System.out.println("Main window title : " + mainwindowtitle);
		String onewindowhandle = driver.getWindowHandle();
		System.out.println("1st window  handle: " + onewindowhandle);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//ul/li/a[contains(text(),'FLIGHTS')]")).click();
		Thread.sleep(5);

		String secondwindowhandle = null;

		Set<String> multuwindow = driver.getWindowHandles();

		for (String win : multuwindow) {
			/*
			 * if(onewindowhandle.equals(win)) {
			 * 
			 * System.out.println("This is first window");} else {
			 * System.out.println("This is second window");
			 * 
			 * //moving control rto sec window driver.switchTo().window(win);
			 * secondwindowhandle=win;
			 * 
			 * } use above OR below code whicever is convinient 
			 */
			if (!onewindowhandle.equals(win)) {

				System.out.println("This is second window");

				// moving control rto sec window
				driver.switchTo().window(win);
				secondwindowhandle = win;

			}
		}

		String secondwindowtitle = driver.getTitle();
		Thread.sleep(2000);
		System.out.println("Second window title : " + secondwindowtitle);// shows the same window as first
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='defenceForce']")).click();
		Thread.sleep(2000);
		driver.close();//closes the current window 
		// moving back to first window

		driver.switchTo().window(onewindowhandle);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div//strong[contains(text(),'TRAINS')]")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
