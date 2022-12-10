package facebookProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class FacebookHomePage 
{
	WebDriver driver;
	String expectedTitle="Facebook – log in or sign up";
	
	@BeforeMethod
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
	
	
	@Test(description="TC1: Verify facebook home page title")
  public void validatingFacebookPageTitle()
  {
		String actualTitle=driver.getTitle(); 
		Assert.assertEquals(actualTitle, expectedTitle,"Actual title and expected title are not matching");

  }
  
	@Test(description="TC2:Validating Log in functionality web elemnts")
    public void verifyingLoginWebElements()
	{
		WebElement emailTextBox=driver.findElement(By.id("email123"));
		WebElement passwordTextBox=driver.findElement(By.id("pass"));
		WebElement logInButton=driver.findElement(By.name("login"));
		Assert.assertTrue(emailTextBox.isDisplayed(),"Email Text box is not displaying");
		Assert.assertTrue(passwordTextBox.isDisplayed(),"Password Text box is not displaying");
		Assert.assertTrue(logInButton.isDisplayed(),"Log in btton is not displaying");		
		
	}
	
	@Test(description="TC3:Verifying log in functionality",dependsOnMethods= {"verifyingLoginWebElements"})
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
	

  @AfterMethod
  public void afterMethod()
  {
	  driver.close();
  }

}
