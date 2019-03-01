package com.dazzler.Pages;

import java.util.HashMap;

import org.openqa.selenium.By;

import com.dazzler.util.XMLReader;


public class FlightLocator 
{	
	public static final By FLIGHT = By.linkText("Flights");
	public static final By TYPE = By.id("OneWay");
	public static final By FROM = By.id("FromTag");
	public static final By TO = By.id("ToTag");
	public static final By FROM_DATE = By.id("DepartDate");
	public static final By CLOSE = By.xpath("//section[@class='row fieldRow searchBox']");
	public static final By ADULTS = By.xpath(".//*[@id='Adults']");
	public static final By CHILDREN = By.xpath(".//*[@id='Childrens']");
	public static final By INFANTS = By.xpath(".//*[@id='Infants']");
	public static final By MORE = By.xpath(".//*[@id='MoreOptionsLink']");
	public static final By CLASS = By.xpath(".//*[@id='Class']");
	public static final By SEARCH = By.id("SearchBtn");
}
