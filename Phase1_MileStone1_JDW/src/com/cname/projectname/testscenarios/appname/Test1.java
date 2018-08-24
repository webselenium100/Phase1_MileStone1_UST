package com.cname.projectname.testscenarios.appname;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cname.core.framework.datalayer.Excel;
import com.cname.core.framework.datalayer.Property;
import com.cname.core.framework.sewebdriver.SeWebDriver;
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
		String url = Excel.getData("Sheet1", 2, 4);
		SeWebDriver sdriver = new SeWebDriver();
		sdriver.passUrl(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement w1 = sdriver.findWebElement("xpath", "//input[@id='searchString1']");
		w1.sendKeys("Jeans");
	}
}
