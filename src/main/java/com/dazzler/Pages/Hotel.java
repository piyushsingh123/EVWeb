package com.dazzler.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.dazzler.base.Common;

public class Hotel extends HotelLocator
{
	WebDriver driver;
	
	public Hotel(WebDriver driver)
	{
	   this.driver = driver;	
	}
	public void fill(String location) throws InterruptedException, AWTException
	{
		Common.getElement(driver,HOTEL).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Common.getElement(driver,FROM).sendKeys(location);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Common.wait(1000);
		Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
		Common.getElement(driver,FROM_DATE).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Common.getElement(driver,FDATE).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Common.getElement(driver,TO_DATE).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Common.getElement(driver,TDATE).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Select cnt= new Select(Common.getElement(driver,COUNT));
		cnt.selectByValue("4");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		Common.getElement(driver,SEARCH).click();
	}
}
