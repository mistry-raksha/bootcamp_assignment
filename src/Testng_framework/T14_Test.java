package Testng_framework;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
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

public class T14_Test {
	
  @Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.xpath("/html/body/div/div[1]/div/ul/li[2]/a")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("/html/body/div/div[2]/div/h2[1]/a")).click();
	  Thread.sleep(2000);
	  
	  WebElement list1=driver.findElement(By.id("search_type"));// id of dropdown
		Select sel=new Select(list1);// used only for dropdown
		sel.selectByIndex(2);
		Thread.sleep(3000);
		
		driver.findElement(By.id("search_patient")).click();
		 Thread.sleep(2000);
		   
  } 
  WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String url="http://openclinic.sourceforge.net/openclinic/home/index.php";
		driver.get(url);
  }

  @AfterClass
  public void afterClass() {
	  //driver.quit();
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
