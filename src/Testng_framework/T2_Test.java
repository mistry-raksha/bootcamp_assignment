package Testng_framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class T2_Test {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) throws InterruptedException {
	  
	  WebElement list1=driver.findElement(By.id("dropdowm-menu-1"));// id of dropdown 1
		
		Select sel=new Select(list1);// used  for dropdown
		sel.selectByIndex(2);//index start with 0 - 0th element is '--ALL--'
		
		Thread.sleep(2000);
	  
	WebElement list2=driver.findElement(By.id("dropdowm-menu-2"));// id of dropdown 2
		
	Select sel1=new Select(list2);// used  for dropdown
	sel1.selectByIndex(1);//index start with 0 - 0th element is '--ALL--'
	Thread.sleep(2000);
	
	
	WebElement list3=driver.findElement(By.id("dropdowm-menu-3"));// id of dropdown 3
	
	Select sel2=new Select(list3);// used  for dropdown
	sel2.selectByIndex(3);//index start with 0 - 0th element is '--ALL--'
		
  }
  
 
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
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
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);//implicit wait
		String url="https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html";
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
