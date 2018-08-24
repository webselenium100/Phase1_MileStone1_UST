package com.cname.core.framework.sewebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cname.core.framework.utils.FindBy;
import com.cname.projectname.testinitialization.Driver;

public class SeWebDriver 
{
	WebElement e1;
	List<WebElement> lst;
	public SeWebDriver()
	{
			
	}
	
	public void passUrl(String url)
	{
		try
		{
			Driver.driver.get(url);
		}
		catch(Exception e)
		{
			new Exception("Invalid Url");
		}
	}
	
	public WebElement findWebElement(String locator, String locatorValue)
	{
		try
		{
			e1 = Driver.driver.findElement(FindBy.seLocator(locator, locatorValue));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return e1;
	}
	
	public List<WebElement> findWebElements(String locator, String locatorValue)
	{
		try
		{
			lst = Driver.driver.findElements(FindBy.seLocator(locator, locatorValue));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return lst;
	}
}
