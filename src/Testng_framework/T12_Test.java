package Testng_framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class T12_Test {
	
	
  @Test(dataProvider = "dp")
  public void f(String a, String s) throws InterruptedException {
	  
	  WebElement searchText = driver.findElement(By.name("q"));
     
      searchText.sendKeys(s);
      System.out.println("Welcome ->"+a+" Your search key is->"+s);
      
      Thread.sleep(2000);
      String testValue = searchText.getAttribute("value");
      System.out.println(testValue +" : "+s);
      searchText.clear();
      //Verify if the value in google search box is correct
      Assert.assertTrue(testValue.equalsIgnoreCase(s));
      
    
      
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    
    return new Object[][] 
        	{
                { "Captial", "Delhi" },
                { "South", "Mysore" },
                { "Beach", "Goa" }
            };
  }
  
  WebDriver driver;
   @BeforeClass
  public void beforeClass() {
  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String url="https://www.google.com/";
		driver.get(url);
  
  }

  @AfterClass
  public void afterClass() {
  driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
