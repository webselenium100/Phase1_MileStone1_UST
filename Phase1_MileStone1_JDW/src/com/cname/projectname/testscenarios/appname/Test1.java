package com.cname.projectname.testscenarios.appname;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cname.core.framework.datalayer.Excel;
import com.cname.core.framework.datalayer.Property;
import com.cname.core.framework.sewebdriver.SeWebDriver;
import com.cname.core.framework.sewebelement.SeWebElement;
import com.cname.projectname.testinitialization.Driver;
import com.ust.nbrown.businessspecificlib.sbeus.SBUSCheckoutPage;
import com.ust.nbrown.businessspecificlib.sbeus.SBUSHome;
import com.ust.nbrown.businessspecificlib.sbeus.SBUSPLPPage;
import com.ust.nbrown.pageobject.sbeus.SBUSHomeObj;
import com.ust.nbrown.pageobject.sbeus.SBUSPLPPageObj;

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
//		SeWebElement selement = new SeWebElement();
//		selement.setValue("xpath", SBUSHomeObj.searchTextBox, "Jeans");
//		selement.click("xpath", SBUSHomeObj.searchBtn);
//		sdriver.waitForElementPresent("xpath", SBUSPLPPageObj.plpProduct);
//		selement.click("xpath", SBUSPLPPageObj.plpProduct);
		
		SBUSHome shome= new SBUSHome();
		shome.searchProduct("Jeans");
		sdriver.waitForElementPresent("xpath", SBUSPLPPageObj.plpProduct);
		SBUSPLPPage plp = new SBUSPLPPage();
		plp.selectProductFromPLPPage();
		
	}
}
