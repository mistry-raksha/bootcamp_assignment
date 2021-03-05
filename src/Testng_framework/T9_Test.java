package Testng_framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class T9_Test {
  @Test
  public void f() {
	  
	  //Storing the links in a list and traversing through the links
      List<WebElement> links = driver.findElements(By.tagName("a"));

      // This line will print the number of links and the count of links.
      System.out.println("No of links are "+ links.size());  
    
      //checking the links fetched.
      for(int i=0;i<links.size();i++)
      {
          WebElement E1= links.get(i);
          String url= E1.getAttribute("href");
          verifyLinks(url);
      }
  }
      public static void verifyLinks(String linkUrl)
      {
          try
          {
              URL url = new URL(linkUrl);
   
              //Now we will be creating url connection and getting the response code
              HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
              httpURLConnect.setConnectTimeout(5000);
              httpURLConnect.connect();
              if(httpURLConnect.getResponseCode()>=400)
              {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
              }    
         
              //Fetching and Printing the response code obtained
              else{
                  System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
              }
          }catch (Exception e) {
        }
			
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	 	
	  driver.manage().window().maximize();
	  
	  String url="https://www.zlti.com/";
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
