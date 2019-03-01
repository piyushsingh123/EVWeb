package com.dazzler.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.dazzler.base.Common;

public class Login extends LoginLocator
{
	WebDriver driver;
	public Login(WebDriver driver)
	{
	   this.driver = driver;	
	}
	public boolean login(String userName,String password) throws InterruptedException
	{
		Common.getElement(driver,YOURTRIPS).click();
		Common.wait(1000);
		Common.getElement(driver,SIGNIN).click();
		Common.wait(2000);
		driver.switchTo().frame("modal_window");
		Common.wait(1000);
		Common.getElement(driver, XPATH_USERNAME).sendKeys(userName);
		Common.wait(1000);
		Common.getElement(driver,XPATH_PASSWORD).sendKeys(password);
		Common.wait(1000);
		Common.getElement(driver,SignINBut).click();
		String text=Common.getElement(driver, done).getText();
		if(text.equalsIgnoreCase("Search flights"));
		return true;
	}

}
