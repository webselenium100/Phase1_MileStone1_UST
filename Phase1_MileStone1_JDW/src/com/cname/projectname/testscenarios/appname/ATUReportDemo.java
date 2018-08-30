package com.cname.projectname.testscenarios.appname;

import java.util.LongSummaryStatistics;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cname.projectname.testinitialization.Driver;

import atu.testng.reports.ATUReports;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import atu.testng.reports.logging.LogAs;
import atu.testng.reports.utils.Utils;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

@Listeners({ATUReportsListener.class, ConfigurationListener.class, MethodListener.class})
public class ATUReportDemo 
{
	{
		System.setProperty("atu.reporter.config", "D:\\Selenium_resource\\GITLOCALREPO\\Phase1_MileStone1_JDW\\Environment\\atu.properties");
	}
	
	
	public WebDriver driver;
	
	@BeforeClass
	public void init()
	{
		driver = Driver.getDriver();
		ATUReports.setWebDriver(Driver.driver);
	}
	
	@Test
	public void createFolder()
	{
//		setAuthorInfoForReports();
		driver.get("https://mail.google.com/mail/u/0/");
		 ATUReports.add("Craete New Folder", "SampleFolder", "Folder Create", "Folder created", LogAs.INFO, new CaptureScreen(
                 ScreenshotOf.BROWSER_PAGE));
	}
}
