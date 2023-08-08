package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.time.Duration;

public class MyShifttabDemoPrintCapital {

	@Test(groups = { "adv" })
	public void Test() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--allow-remote--origins");
		options.addArguments("--disable---notifications--");

		System.out.println("Launching Browser");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/login.php/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement target = driver.findElement(By.id("email"));
		// target.sendKeys("radhika remaniche");

		// shift key press and print name in capital
		Actions myaction = new Actions(driver);
		myaction.moveToElement(target).keyDown(Keys.SHIFT)// keyDown() for pressing the shift key
				.sendKeys("radhika").keyUp(Keys.SHIFT)// keyUp()for releasing the shift key
				.build().perform();

		driver.findElement(By.id("pass")).sendKeys("werty");

	}
}
