package com.dazzler.Pages;

import java.util.HashMap;

import org.openqa.selenium.By;

import com.dazzler.util.XMLReader;

public class HotelLocator 
{
	public static final By HOTEL = By.linkText("Hotels");
	public static final By FROM = By.name("from");
	public static final By FROM_DATE = By.id("CheckInDate");
	public static final By FDATE = By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[3]/a");
	public static final By TO_DATE = By.id("CheckOutDate");
	public static final By TDATE = By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[3]/a");
	public static final By COUNT = By.xpath(".//*[@id='travellersOnhome']");
	public static final By SEARCH = By.id("SearchHotelsButton");
}
