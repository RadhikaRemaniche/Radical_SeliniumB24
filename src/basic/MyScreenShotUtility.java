package basic;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;


public class MyScreenShotUtility {

	public void takeScreenshot(WebDriver driver)throws IOException {
		TakesScreenshot screenshot= (TakesScreenshot)driver;
		
		File fi = screenshot.getScreenshotAs(OutputType.FILE);//takes a screenshot
		
		Random random = new Random();//creating instance of random class
		int randomNum= random.nextInt(10000);//generating random number 
		
		
		String directory ="C:\\Users\\radhi\\OneDrive\\Desktop\\MINE\\rad\\Software Testing course\\screenshots\\google_screen_"+randomNum+".png";
	FileUtils.copyFile(fi,new File(directory));
	
	}
}
