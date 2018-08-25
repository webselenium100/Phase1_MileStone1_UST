package com.ust.nbrown.businessspecificlib.sbeus;

import com.cname.core.framework.sewebelement.SeWebElement;
import com.ust.nbrown.pageobject.sbeus.SBUSPLPPageObj;

public class SBUSPLPPage 
{
	public SeWebElement swebelement;
	public SBUSPLPPage()
	{
		 swebelement = new SeWebElement();
	}
	
	public void selectProductFromPLPPage()
	{
		try
		{
			swebelement.click("xpath", SBUSPLPPageObj.plpProduct);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
