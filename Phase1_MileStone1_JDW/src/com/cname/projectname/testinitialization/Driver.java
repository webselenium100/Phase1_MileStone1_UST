package com.cname.projectname.testinitialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.cname.core.framework.utils.Global;

public class Driver 
{
	public static WebDriver driver=null;
	public static WebDriver getDriver()
	{
		String bName = Global.browserName;
		
		switch (bName)
		{
			case "chrome":
				System.setProperty("webdriver.chrome.driver", Global.chroPath);
				driver = new ChromeDriver();
				break;
			
			case "firefox":
				System.setProperty("webdriver.gecko.driver", Global.ffPath);
				driver = new FirefoxDriver();
				break;
				
			case "ie":
				System.setProperty("webdriver.ie.driver", Global.iePath);
				driver = new InternetExplorerDriver();
				break;

			default:
				System.out.println("Invalid Browser");
				break;
		}
		
		return driver;
		
		
	}
}
