package com.cname.core.framework.utils;

import org.openqa.selenium.By;

public class FindBy
{
	public static By seLocator(String locator, String locatorValue)
	{
		By by = null;
		
		switch (locator) 
		{
			case "id":
				by = By.id(locatorValue);
				break;
				
			case "name":
				by = By.name(locatorValue);
				break;
				
			case "xpath":
				by = By.xpath(locatorValue);
				break;
				
			case "class_name":
				by = By.className(locatorValue);
				break;
				
			case "cssSelector":
				by = By.cssSelector(locatorValue);
				break;
				
			case "link_text":
				by = By.linkText(locatorValue);
				break;
				
			case "partial_LinkText":
				by = By.partialLinkText(locatorValue);
				break;
				
			case "tagName":
				by = By.tagName(locatorValue);
				break;

			default:
				break;
		}
		
		return by;
	}
}
