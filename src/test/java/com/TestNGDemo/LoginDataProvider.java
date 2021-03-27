package com.TestNGDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
 * Data Driven Framework
 * Data Provider
 * Login test
 * Log generate in TestNG
 * Add Extent Report listener
 */

public class LoginDataProvider extends BaseTestNGClass {



	@DataProvider(name="Login Data")
	public Object[][] data(){
		/*
		 * Rows and Columns
		 */
		Object [][] data=new Object[3][2]; //row and column
		
		//1st data set
		data[0][0]="email1@mail.com";
		data[0][1]="12345sde6";
		
		//2nddata set
		data[1][0]="email2@mail.com";
		data[1][1]="123456ee";
		
		//3rd data set
		data[2][0]="email3@mail.com";
		data[2][1]="123rrw456";
				
		return data;
	}
	
	@Test(dataProvider="Login Data")
	public void loginTest(String email,String password) throws InterruptedException, IOException {
	

		
		launchFirefox();
		Reporter.log("Firefox Browser Launched Successfully.");
		
		
		driver.get("https://demo.opencart.com/");
		Reporter.log("Home Page Open Successfully.");
		
		Thread.sleep(3000);
		
		WebElement Account= driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));		
		Account.click();
		
		WebElement openlogin= driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		openlogin.click();
		Thread.sleep(2000);
		Reporter.log("Login page Open Successfully.");
		
		
		//Implementation
		WebElement Username=driver.findElement(By.name("email"));
		WebElement Password=driver.findElement(By.name("password"));	
		WebElement LoginBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		
		//Login Action
		Username.clear();
		Username.sendKeys(email);
		Reporter.log(email + "  Input Scuccessful.");
		
		Thread.sleep(2000);
		
		Password.clear();
		Password.sendKeys(password);
		Reporter.log(password + "   Input Scuccessful.");
		
		Thread.sleep(3000);
		
		LoginBtn.click();
		Reporter.log("Login Button Click Scuccessful.");
		
		Thread.sleep(3000);
		
		String ExpectedTitle="Account Login";	
		String ActualTitle=driver.getTitle();
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Test pass for invalid login.");
			Reporter.log("Test Passed.");
			
			
		}
		
		else {
			System.out.println("Test failed.");
			Reporter.log("Test Failed.");
			
		}
		
		closeBrowser();
		Reporter.log("Test Complete and Browser Close");
	
	}

}
