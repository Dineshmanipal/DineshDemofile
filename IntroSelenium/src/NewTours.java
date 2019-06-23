import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromedriver 73\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		List<WebElement> linktext = driver.findElements(By.tagName("a"));
	
// print the Links in the webpage		
		
		System.out.println(linktext.size());
		
		for(int i=0;i<linktext.size();i++)
		{
			String s=linktext.get(i).getText();
			
			System.out.println(s);
			//driver.findElement(By.linkText(s)).click();
			
		}

	//	click on Each link
		
		String[] links=new String[linktext.size()];
		
		for(int i=0;i<linktext.size();i++)
		{
			 links[i]=linktext.get(i).getText();		
		}
		
		int i =0;
		for(WebElement e:linktext)
		{
			links[i]=e.getText();
			i++;
		}
		
	for(String s:links)
	{
		Thread.sleep(5000);
	driver.findElement(By.linkText(s)).click();
	if(driver.getTitle().equals("Under Construction: Mercury Tours"))
	{
	WebElement	ele=driver.findElement(By.linkText(s));
	System.out.println(s+"is Under Sconstruction");
	}
	else
	{
		WebElement	ele=driver.findElement(By.linkText(s));	
		System.out.println(s+"is working fine");
		}
	driver.navigate().back();
	}
		
		
	}

}
