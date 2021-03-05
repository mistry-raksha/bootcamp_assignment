package Testng_framework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class T17_Test {
  @Test
  public void f() {
	  SoftAssert softAssertion= new SoftAssert();
		
	//id of whole table
		WebElement tbl=driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]/table[1]"));
			
		//fetch all tr of table
		List<WebElement> rows=tbl.findElements(By.tagName("tr"));
			
		for(int i=3;i<=11;i++)
			{
				
				List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
				Double pin=Double.valueOf(cols.get(2).getText());
				System.out.println("pincode 1: "+pin+" "+i);
				
				for(int j=i+1;j<=11;j++)
				{
					List<WebElement> cols2=rows.get(j).findElements(By.tagName("td"));
					
				
				System.out.println("pincode 2: "+cols2.get(2).getText()+" "+j);
				
				
				//System.out.println(pin);
				if(pin==(Double.valueOf(cols2.get(2).getText())))
				{
					
					softAssertion.assertFalse(pin==(Double.valueOf(cols2.get(2).getText())));
				  // System.out.print("Pincode Matched"+cols.get(2).getText()+"at number"+cols2.get(0).getText());
					System.out.println("pincode row"+i+" col"+j);
					
				}
				
				
				}
			}
		softAssertion.assertAll();
	  
			   //System.out.println("no matched pincode ");
		   
	  
 }
  
  WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String url="https://chennaiiq.com/chennai/pincode-by-name.php";
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

}
