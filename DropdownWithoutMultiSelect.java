package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownWithoutMultiSelect {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\BrowserOctober\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	    driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
	    Thread.sleep(2000);
	
	
	WebElement dd1=  driver.findElement(By.xpath("//select[@name='country']"));
	
	if (dd1.isDisplayed() && dd1.isEnabled())
	{
		System.out.println("drop down is enabled and displayed");
	}
	else
	{
		System.out.println("drop down is either NOT enabled or NOT displayed");
	}
	
	Select sel = new Select(dd1);
	      
	if( sel.isMultiple())
	{
		System.out.println("drop down is allowing multiple selection");
	}
	else
	{
		System.out.println("drop down is not allowing multiple selection");
	}
	
	int numberOfCountries=   sel.getOptions().size();
	System.out.println("Total number of countries : " + numberOfCountries);
	
	sel.selectByIndex(9);
	String country1 =sel.getFirstSelectedOption().getText();
	System.out.println("Country chosen is : " + country1);
	
	sel.selectByVisibleText("India");
	String country2 =sel.getFirstSelectedOption().getText();
	System.out.println("Country chosen is : " + country2);
	
	sel.selectByValue("CH");
	String country3 =sel.getFirstSelectedOption().getText();
	System.out.println("Country chosen is : " + country3);
	
	
	}

}
