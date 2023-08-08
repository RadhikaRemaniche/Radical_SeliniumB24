package exercise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SkillTest2 {
	
	@Test(groups = { "exer" })
	public void TestCase2() throws InterruptedException {
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("====remote allow origins =======");
		options.addArguments("=====disable notifications=========");
		
		
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ArrayList<String> myarraylist = new ArrayList<String>();
		
		myarraylist.add("Cucumber Automation");
		myarraylist.add("Selinium Automation");
		
		WebElement element = driver.findElement(By.xpath("//div/select[@*='Skill']"));
		Select select = new Select(element); 
		
		
		List<WebElement> dropdownList = select.getOptions();
		

		for(String subList : myarraylist) {
			boolean result= true;

			for(WebElement mainList : dropdownList ) {
				if(mainList.getText().equals(subList)) {
					result=false;
				}
			}
			if(result) {
				System.out.println("Option " +subList+ " is not found ");
			}
			else {
				System.out.println(" Option " +subList+ " is found ");
			}		System.out.println("Test Execution complete and result is " +result);
			Assert.assertTrue(result);

		}
		System.out.println();
		driver.quit();
	}	

	}

