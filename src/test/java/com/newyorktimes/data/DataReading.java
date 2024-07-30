package com.newyorktimes.data;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DataReading {
	
	protected static Properties prop=null;
	
	public void loadpropertiesFile() throws IOException{
	FileReader reader = new FileReader("C:\\TheNewyorkTimes\\properties\\data.properties");

	prop = new Properties();
	prop.load(reader);
	
	}

}
