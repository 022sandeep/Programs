package facebookProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookAccount 
{
	WebDriver driver;
	String expectedTitle="Facebook – log in or sign up";
	
	@BeforeTest
	  public void preRequisite() 
	  {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
	  }	
	
	
	@Test(priority=0,description="TC1: Verify facebook home page title",groups="Sanity")
  public void validatingFacebookPageTitle()
  {
		String actualTitle=driver.getTitle(); 
		Assert.assertEquals(actualTitle, expectedTitle,"Actual title and expected title are not matching");

  }
  
	@Test(priority=5,description="TC2:Validating Log in functionality web elemnts",groups="Regression")
    public void verifyingLoginWebElements()
	{
		WebElement emailTextBox=driver.findElement(By.id("email"));
		WebElement passwordTextBox=driver.findElement(By.id("pass"));
		WebElement logInButton=driver.findElement(By.name("login"));
		Assert.assertTrue(emailTextBox.isDisplayed(),"Email Text box is not displaying");
		Assert.assertTrue(passwordTextBox.isDisplayed(),"Password Text box is not displaying");
		Assert.assertTrue(logInButton.isDisplayed(),"Log in btton is not displaying");		
		
	}
	
	@Test(priority=-5000,description="TC3:Verifying log in functionality",groups="Sanity")
    public void verifyingWrongCredentials() throws InterruptedException
	{
		WebElement emailTextBox=driver.findElement(By.id("email"));
		WebElement passwordTextBox=driver.findElement(By.id("pass"));
		WebElement logInButton=driver.findElement(By.name("login"));
		emailTextBox.sendKeys("df35667dfdddf@gmail.com");
		passwordTextBox.sendKeys("gfufjgkjgjihiuhu");
		logInButton.click();
		String expTitleOfWrongLoginPage="Log in to Facebook";
		Thread.sleep(4000);
		String actTitle=driver.getTitle();		
		Assert.assertEquals(actTitle, expTitleOfWrongLoginPage,"Expected and Actual titles are not matching");
		
	}
	

  @AfterTest
  public void afterMethod()
  {
	  driver.close();
  }

}
