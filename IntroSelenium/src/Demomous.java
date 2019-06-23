import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demomous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver 73\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	/*
		driver.get("http://www.newtours.demoaut.com/");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		Actions act1 = new Actions(driver);
		act1.sendKeys(Keys.ENTER).perform();*/
	/*	
		driver.get("http://retail.upskills.in/admin/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin@123");
		Actions act2=new Actions(driver);
		act2.sendKeys(Keys.ENTER).perform();
		WebElement link=driver.findElement(By.xpath("//li[@id='menu-catalog']"));
		Actions act3= new Actions(driver);
		act3.moveToElement(link).click().build().perform();*/
		
		
		driver.get("http://realestate.upskills.in/wp-admin/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
