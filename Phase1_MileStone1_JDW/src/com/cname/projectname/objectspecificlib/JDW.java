package com.cname.projectname.objectspecificlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cname.core.framework.utils.FindBy;
import com.cname.core.framework.utils.Global;
import com.cname.projectname.testinitialization.Driver;

public class JDW 
{
	public boolean menuNavigation(String menuName, String title)
	{
		boolean flag = false;
		try
		{
			WebElement w1 = Driver.driver.findElement(By.xpath("(//a[@id='topNav_"+menuName+"'])"));
			boolean b = w1.isDisplayed();
			if(b)
			{
				w1.click();
				flag = verifyPage(title);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public boolean subMenuNavigation(String menuName, String subMenu, String title)
	{
		boolean flag = false;
		try
		{
			WebElement w1 = Driver.driver.findElement(By.xpath("(//a[@id='topNav_"+menuName+"'])"));
			boolean b = w1.isDisplayed();
			if(b)
			{
				Actions act = new Actions(Driver.driver);
				act.moveToElement(w1).perform();
				
				flag = verifyPage(title);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public boolean verifyPage(String title)
	{
		try
		{
			Driver.driver.manage().timeouts().pageLoadTimeout(Global.syncTime, TimeUnit.SECONDS);
			String actualTitle = Driver.driver.getTitle();
			return actualTitle.contains(title);
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}
}
