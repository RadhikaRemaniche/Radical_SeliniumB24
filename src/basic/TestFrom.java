package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFrom {

	@Test
	public void testCase() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins--");
		options.addArguments("--disable-notifications---");

		ChromeDriver driver = new ChromeDriver(options);// launches the web page
		driver.get("https://demo.automationtesting.in/Register.html");// opens the web page
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// used to implicitly wait (instead of thread
																			// use implicit wait)

		boolean TestResult = true;
		String errorMessageString = null;
		try {
			driver.findElement(By.xpath("//div/input[@placeholder='First Name']")).sendKeys("Radhika");// 'sendKeys()'types
																										// the name in
																										// the text
																										// field
		} catch (Exception e) {
			TestResult = false;
			System.out.println("First name field is missing");
			errorMessageString = errorMessageString + " First name field is missing ";
		}
		try {
			driver.findElement(By.xpath("//div/input[@placeholder='Middle Name']")).sendKeys("Abhijit");

		} catch (Exception e) {
			TestResult = false;
			System.out.println("Middle name field is missing");
			errorMessageString = errorMessageString + " Middle name field is missing";
		}
		try {
			driver.findElement(By.xpath("//div/input[@placeholder='Last Name']")).sendKeys("Remaniche");
		} catch (Exception e) {
			TestResult = false;
			System.out.println("Last Name field is missing ");
			errorMessageString = errorMessageString + "Last Name field is missing";
		}
		try {
			driver.findElement(By.xpath("//div/input[@value='Cycling']")).click();
		} catch (Exception e) {
			TestResult = false;
			System.out.println("Cycling field is missing ");
			errorMessageString = errorMessageString + " Cycling field is missing ";
		}
		// 1st way to select the option from dropdown

		/*
		 * driver.findElement(By.xpath("//select[@id='Skills']")).click();
		 * Thread.sleep(500);
		 * driver.findElement(By.xpath("//select[@id='Skills']/option[@value='Android']"
		 * )). click();
		 */

		// 2nd way of selecting the option from dropdown

		WebElement element = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select select = new Select(element);// to select the items from the drop down
		select.selectByVisibleText("Android");

		System.out.println("Test Execution complete and result is " + TestResult);
		Assert.assertTrue(TestResult, errorMessageString);

		// 'click()' clicks one of the selected options
		try {
			driver.findElement(By.xpath("//div/label/input[@*='FeMale']")).click();
		} catch (Exception e) {
			TestResult = false;
			System.out.println("Cannot select Female option");
			errorMessageString = errorMessageString + "Cannot select Female option";
		}

		try {
			driver.findElement(By.xpath("//div/textarea[@ng-model='Adress']"))
					.sendKeys("3188 Khale Street,Florence,South Carolina,29501");
		} catch (Exception e) {
			TestResult = false;
			System.out.println(" Address field missing ");
			errorMessageString = errorMessageString + " Address field missing";
		}
		try {
			driver.findElement(By.xpath("//div/input[@ng-model='EmailAdress']")).sendKeys("radhika@gmail.com");
		} catch (Exception e) {
			TestResult = false;
			System.out.println(" Email field missing ");
			errorMessageString = errorMessageString + " Email field missing";
		}
		try {
			driver.findElement(By.xpath("//div/input[@*='tel']")).sendKeys("843-630-9225");
		} catch (Exception e) {
			System.out.println(" Phone field missing ");
			errorMessageString = errorMessageString + " Phone field missing";
		}

		try {
			driver.findElement(By.xpath("//div/input[@value='Cricket']")).click();
		} catch (Exception e) {
			System.out.println(" cricket field missing ");
			errorMessageString = errorMessageString + " cricket field missing";
		}
		try {
			driver.findElement(By.xpath("//div/input[@value='Movies']")).click();
		} catch (Exception e) {
			System.out.println(" Movies field missing ");
			errorMessageString = errorMessageString + " Movies field missing";
		}

		/*
		 * boolean result =
		 * driver.findElement(By.xpath("//div/input[@value='Cricket']")).isSelected();
		 * if(result) {
		 * driver.findElement(By.xpath("//div/input[@value='Cricket']")).click(); //to
		 * uncheck if it is already selected }else {
		 * System.out.println("checkbox is already unchecked"); }
		 */

		try {

			driver.findElement(By.xpath("//select[@id='country']")).click();
			driver.findElement(By.xpath("//select[@id='country']/option[@*='India']")).click();

		} catch (Exception e) {
			System.out.println(" country field missing ");
			errorMessageString = errorMessageString + " country field missing";
		}
		try {
			driver.findElement(By.xpath("//select[@placeholder='Year']")).click();
			driver.findElement(By.xpath("//select[@placeholder='Year']/option[@value='1990']")).click();
		} catch (Exception e) {
			System.out.println(" Year field missing ");
			errorMessageString = errorMessageString + " year field missing";
		}
		driver.findElement(By.xpath("//div/select[@placeholder='Year']/option[@value='1990']")).click();

		driver.findElement(By.xpath("//div/select[@placeholder='Month']/option[@value='April']")).click();

		driver.findElement(By.xpath("//div/select[@placeholder='Day']/option[@value='14']")).click();

		driver.findElement(By.xpath("//div/input[@ng-model='Password']")).sendKeys("Qwerty123$");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div/input[@ng-model='CPassword']")).sendKeys("Qwerty123$");

		driver.close();
		// driver.quit();
	}
}
