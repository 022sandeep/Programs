package facebookProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
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
  
	@Test
    public void f2()
	{
	}
	
	@Test
    public void f3()
	{
	}
	

  @AfterMethod
  public void afterMethod()
  {
	  driver.close();
  }

}
