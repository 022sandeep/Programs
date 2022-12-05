package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		
		driver.switchTo().frame("iframeResult");
		
		
		WebDriverWait w=new WebDriverWait(driver,5);
			
		WebElement tryIt=w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > button")));
		tryIt.click();
		//Switch on Alert
		
		//driver.switchTo().alert().accept();
		Thread.sleep(6000);
		
		
		Alert alert=w.until(ExpectedConditions.alertIsPresent());
		//Alert alert=driver.switchTo().alert();
		
		//alert.accept();
		alert.dismiss();
		
		

	}

}
