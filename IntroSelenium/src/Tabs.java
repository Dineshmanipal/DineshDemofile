import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver 73\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		ArrayList<String> tab = new ArrayList(driver.getWindowHandles());
		Thread.sleep(3000);
		
		driver.switchTo().window(tab.get(1));
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(tab.get(0));
		System.out.println(driver.getTitle());
		
	}

}
