package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandlingExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("iframeResult");
		
		WebElement HTMLRadioButton=driver.findElement(By.id("html"));
		WebElement CSSRadioButton=driver.findElement(By.id("css"));
		WebElement JavaScripRadioButton=driver.findElement(By.id("javascript"));
		HTMLRadioButton.click();
		CSSRadioButton.click();
		JavaScripRadioButton.click();
	}

}
