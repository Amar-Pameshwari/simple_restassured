package com.utilities;

import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class payLoadsConvertor 
{
	public static Logger log = LogManager.getLogger(payLoadsConvertor.class.getName());

	public static String generatePayloadString(String filename) 
	{
		String filePath = System.getProperty("user.dir")+"\\resources\\"+filename;
		
		log.info("Inside payloads fn:");
		try {
			return new String(Files.readAllBytes(Paths.get(filePath)));	
		}
		catch(Exception e)
		{
			log.error(e);
			return null;
		}
		
	}
}
