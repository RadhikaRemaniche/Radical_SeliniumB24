package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserOperation1 {

	public void createUser(EncapsulationEg1 obj, WebDriver driver) throws InterruptedException {
		// for first name
		if (!obj.getfName().equals(null)) {
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(obj.getfName());

		}
		// for last name
		if (!obj.getlNAme().equals(null)) {
			driver.findElement(By.xpath("//div/input[@type='text'][@placeholder='Last Name']"))
					.sendKeys(obj.getlNAme());
			// obj.getlNAme();
		}

		// for adress
		if (!obj.getAddress().equals(null)) {
			driver.findElement(By.xpath("//div/textarea[@*='Adress']")).sendKeys(obj.getAddress());
			// obj.getAddress();
		}
		// for email

		if (!obj.getEmail().equals(null)) {
			driver.findElement(By.xpath("//div/input[@*='EmailAdress']")).sendKeys(obj.getEmail());
			// obj.getEmail();
		}

		// for phone
		if (!obj.getPhone().equals(null)) {
			driver.findElement(By.xpath("//div/input[@*='Phone']")).sendKeys(obj.getPhone());
			// obj.getPhone();
		}

		// for gender
		if (!obj.getGender().equals(null)) {
			WebElement element = driver.findElement(By.xpath("//div/label/input[@value='Male']"));
			if (obj.getGender().equals("Male")) {
				element.click();
			}
		}
		// for hobbies

		if (!obj.getHobbies().equals(null)) {
			
			 List<WebElement> element = driver.findElements(By.xpath("//div/input[@type='checkbox']"));
			//WebElement element1 = driver.findElement(By.xpath("//div/input[@value='Movies']"));
			System.out.println("Number of check boxes are :" +element.size());
			
			for(WebElement web : element) {

				if(web.getText().equals(obj.getHobbies()) || web.getText().equals(obj.getHobbies2()) || web.getText().equals(obj.getHobbies3())){
					web.click();
					System.out.println(web.getText());

				}
			}
				
		}

		//to click outside of the container
		//driver.findElement(By.xpath("//div/form[@id='basicBootstrapForm']")).click();

		// for skills

		if (!obj.getSkills().equals(null)) {
			driver.findElement(By.xpath("//div/select[@id='Skills']")).click();
			obj.getSkills();
			driver.findElement(By.xpath("//div/select[@id='Skills']/option[@*='Android']")).click();
			obj.getSkills();
		}

		// for country

		if (!obj.getCountry().equals(null)) {
			driver.findElement(By.xpath("//b[@role='presentation']")).click();
			// obj.getCountry();
			driver.findElement(By.xpath("//select[@id='country']/option[@value='India']")).click();
			obj.getCountry();
		}

		// for Date of birth (year)

		
	}
}
