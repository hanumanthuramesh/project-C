package locaters;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshotspart_1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Step1: Setup for Open GoogleChrome Browser/Driver = desic 
		System.setProperty("webdriver.chrome.Driver","C:\\Users\\USER\\Downloads\\Tools\\updated tools file\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//object  creation for web driver or  Chrome driver in local declaration 
				//if we use testNG or methods  we have to declaration in Global
		ChromeDriver driver=new ChromeDriver();
		//Step2:Maximize Browser
		driver.manage().window().maximize();
		//Step3:Enter Valid URL
	
		driver.get("https://app.resumekraft.com/dashboard");
		  //File resumekraft = ((TakesScreenshot)driver)
                 // .getScreenshotAs(OutputType.FILE);
		  File resumekraft= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  Files.copy(resumekraft, new File("C:\\Users\\USER\\Downloads\\Screenshots\\Resume.png"));
		  
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.naukri.com/mnjuser/homepage");
		 File naukri= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  Files.copy(naukri, new File("C:\\Users\\USER\\Downloads\\Screenshots\\naukri.png"));
		  
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://monkeylearn.com/word-cloud");
		File monkey= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  Files.copy(monkey, new File("C:\\Users\\USER\\Downloads\\Screenshots\\monkey.png"));
		Thread.sleep(4000);
		driver.quit();
		
		
		
		
		
	}
// covered thinks are  Screenshots method-1
}
