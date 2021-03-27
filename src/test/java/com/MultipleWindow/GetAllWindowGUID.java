package com.MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;

public class GetAllWindowGUID extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		launchFirefox();
		openMultipleWindowPage();
		allGUID();
		closeBrowser();
		
	}
	
	public static void openMultipleWindowPage() {
		driver.get("https://the-internet.herokuapp.com/windows");
	}
	
	public static void allGUID() throws InterruptedException {
		String ParentGUID=driver.getWindowHandle();
		System.out.println("parent Window GUID=" +ParentGUID);
		
		WebElement NewWindowBtn=driver.findElement(By.cssSelector("#content > div > a"));
		NewWindowBtn.click();
		Thread.sleep(3000);
		
		//Get all session ID
		Set<String> allGUID=driver.getWindowHandles();
		System.out.println(allGUID);
		
		
		
		
	}

}
