package com.cname.core.framework.sewebelement;

import org.openqa.selenium.WebElement;

import com.cname.core.framework.sewebdriver.SeWebDriver;

public class SeWebElement 
{
	public SeWebDriver sdriver;
	public SeWebElement()
	{
		sdriver = new SeWebDriver();
	}
	
	public void click(String locator, String locatorValue)
	{
		try
		{
			sdriver.findWebElement(locator, locatorValue).click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void setValue(String locator, String locatorValue, String val)
	{
		try
		{
			sdriver.findWebElement(locator, locatorValue).sendKeys(val);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String getText(String locator, String locatorValue)
	{
		String data = null;
		try
		{
			data= sdriver.findWebElement(locator, locatorValue).getText();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	

}
