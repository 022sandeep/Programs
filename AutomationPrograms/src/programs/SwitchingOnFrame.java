package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingOnFrame {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		driver.manage().window().maximize();
		//1) Switching on frame using Index
		
		//driver.switchTo().frame(1);
		
		
		//2) Switching on frame using name/id
		
		//driver.switchTo().frame("iframeResult");
		
		//3) Switching on frame using webElement
		
		WebElement frameElement=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frameElement);
		
		
		
		WebElement FirstNameTextBox=driver.findElement(By.id("fname"));
		FirstNameTextBox.sendKeys("Rajesh");
		
		WebElement LastNameTextBox=driver.findElement(By.id("lname"));
		LastNameTextBox.sendKeys("Patil");
		

	}

}
