import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo
{
	
	public static void main(String args[]) throws InterruptedException {

		//System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver 73\\chromedriver_win32\\chromedriver.exe");
		
		
		//WebDriver driver1= new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(50000);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input.button")).click();
		
		Thread.sleep(50000);
        driver.findElement(By.linkText("PIM")).click();
        Thread.sleep(30000);
       List<WebElement> links = driver.findElements(By.tagName("a"));
       System.out.println(links.size());
       for(int i=0;i<links.size();i++)
       {
    	   String linkText=links.get(i).getText();
    	   System.out.println(linkText);
       }
       
       
		System.out.println("Thank You");
		//driver.close();
		
	}
	
}

