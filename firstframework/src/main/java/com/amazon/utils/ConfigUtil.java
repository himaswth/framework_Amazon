package com.amazon.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class ConfigUtil {
public static Properties prop= new Properties();;
	

static Logger log =LogManager.getLogger(ConfigUtil.class);
	public   void getProperties(String fileName) {
	
			 
			try {
				InputStream input =new FileInputStream("C:\\Users\\himas\\eclipse-workspace\\firstframework\\resources\\config.properties");
				prop.load(input);
				
			} catch (Exception e) {
				
				log.error(e.getMessage());
			}
		
	
	}


		public static String  getProperty (String key) {
			
			return prop.getProperty(key);
		}
		
	}	
		

