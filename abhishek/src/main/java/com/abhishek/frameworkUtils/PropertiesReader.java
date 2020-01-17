package com.abhishek.frameworkUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	Properties properties;
	public PropertiesReader(String path) {
		properties = new Properties();
		try {
			properties.load(new FileInputStream(new File(path)));
		} catch (FileNotFoundException e) {
			System.out.println("Path of the file "+path+" is incorrect");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getData(String key) {
		return properties.getProperty(key);
	}

}
