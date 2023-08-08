package datadriven;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyDataDrivenScript1 {
	
	WebDriver driver ;
	
	@DataProvider(name="AnilsDataProvider")
	public Object[][] getData(){
		Object[][] data = new Object[4][3];
			data[0][0]= "admin";
			data[0][1]= "pwd";
			data[0][2]= "pin1";
			
			data[1][0]= "admin1";
			data[1][1]= "pwd";
			data[0][2]= "pin1";
			
			data[2][0]= "admin2";
			data[2][1]= "pwd";
			data[0][2]= "pin1";
			
			data[3][0]= "user";
			data[3][1]= "pwd22";
			data[0][2]= "pin1";
		return data;
	}
	
	@Test(dataProvider="AnilsDataProvider")
	public void loginToFacebook(String username, String password, String pin){
		
		System.out.println("Name "+username);
		System.out.println("pwd "+password);
		//System.setProperty("webdriver.gecko.driver", "D:\\Training\\TrainingContent\\SeleniumJars_Software\\geckodriver_64\\geckodriver.exe");
		
		//driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		System.out.println("Name "+username);
		System.out.println("pwd "+password);
		
//		driver.findElement(By.xpath("")).sendKeys(username);
//		driver.findElement(By.xpath("")).sendKeys(password);
//		driver.findElement(By.xpath("")).click();

	}
	

}
