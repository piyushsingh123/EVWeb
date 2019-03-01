package com.dazzler.booking;

import java.awt.AWTException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.dazzler.Pages.Flight;
import com.dazzler.Pages.Hotel;
import com.dazzler.Pages.Login;
import com.dazzler.base.BaseClass;
import com.dazzler.base.Common;
import com.dazzler.util.Prop;
import com.dazzler.util.XMLReader;

//@Listeners(Listener.class)
public class FlightBooking
{
	
	public WebDriver driver=null;
	Login l;
	Flight b;
	Hotel e;
	HashMap<String,String> m = Prop.getProperty("/src/main/java/config/config.properties");
	HashMap<String,String> d = XMLReader.getTestData("/Flightdata.xml");
	String userName=d.get("user");
	String password=d.get("password");
	String browser=m.get("browser");
	String url=m.get("url");
	String from=d.get("from");
	String to=d.get("to");
	String date=d.get("date");
	String location=d.get("location");
	
	@BeforeSuite(alwaysRun = true)
	public void init()
	{
		driver = BaseClass.selectBrowser(browser);
		driver.get(url);
		l = new Login(driver);
		b = new Flight(driver);
		e = new Hotel(driver);
	}
	
	@Test(priority=0,description = "Login",alwaysRun = true)
	public void login() throws InterruptedException
	{
		Assert.assertEquals(l.login(userName, password), true, "Login not happened");
		Reporter.log("Login Done",true); 
		Common.wait(100);
	}
	
	@Test(priority=1,description = "Hotel Reservation",dependsOnMethods = {"login"})
	public void travel() throws InterruptedException, AWTException
	{
		e.fill(location);
	    Reporter.log("Hotel Reservation Done",true); 
	}
	
	@Test(priority=2,description = "Fligth Reservation",dependsOnMethods = {"login"})
	public void travelagain() throws InterruptedException, AWTException
	{
	    Common.wait(3000);
		b.booking(from,to,date);
	    Reporter.log("Flight Reservation Done",true);
	}
	
	@AfterSuite
	public void exit()
	{
		driver.close();	
	}
}
