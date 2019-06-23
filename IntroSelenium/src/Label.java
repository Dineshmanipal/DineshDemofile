import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Label {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver 73\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//input[@name='email']//parent::td//parent::tr//preceding-sibling::tr/td/label")).getText());
		
		System.out.println(driver.findElement(By.xpath("//input[@name='email']//parent::td/following-sibling::td/input//parent::td/following-sibling::td/label/input")).getAttribute("value"));
	}

}
