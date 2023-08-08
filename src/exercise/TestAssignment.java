package exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TestAssignment {
	
	 
	@Test
	public void TestCase1() throws InterruptedException {

		 
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("====remote allow origins ======= ");
		opt.addArguments("====disable notifications ======= ");

		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://demo.automationtesting.in/Register.html");

		TreeSet<String> myset = new TreeSet<String>();

		myset.add("C++");
		myset.add("Android");
		myset.add("SQL");
		myset.add("Java");


			boolean result = false;
			String errorMessageString= null;
			for (String mySet1 : myset) {

			WebElement element = driver.findElement(By.xpath("//div/select[@id='Skills']"));
			Select select = new Select(element);
		//	select.getAllSelectedOptions();

			// Get all the options from the dropdown
			List<WebElement> options = select.getOptions();
		
			if(options.contains(mySet1)) {
				result=true;
				System.out.println("Test case passed ");
			}
			else {
				result=false;
				System.out.println("Test failed ");
				break;
			}
			Thread.sleep(1000);

			} 
			System.out.println("Test execution complete and result is :" +result);
			Assert.assertTrue(result, errorMessageString);
			Thread.sleep(1000);

			}
		
		/*
		 * try { TestResult=true; System.out.println("Test case PAssed "); } catch }
		 * (Exception e) { TestResult=false; System.out.println("Test case failed "); }
		 */

		
		//System.out.println("Test Execution complete and result is "+ result);
		//Assert.assertTrue(result);
	}

	
