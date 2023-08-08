package exercise;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestFormEncapsulationConcept {

	@Test
	public void TestCase1() throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("==remote allow origins==== ");
		options.addArguments("==disable notifications=====");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		EncapsulationEg1 encap = new EncapsulationEg1();
		UserOperation1 usrcr = new UserOperation1();
		

		encap.setfName("rayan");
		encap.setlNAme("Rodriges");
		encap.setAddress("Collerville, Tennessee");
		encap.setEmail("ryan.rodriges@yahoo.com");
		encap.setPhone("9014578371");
		encap.setGender("Male");
		encap.setHobbies("Cricket,Movies,Hockey");
		
		
		encap.setSkills("Android");
		encap.setCountry("India");
		
		
		
		
		
		usrcr.createUser(encap, driver);
		//Thread.sleep(2500);
		//driver.quit();

	}

}
