package Testng_framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class T13_Test {
  @Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.id("firstName")).sendKeys("raksha");
	  Thread.sleep(2000);
	  driver.findElement(By.id("lastName")).sendKeys("mistry");
	  Thread.sleep(2000);
	  driver.findElement(By.id("username")).sendKeys("rakshamis123");
	  Thread.sleep(2000);
	  	 
	  driver.findElement(By.name("Passwd")).sendKeys("Raksha@2401");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.name("ConfirmPasswd")).sendKeys("Raksha@2401");
	  Thread.sleep(2000);
	   
	  System.out.println("Value of firstname input: "+driver.findElement(By.id("firstName")).getAttribute("value"));
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button")).click();
	  Thread.sleep(2000);
	
	 
  }
 

  WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String url="https://accounts.google.com/signup";
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
