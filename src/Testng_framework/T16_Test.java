package Testng_framework;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class T16_Test {
  @Test
  public void f() throws IOException {
	  
	  File fp=new File("E:\\Bootcamp assignment Screenshot\\day4\\Assi_Excel.xlsx");
		FileInputStream fin=new FileInputStream(fp);
		XSSFWorkbook wbook=new XSSFWorkbook(fin);
		XSSFSheet sht=wbook.getSheet("Sheet1");
		int rowcount=sht.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			Long empid=(long)sht.getRow(i).getCell(0).getNumericCellValue();
			String empname=sht.getRow(i).getCell(1).getStringCellValue();
			String dc=sht.getRow(i).getCell(2).getStringCellValue();
			
			System.out.println(empid+" "+empname+" "+dc);	
		}
		fin.close();
		wbook.close();
	  
  }
  
  
 
  @BeforeClass
  public void beforeClass() {
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
