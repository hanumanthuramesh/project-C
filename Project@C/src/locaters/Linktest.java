package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktest {

	public static void main(String[] args) throws InterruptedException {
		//Step1: Setup for Open GoogleChrome Browser/Driver = desic 
				System.setProperty("webdriver.chrome.Driver","C:\\Users\\USER\\Downloads\\Tools\\updated tools file\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				//object  creation for web driver or  Chrome driver in local declaration 
						//if we use testNG or methods  we have to declaration in Global
				ChromeDriver driver=new ChromeDriver();
				//Step2:Maximize Browser
				driver.manage().window().maximize();
				//Step3:Enter Valid URL
				driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Faccounts.google.com%2Fsignin%2Fchrome%2Fsync%2Ffinish%3Fcontinue%3Dhttps%253A%252F%252Fwww.google.co.in%252F%26est%3DAHjzbsrDoN8qepzqjN4AqmCZmTcbqUnvcKIEk9mhRSisiPexIvNfJkGutulxWkewa8ZGxCJZbTFGET5XV7FgeA&ssp=1&flowName=GlifDesktopChromeSync&dsh=S-486257651%3A1709277046702941");
				//dynamic x-path by cotains method 
				//driver.findElement(By.xpath("//*[contains(@jsname,'Cuz2Ue')]")).click();
				//dynamic x-path by start with
				driver.findElement(By.xpath("//*[contains(@jsname,'Cuz')]")).click();
				// find element by Css selector
				driver.findElement(By.cssSelector("input#identifierId")).sendKeys("hanu@123");
				// Find the element by linktest and partialLinkText
				//driver.findElement(By.linkText("Learn more about using Guest mode")).click();
				driver.findElement(By.partialLinkText("Learn more about")).click();
				Thread.sleep(4000);
				//driver.findElement(By.cssSelector("input#identifierId")).sendKeys("hanu@123");
				Thread.sleep(4000);
				driver.close();
				//driver.quit();



					}
					//# for explicit wait
					//WebDriverWait wait = new WebDriverWait(driver,30);
					//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
					
					//for implesit wait=driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
					
					//covered = link test ,partialLinkText, Css selector, theread.sleep,driver.quit for multiple tabs and single tab driver.close  and also dynamic x-path by cotains method  and start with also covered 
				}
			
