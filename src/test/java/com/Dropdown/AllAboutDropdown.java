package com.Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Base.BaseClass;

public class AllAboutDropdown extends BaseClass{



	public static void main(String[] args) throws InterruptedException {
		launchFirefox();
		openDropdownPage();
		allOptions();
		selectIndex();
		selectValue();
		selectVisibleText();
		closeBrowser();

	}

	public static void openDropdownPage() {

		driver.get("https://the-internet.herokuapp.com/dropdown");
	}


	public static void allOptions() {
		WebElement Dropdwn=driver.findElement(By.id("dropdown"));
		Select drpdwn=new Select(Dropdwn);

		List<WebElement> options=drpdwn.getOptions();
		int size=options.size();

		for(int i=0; i<size; i++) {
			String optionsValue=options.get(i).getText();
			System.out.println(optionsValue);
		}
	}

	public static void selectIndex() throws InterruptedException {
		WebElement Dropdwn=driver.findElement(By.id("dropdown"));
		Dropdwn.click();
		Thread.sleep(2000);
		Select drpdwn=new Select(Dropdwn);		
		drpdwn.selectByIndex(1);
		Thread.sleep(4000);

	}
	
	public static void selectValue() throws InterruptedException {
		WebElement Dropdwn=driver.findElement(By.id("dropdown"));
		Dropdwn.click();
		Thread.sleep(2000);
		Select drpdwn=new Select(Dropdwn);		
		drpdwn.selectByValue("2");
		Thread.sleep(4000);

	}
	
	public static void selectVisibleText() throws InterruptedException {
		WebElement Dropdwn=driver.findElement(By.id("dropdown"));
		Dropdwn.click();
		Thread.sleep(2000);
		Select drpdwn=new Select(Dropdwn);		
		drpdwn.selectByVisibleText("Option 1");
		Thread.sleep(2000);
	}

}
