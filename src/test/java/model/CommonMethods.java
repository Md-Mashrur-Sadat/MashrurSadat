package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base.Base;

public class CommonMethods extends Base{
	
	public static String getTitle() {
		return driver.getTitle();
	}
	
	public static void clickOnButton(By btn) {
		driver.findElement(btn).click();
	}
	
	public static String getText(By element) {
		return driver.findElement(element).getText();
	}
	
	public static void sendText(By element, String value) {
		driver.findElement(element).sendKeys(value);
	}
	
	public static void select(By element, String value) {
		
		 WebElement n = driver.findElement(element);
		 Select sl = new Select(n);
	     //option by value
	     sl.selectByValue(value);
	}
	
	public static void clearInputField(By element) {
		
		 WebElement n = driver.findElement(element);
	     
	     n.clear();
	}
	
	
	public static void hover(By option) {
		
		WebElement menuOption = driver.findElement(option);
		//Instantiate Action Class        
	    Actions action= new Actions(driver);
	    action.clickAndHold(menuOption).build().perform();
	}
	
	public static void timeout(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
