package locaters;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tabnavigation {

	public static void main(String[] args) throws InterruptedException {
		//Step1: Setup for Open GoogleChrome Browser/Driver = desic 
		System.setProperty("webdriver.chrome.Driver","C:\\Users\\USER\\Downloads\\Tools\\updated tools file\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//object  creation for web driver or  Chrome driver in local declaration 
				//if we use testNG or methods  we have to declaration in Global
		ChromeDriver driver=new ChromeDriver();
		//Step2:Maximize Browser
		driver.manage().window().maximize();
		//Step3:Enter Valid URL
		driver.get("https://app.resumekraft.com/dashboard");
		//driver.get("https://www.naukri.com/mnjuser/homepage");
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.close();
		
		
		
	}
// coverd thinks are  forward(),.back();,refresh();

	
	
		

	}
