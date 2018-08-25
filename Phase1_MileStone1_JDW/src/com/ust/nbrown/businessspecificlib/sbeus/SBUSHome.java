package com.ust.nbrown.businessspecificlib.sbeus;

import com.cname.core.framework.sewebdriver.SeWebDriver;
import com.cname.core.framework.sewebelement.SeWebElement;
import com.ust.nbrown.pageobject.sbeus.SBUSHomeObj;

public class SBUSHome 
{
	public SeWebDriver swdriver;
	public static SeWebElement swelement;
	public SBUSHome()
	{
		swdriver = new SeWebDriver();
		swelement = new SeWebElement();
	}
	
	public void searchProduct(String value)
	{
		try
		{
			swelement.setValue("xpath", SBUSHomeObj.searchTextBox, value);
			swelement.click("xpath", SBUSHomeObj.searchBtn);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void navigateToPLPFromTopNav(String locator, String locatorValue)
	{
		try
		{
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
