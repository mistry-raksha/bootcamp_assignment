package Testng_framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class T4_Test {
  @Test
  public void f() throws InterruptedException {
	  
	//xpath of alert button
	driver.findElement(By.xpath("/html/body/div/div[2]/div/div/span")).click();
	Thread.sleep(5000);
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();//will click ok
	
	
	driver.switchTo().parentFrame();
	
	
	driver.findElement(By.xpath("/html/body/div/div[5]/div/div/span")).click();
	Thread.sleep(5000);
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();//will click ok
	
	driver.findElement(By.xpath("/html/body/div/div[5]/div/div/span")).click();
	Thread.sleep(5000);
	driver.switchTo().alert().dismiss();//will dismiss
	
	driver.switchTo().parentFrame();
	
	  
	  
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
		
		String url="https://webdriveruniversity.com/Popup-Alerts/index.html";
		driver.get(url);

  }

  @AfterClass
  public void afterClass() {
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
