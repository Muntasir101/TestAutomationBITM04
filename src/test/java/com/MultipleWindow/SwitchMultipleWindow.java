package com.MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;

/*
 * Open parent window
 * open child window
 * print child window title
 * Back to parent and print parent window title
 * Again go to Child 
 * Open Demo.opencat in child and print URL
 * Again back to parent
 * Open Google in parent and print URL
 * 
 */

public class SwitchMultipleWindow extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		launchFirefox();
		GetAllWindowGUID.openMultipleWindowPage();
		switchWindow();
		closeBrowser();
	}

	public static void switchWindow() throws InterruptedException {

		String ParentGUID=driver.getWindowHandle();

		WebElement NewWindowBtn=driver.findElement(By.cssSelector("#content > div > a"));
		NewWindowBtn.click();
		Thread.sleep(3000);

		Set<String> allGUID=driver.getWindowHandles();

		// Child Window
		for(String ChildGUID : allGUID) {
			if(!ChildGUID.equals(ParentGUID)) {
				driver.switchTo().window(ChildGUID);
				System.out.println("Child Window Title: "+driver.getTitle());
				break;
			}
		}

		// Back to Parent
		for(String ChildGUID : allGUID) {
			if(!ChildGUID.equals(ParentGUID)) {
				driver.switchTo().window(ParentGUID);
				Thread.sleep(3000);
				System.out.println("Parent Window Title: "+driver.getTitle());
				break;
			}
		}

		// Again go to Child
		for(String ChildGUID : allGUID) {
			if(!ChildGUID.equals(ParentGUID)) {
				driver.switchTo().window(ChildGUID);
				Thread.sleep(3000);
				driver.get("https://demo.opencart.com/");
				System.out.println("Open Cart URL: "+driver.getCurrentUrl());
				break;
			}
		}

		// Again back to Parent
		for(String ChildGUID : allGUID) {
			if(!ChildGUID.equals(ParentGUID)) {
				driver.switchTo().window(ParentGUID);
				Thread.sleep(3000);
				driver.get("https://google.com/");
				System.out.println("Google URL: "+driver.getCurrentUrl());
				break;
			}
		}
	}



}
