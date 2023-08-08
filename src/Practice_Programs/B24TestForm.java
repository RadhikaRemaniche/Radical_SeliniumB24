package Practice_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B24TestForm {

	@Test(groups = { "practice" })
	public void testcase1() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");

		System.out.println("Launching browser");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		boolean testResult = true;
		String errorMessage = " ";

		// first name
		/*try {
			driver.findElement(By.xpath("//div/input[@placeholder='First Name']")).sendKeys("Ravi");
		} catch (Exception e) {
			testResult = false;
			System.out.println(" First name field is missing ");
			errorMessage = errorMessage + " First name field is missing ";
		}
		// middle name
	try {
			driver.findElement(By.xpath("//div/input[@placeholder='Middle Name']")).sendKeys("Teja");
		} catch (Exception e) {
			testResult = false;
			System.out.println(" Middle name field is missing ");
			errorMessage = errorMessage + " Middle name field is missing ";

		}

		// last name
		try {
			driver.findElement(By.xpath("//div/input[@placeholder='Last Name']")).sendKeys("Bhandurge");
		} catch (Exception e) {
			testResult = false;
			//System.out.println(" Last name field is missing ");
			errorMessage = errorMessage + " Last name field is missing ";

		}

		// cycling
		try {
			driver.findElement(By.xpath("//input[@value='Cycling']")).click();
		} catch (Exception e) {
			testResult = false;
			System.out.println(" Cycling is missing ");
			errorMessage = errorMessage + " Cycling is missing ";

		}

		// address
		try {
			driver.findElement(By.xpath("//div/textarea[@ng-model='Adress']"))
					.sendKeys("3188 Khale Street,Florence,South Carolina,29501");
		} catch (Exception e) {
			testResult = false;
			System.out.println(" Address field missing ");
			errorMessage = errorMessage + " Address field missing";
		}

		// email
		try {
			driver.findElement(By.xpath("//div/input[@ng-model='EmailAdress']")).sendKeys("radhika@gmail.com");
		} catch (Exception e) {
			testResult = false;
			System.out.println(" Email field missing ");
			errorMessage = errorMessage + " Email field missing";
		}

		// phone number
		try {
			driver.findElement(By.xpath("//div/input[@*='tel']")).sendKeys("843-630-9225");
		} catch (Exception e) {
			testResult = false;
			System.out.println(" Phone field missing ");
			errorMessage = errorMessage + " Phone field missing";
		}

		// radio button gender
		try {
			//WebElement radio1 = driver.findElement(By.xpath("//div/label/input[@*='FeMale']"));
			WebElement radio2 = driver.findElement(By.xpath("//div/label/input[@*='Male']"));

			//radio1.click();
			radio2.click();
		} catch (Exception e) {
			testResult = false;
			System.out.println("Cannot select  option");
			errorMessage = errorMessage + "Cannot select  option";
		}

		// checkbox selection
		try {
			driver.findElement(By.xpath("//div/input[@value='Cricket']")).click();
			driver.findElement(By.xpath("//div/input[@value='Movies']")).click();

		} catch (Exception e) {
			testResult = false;
			System.out.println("check box field is missing ");
			errorMessage = errorMessage + " checkboxfield is missing";
		}

		// ;languages selection
		try {
			driver.findElement(By.id("msdd")).click();
			Thread.sleep(2500);
			driver.findElement(By.xpath("//multi-select/div/ul/li/a[contains(text(),'English')]")).click();
			driver.findElement(By.xpath("//multi-select/div/ul/li/a[contains(text(),'Danish')]")).click();
			driver.findElement(By.xpath("//multi-select/div/ul/li/a[contains(text(),'Dutch')]")).click();
		}

		catch (Exception e) {
			testResult = false;
			System.out.println(" Language is missing ");
			errorMessage = errorMessage + " Language  is missing ";
		}

		// skills drop down

		/*
		 * // 1st way to select option from drowdown use try catch
		 * driver.findElement(By.xpath("//select[@id='Skills']")).click();
		 * Thread.sleep(500);
		 * driver.findElement(By.xpath("//select[@id='Skills']/option[text()='Android']"
		 * )).click();
		 

		// second way
		// String str= "fdgdfhd";
		try {
			WebElement element = driver.findElement(By.xpath("//select[@id='Skills']"));
			
			Select select = new Select(element);
			select.selectByVisibleText("Android");
		}

		catch (Exception e) {
			testResult = false;
			System.out.println(" option is missing ");
			errorMessage = errorMessage + " option is missing ";
		}*/

		// country selection
		//try {

			driver.findElement(By.xpath("//b[@role='presentation']")).click();
			Thread.sleep(2500);
			driver.findElement(By.xpath("//select[@id='country']/option[@value='India']")).click();

//		} catch (Exception e) {
//			testResult = false;
//
//			System.out.println(" country field missing ");
//			errorMessage = errorMessage + " country field missing";
//		}

		// date of birth : year field
		try {
			WebElement element = driver.findElement(By.xpath("//select[@placeholder='Year']"));
			Select select = new Select(element);
			select.selectByVisibleText("1986");
		} catch (Exception e) {
			testResult = false;

			System.out.println(" Year field missing ");
			errorMessage = errorMessage + " year field missing";
		}
		// date of birth : month field

		//try {
			WebElement element = driver.findElement(By.xpath("//select[@placeholder='Month']"));
			Select select = new Select(element);
			select.selectByVisibleText("November");
//		} catch (Exception e) {
//			testResult = false;
//
//			System.out.println(" month field missing ");
//			errorMessage = errorMessage + " month field missing";
//		}

		// date of birth : day field

//		try {
//			WebElement element = driver.findElement(By.xpath("//div/select[@placeholder='Day']"));
//			Select select = new Select(element);
//			select.selectByVisibleText("14");
//		} catch (Exception e) {
//			testResult = false;
//			System.out.println(" day field missing ");
//			errorMessage = errorMessage + " day field missing";
//		}

		// password
		try {
			driver.findElement(By.xpath("//div/input[@ng-model='Password']")).sendKeys("Qwerty123$");
		} catch (Exception e) {
			testResult = false;

			System.out.println(" password field missing ");
			errorMessage = errorMessage + " password field missing";
		}

		// confirm passwrd
		try {
			driver.findElement(By.xpath("//div/input[@ng-model='CPassword']")).sendKeys("Qwerty123$");
		} catch (Exception e) {
			testResult = false;

			System.out.println(" confirm password field missing ");
			errorMessage = errorMessage + " confirm password field missing";
		}

		System.out.println("Test execution is complete and the result is  : " + testResult);
		Assert.assertTrue(testResult, errorMessage);
		Thread.sleep(1000);
	 driver.quit();
	}

}
