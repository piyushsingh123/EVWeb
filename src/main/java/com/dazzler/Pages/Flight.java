package com.dazzler.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.dazzler.base.Common;

public class Flight extends FlightLocator
{
	WebDriver driver;
	
	public Flight(WebDriver driver)
	{
	   this.driver = driver;	
	}
	public void booking(String f,String t,String d) throws InterruptedException, AWTException
	{
		Common.getElement(driver,FLIGHT).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Common.getElement(driver,TYPE).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Common.getElement(driver,FROM).sendKeys(f);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    Common.getElement(driver,TO).sendKeys(t);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
		Common.getElement(driver,FROM_DATE).sendKeys(d);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Common.getElement(driver,CLOSE).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Select adults= new Select(Common.getElement(driver,ADULTS));
		adults.selectByIndex(5);
		Select children= new Select(Common.getElement(driver,CHILDREN));
		children.selectByIndex(3);
		Select infants= new Select(Common.getElement(driver,INFANTS));
		infants.selectByIndex(1);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Common.getElement(driver,MORE).click();
		Select cl= new Select(Common.getElement(driver,CLASS));
		cl.selectByValue("First");
		Common.wait(1000);
		Common.getElement(driver,SEARCH).click();
	}
}
