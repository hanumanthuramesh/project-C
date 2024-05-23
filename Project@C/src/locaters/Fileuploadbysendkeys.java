package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadbysendkeys {

	public static void main(String[] args) {
		// step1:To open and  set up google chrome driver
				System.setProperty("webdriver.chrome.Driver", "C:\\Users\\USER\\Downloads\\Tools\\updated tools file\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
				//step2:Object creation for chrome driver and local variable declaration
				//if we use testNG or methods  we have to declaration in Global
				ChromeDriver driver=new ChromeDriver();
				//step3: To maximize the window 
				driver.manage().window().maximize();
				//step4:Get the URL
				driver.get("https://www.naukri.com/");
				// step5:Element finding and click on register
				driver.findElement(By.id("register_Layer")).click();
			
				//Title verification page
				System.out.println(driver.getTitle());
				//String expectedTitle = "Jobs - Recruitment - Job Search -  Employment - Job Vacancies - Naukri.com";
		        String expectedTitle = "Register on Naukri.com: Apply to Millions of Jobs Online";
		        System.out.println("expectedTitle = " +expectedTitle  );
		        String title = driver.getTitle();
		        System.out.println("actualTitle  = " + title);
		if (title.equalsIgnoreCase(expectedTitle)) {
		            System.out.println("Title Matched");
		        } else {
		            System.out.println(" Title Not a match");
		        }

		//To  upload resume  through Send keys 
		driver.findElement(By.className("main-2")).click();
		WebElement upload=driver.findElement(By.className("uploadResume resman-btn-primary resman-btn-small"));
		upload.sendKeys("C:\\Users\\USER\\Downloads\\My Resumes\\Hanumanthu_ Ramesh.pdf\\");




			}
		//To  File upload through Send keys  and Title verification
		}		
	



