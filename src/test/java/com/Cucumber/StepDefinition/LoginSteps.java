package com.Cucumber.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver;
	
	@Given("Open Browser")
	public void open_browser() {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
	}

	@And("Open Login Page")
	public void open_login_page() throws InterruptedException {
		driver.get("https://demo.opencart.com/");
		Thread.sleep(3000);
		WebElement Account= driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));		
		Account.click();
		
		WebElement openlogin= driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		openlogin.click();
		Thread.sleep(2000);
	}

	@When("Enter valid Email and valid Password")
	public void enter_valid_email_and_valid_password() throws InterruptedException {
		WebElement Username=driver.findElement(By.name("email"));
		WebElement Password=driver.findElement(By.name("password"));	
		WebElement LoginBtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		
		//Login Action
		Username.clear();
		Username.sendKeys("mail22@mail.com");
		Thread.sleep(2000);
		Password.clear();
		Password.sendKeys("123456");
		Thread.sleep(3000);
		LoginBtn.click();
		Thread.sleep(3000);
			
	}

	@Then("Login successful and open my account page")
	public void login_successful_and_open_my_account_page() {
		
		String ExpectedTitle="My Account";	
		String ActualTitle=driver.getTitle();
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Result: Test pass");
		}
		
		else {
			System.out.println("Test failed. ");
		}
		
		driver.quit();
	}

}
