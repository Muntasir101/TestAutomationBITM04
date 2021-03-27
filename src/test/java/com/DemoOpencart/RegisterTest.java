package com.DemoOpencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;


public class RegisterTest extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		launchFirefox();
		//launchChrome();
		openTestHomePage();
		openTestRegisterPage();
		register_valid_TC_01();
		Thread.sleep(3000);
		closeBrowser();	
	}
	
	public static void openTestHomePage() {			
		driver.get("https://demo.opencart.com/index.php?route=common/home");
	}
	
	public static void openTestRegisterPage() {
		
		WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
		myAccount.click();
		WebElement openRegister = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
		openRegister.click();
	}	
	
	public static void register_valid_TC_01() {
		
		WebElement FirstName = driver.findElement(By.name("firstname"));
		WebElement LastName = driver.findElement(By.name("lastname"));
		WebElement Email = driver.findElement(By.name("email"));
		WebElement Telephone = driver.findElement(By.name("telephone"));
		WebElement Password = driver.findElement(By.name("password"));
		WebElement ConfrimPassword = driver.findElement(By.name("confirm"));
		WebElement CheckBox = driver.findElement(By.name("agree"));
		WebElement ContinueButton = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
				
		FirstName.clear();
		FirstName.sendKeys("Mr.John");
		
		LastName.clear();
		LastName.sendKeys("Smith");
		
		Email.clear();
		Email.sendKeys("selenium507@gmail.com");
		
		Telephone.clear();
		Telephone.sendKeys("0123456789");
		
		Password.clear();
		Password.sendKeys("abc123");
		
		ConfrimPassword.clear();
		ConfrimPassword.sendKeys("abc123");
		
		CheckBox.click();
		//Thread.sleep(3000);
		ContinueButton.click();
		
	}
}
