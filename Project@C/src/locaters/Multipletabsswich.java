package locaters;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipletabsswich {

	public static void main(String[] args) {
		//Step1: Setup for Open GoogleChrome Browser/Driver = desic 
				System.setProperty("webdriver.chrome.Driver","C:\\Users\\USER\\Downloads\\Tools\\updated tools file\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				//object  creation for web driver or  Chrome driver in local declaration 
						//if we use testNG or methods  we have to declaration in Global
				ChromeDriver driver=new ChromeDriver();
				//Step2:Maximize Browser
				driver.manage().window().maximize();
				//Step3:Enter Valid URL
			
				driver.get("https://app.resumekraft.com/dashboard");
				String tab1= driver.getWindowHandle();
				
				driver.switchTo().newWindow(WindowType.TAB);
				driver.get("https://www.naukri.com/mnjuser/homepage");
				String tab2= driver.getWindowHandle();
				
				driver.switchTo().newWindow(WindowType.TAB);
				driver.get("	https://www.linkedin.com/in/hanumanthuramesh/");
				String tab3= driver.getWindowHandle();

				driver.switchTo().newWindow(WindowType.TAB);
				driver.get("https://www.naukri.com/mnjuser/homepage");
				String tab4= driver.getWindowHandle();
				
				driver.switchTo().newWindow(WindowType.TAB);
				driver.get("https://monkeylearn.com/word-cloud");
				String tab5= driver.getWindowHandle();
				
				
				
				
				driver.switchTo().window(tab3);
					
			


		}
		//coverd thinks are  multiple tabs open and swich to particular tab  
		}