package Testng_framework;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class T11_Test {
	static ExtentTest test;
	static ExtentReports report;
	
  @Test
  public void f(){
	  if(driver.getTitle().equals("Google"))
	  {
	  test.log(LogStatus.PASS, "Navigated to the specified URL");
	  }
	  else
	  {
	  test.log(LogStatus.FAIL, "Test Failed");
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
		
		String url="https://www.google.com/";
		driver.get(url);
	  
	  
	  report = new ExtentReports("C:\\Users\\123\\Downloads\\extent\\"+"ExtentReportResults.html");
	  test = report.startTest("T11_Test");
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  report.endTest(test);
	  report.flush();
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
