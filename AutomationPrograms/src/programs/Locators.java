package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		 WebElement createPageLink=driver.findElement(By.xpath("//a[text()='Games']"));
		 createPageLink.click();
		 Thread.sleep(15000);
		 WebElement candyCrushImage=driver.findElement(By.xpath("//*[text()='Candy Crush Saga']"));
		 candyCrushImage.click();
		
	}

}
