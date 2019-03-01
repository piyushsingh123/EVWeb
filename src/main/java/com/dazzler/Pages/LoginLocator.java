package com.dazzler.Pages;

import org.openqa.selenium.By;
public class LoginLocator 
{
	public static final By XPATH_USERNAME = By.id("email");
	public static final By XPATH_PASSWORD = By.id("password");
	public static final By SIGNIN = By.id("SignIn");
	public static final By YOURTRIPS = By.linkText("Your trips");
	public static final By SignINBut = By.id("signInButton");
	public static final By done = By.xpath("//form[contains(@id, 'SearchForm')]/descendant::h1[contains(text(), 'Search flights')]");
}
