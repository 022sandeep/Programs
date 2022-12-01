package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://jntuh.ac.in/content/about-iqac/63/89ac962e121824ad31a776572224b24f#");
		driver.manage().window().maximize();
		
		WebElement academics=driver.findElement(By.xpath("//*[text()='Academics']"));
		academics.click();
		
		WebElement syllabus=driver.findElement(By.xpath("//*[text()='Syllabus']"));
		syllabus.click();
	}

}
