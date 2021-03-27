package com.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;

public class AllAboutAlert extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		launchFirefox();
//		launchChrome();
//		OpenAlertHome();
//		JSAlert();
//		ConfirmAlert();
//		PromptmAlert();
//		closeBrowser();
	}

	public static void OpenAlertHome() {

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");	
	}

	public static void JSAlert() throws InterruptedException {

		WebElement JsAlert=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
		JsAlert.click();
		Thread.sleep(2000);

		//Focus on Alert
		driver.switchTo().alert();

		//Title
		String JsAlerTitle=driver.switchTo().alert().getText();
		System.out.println("Normal Alert Title: "+JsAlerTitle);

		//Click OK
		driver.switchTo().alert().accept();

	}

	public static void ConfirmAlert() throws InterruptedException {

		WebElement JsConfirmAlert=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
		JsConfirmAlert.click();
		Thread.sleep(2000);

		//Focus on Alert
		driver.switchTo().alert();

		//Title
		String ConfirmAlerTitle=driver.switchTo().alert().getText();
		System.out.println("Confirm Alert Title: "+ConfirmAlerTitle);

		//Click OK
		//driver.switchTo().alert().accept();

		//Cancel
		driver.switchTo().alert().dismiss();

	}

	public static void PromptmAlert() throws InterruptedException {

		WebElement JsPromptAlert=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
		JsPromptAlert.click();
		Thread.sleep(2000);

		//Title
		String PromptAlerTitle=driver.switchTo().alert().getText();
		System.out.println("Prompt Alert Title: "+PromptAlerTitle);
		
		//Type on Alert	
		driver.switchTo().alert().sendKeys("Selenium Automation");	
		Thread.sleep(4000);
		driver.switchTo().alert().accept();

		//Cancel
	//driver.switchTo().alert().dismiss();

	}


}
