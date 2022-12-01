package programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("iframeResult");
		
		WebElement tryIt=driver.findElement(By.cssSelector("body > button"));
		tryIt.click();
		//Switch on Alert
		
		//driver.switchTo().alert().accept();
		Thread.sleep(6000);
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(5000);
		//alert.accept();
		alert.dismiss();
		
		

	}

}
