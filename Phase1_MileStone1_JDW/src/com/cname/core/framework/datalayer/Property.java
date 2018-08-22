package com.cname.core.framework.datalayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.cname.core.framework.utils.Global;

public class Property
{
	public static String getProValue(String key)
	{
		String data = null;
		
		try
		{
			FileInputStream fis = new FileInputStream(Global.proPath);
			Properties pro = new Properties();
			pro.load(fis);
			
			data = pro.getProperty(key);
		}
		catch(Exception e)
		{
			new Exception("Invalid value");
		}
		
		return data;
		
	}
}
