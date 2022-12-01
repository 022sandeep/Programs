package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("iframeResult");
		
		WebElement bikeCheckBox=driver.findElement(By.id("vehicle1"));
		WebElement carCheckBox=driver.findElement(By.id("vehicle2"));
		WebElement boatCheckBox=driver.findElement(By.id("vehicle3"));
		bikeCheckBox.click();
		carCheckBox.click();
		boatCheckBox.click();
	}

}
