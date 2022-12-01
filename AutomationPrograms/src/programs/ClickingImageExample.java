package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingImageExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://jntuh.ac.in/content/donars/58/c5cc53e4c4bf67844ddc11179c39364a");
		driver.manage().window().maximize();
		
		WebElement JNTULogo=driver.findElement(By.xpath("/html/body/header/div[3]/div/div[1]/a/img"));
		JNTULogo.click();
	}

}
