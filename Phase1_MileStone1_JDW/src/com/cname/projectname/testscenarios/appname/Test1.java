package com.cname.projectname.testscenarios.appname;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cname.core.framework.datalayer.Property;
import com.cname.projectname.testinitialization.Driver;

public class Test1
{
	public WebDriver driver;
	@BeforeClass
	public void init()
	{
		driver = Driver.getDriver();
	}
	
	@Test
	public void test1()
	{
		driver.get(Property.getProValue("url"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
}
