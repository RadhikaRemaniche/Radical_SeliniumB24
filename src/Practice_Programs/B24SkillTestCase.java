package Practice_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.ArrayList;

public class B24SkillTestCase {


	@Test(groups = { "practice" })
	public void TestCase1() throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("====remote allow origins ======= ");
		opt.addArguments("====disable notifications ======= ");

		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		ArrayList<String> myarray = new ArrayList<String>();
		
		myarray.add("C++");
		myarray.add("Android");
		myarray.add("SQL");
		myarray.add("Java");
		
		WebElement element = driver.findElement(By.xpath("//div/select[@id='Skills']"));
		Select select = new Select(element);
		
		//got the list from the dropdown
		List<WebElement> listFromSkillsDropDown = select.getOptions();
		
		for(String arraylist : myarray){
			boolean result = false;
			for(WebElement skillsDropdown : listFromSkillsDropDown ) {
				if(skillsDropdown.getText().equals(arraylist)) {
					result = true;
					break;
					
				}
			}
			if(result) {
				System.out.println("The option " +arraylist+" is found");
			}else {
				System.out.println("The option " +arraylist+" is  not found");

			}
			System.out.println("Test execution is completed and the result is : " +result);
			Assert.assertTrue(result);
		}		
	}
}
