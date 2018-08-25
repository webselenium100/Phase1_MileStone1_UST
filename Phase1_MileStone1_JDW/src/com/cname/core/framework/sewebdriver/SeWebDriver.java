package com.cname.core.framework.sewebdriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cname.core.framework.utils.FindBy;
import com.cname.core.framework.utils.Global;
import com.cname.projectname.testinitialization.Driver;

public class SeWebDriver 
{
	public WebElement e1;
	public List<WebElement> lst;
	
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
	
	public String getTitle()
	{
		String data = null;
		try
		{
			data = Driver.driver.getTitle();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	
	public String getWinId()
	{
		String data = null;
		try
		{
			data = Driver.driver.getWindowHandle();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	
	public Set<String> getWinIds()
	{
		Set<String> data = null;
		try
		{
			data = Driver.driver.getWindowHandles();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	
	
	public void switchToWindow(String expectedTitle)
	{
		try
		{
			String mainWinId  = getWinId();
			Set<String> allWinIds = getWinIds();
			for(String winId : allWinIds)
			{
				Driver.driver.switchTo().window(winId);
				String actualTitle = getTitle();
				if(expectedTitle.equals(actualTitle))
				{
					break;
				}
			}
		}
		catch(Exception e)
		{
			new Exception("Invalid Windows");
		}
	}
	
	public void implicitlyWait()
	{
		try
		{
			Driver.driver.manage().timeouts().implicitlyWait(Global.syncTime, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void pageLoadWait()
	{
		try
		{
			Driver.driver.manage().timeouts().pageLoadTimeout(Global.syncTime, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void waitForElementPresent(String locator, String locatorValue)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(Driver.driver, Global.syncTime);
			wait.until(ExpectedConditions.presenceOfElementLocated(FindBy.seLocator(locator, locatorValue)));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public Actions getActions()
	{
		Actions act = null;
		try
		{
			act = new Actions(Driver.driver);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return act;
	}
	
	public void perform()
	{
		try
		{
			getActions().perform();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void moveToElement()
	{
		try
		{
			getActions().moveToElement(e1).perform();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
}
