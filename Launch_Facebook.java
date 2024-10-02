package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserOctober\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
			
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
	//	driver.findElement(By.id("email")).sendKeys("Rohit Sharma");//id
	//	driver.findElement(By.name("email")).sendKeys("Jhanvi");//name
	//	driver.findElement(By.linkText("Create a Page")).click();//linktext
	//	driver.findElement(By.partialLinkText("eate a Page")).click();//partial linkText
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("saif ali khan");
		
		
		
		
		

	}

}
