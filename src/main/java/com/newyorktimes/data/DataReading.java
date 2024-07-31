package com.newyorktimes.data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataReading {
    protected static Properties prop;
	public void loadpropertiesFile() {
		prop = new Properties();
		try {
			FileInputStream reader = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
			prop.load(reader); 
		}
		catch(IOException e) 
		{
			e.getMessage();
		}
	}
}