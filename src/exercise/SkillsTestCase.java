package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

public class SkillsTestCase {

	@Test(groups = { "exer" })
	public void TestCase1() throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("====remote allow origins ======= ");
		opt.addArguments("====disable notifications ======= ");

		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		TreeSet<String> myset = new TreeSet<String>();

		myset.add("C++");
		myset.add("Android");
		myset.add("SQL");
		myset.add("Java");

		WebElement element = driver.findElement(By.xpath("//div/select[@id='Skills']"));
		Select select = new Select(element); // selects the text field

		// get all the options frpom the dropdown list
		List<WebElement> webSet = select.getOptions();
		// for each for above string
		for (String mySet1 : myset) {
			boolean result = false;

			// for each loop for application drop down list
			for (WebElement webSet1 : webSet) {
				// comparing if above strings are present
				if (webSet1.getText().equals(mySet1)) {
					result = true;
					break;
				}
			}
			// returning boolean expression
			if (result) {
				System.out.println("option " + mySet1 + " is found");
			} else {
				System.out.println("Option " + mySet1 + " is not found");
		}
			System.out.println("Test Execution complete and result is " + result);
		    Assert.assertTrue(result);
		}

		System.out.println();
		driver.quit();

	}

}
