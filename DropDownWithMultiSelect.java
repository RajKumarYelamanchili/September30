package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserOctober\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	    driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
	    Thread.sleep(2000);
	
	
	WebElement dd2=  driver.findElement(By.xpath("//select[@name='Month']"));
	
	if (dd2.isDisplayed() && dd2.isEnabled())
	{
		System.out.println("drop down is enabled and displayed");
	}
	else
	{
		System.out.println("drop down is either NOT enabled or NOT displayed");
	}
	
	Select sel = new Select(dd2);
	      
	if( sel.isMultiple())
	{
		System.out.println("drop down is allowing multiple selection");
	}
	else
	{
		System.out.println("drop down is not allowing multiple selection");
	}
	
	sel.selectByIndex(4);
	Thread.sleep(2000);
	
	sel.selectByVisibleText("August");
	Thread.sleep(2000);
	
	sel.selectByValue("Oct");
	Thread.sleep(2000);
	
	if (sel.getAllSelectedOptions().size()==3)
	{
		System.out.println(" 3 options are chosen");
	}
	else
	{
		System.out.println(" 3 options are not chosen");
	}
	
	sel.deselectByIndex(10);
	Thread.sleep(2000);
	sel.deselectByValue("Aug");
	Thread.sleep(2000);
	sel.deselectByVisibleText("April");
	Thread.sleep(2000);
	
	
	sel.selectByIndex(6);
	Thread.sleep(2000);
	
	sel.selectByVisibleText("March");
	Thread.sleep(2000);
	
	sel.selectByValue("Sept");
	Thread.sleep(2000);
	
	sel.deselectAll();
	}

}
