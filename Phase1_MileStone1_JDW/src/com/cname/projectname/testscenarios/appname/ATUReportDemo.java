package com.cname.projectname.testscenarios.appname;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import atu.testng.reports.ATUReports;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;

@Listeners({ATUReportsListener.class, ConfigurationListener.class, MethodListener.class})
public class ATUReportDemo 
{
	{
		System.setProperty("atu.reporter.config", "D:\\Selenium_resource\\GITLOCALREPO\\Phase1_MileStone1_JDW\\Environment\\atu.properties");
	}
	
	@Test
	public void createFolder()
	{
		
	}
}
