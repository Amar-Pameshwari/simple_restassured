package com.utilities;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class URL 
{

	public static Logger log = LogManager.getLogger(URL.class.getName()); 
	
	public static final String URL = "http://api.openweathermap.org";            // Get Request

	public static final String TestURL = "https://t-api.sbdinc.com";
			//"https://petstore.swagger.io";			// Post Request
	
	public static final String devURL = "https://d-api.sbdinc.com";
	
	public static String Get_EndPointforPetStore()
	{
		log.info("Weather URL: "+URL);
		return URL;
	}
	
	public static String Post_PetStoreEndPoint(String resource)
	{
		log.info("Weather URL Endpoint: "+URL+resource);
		return URL+resource;
	}
	
/*	public static String TestEndPoint_GetRequest()
	{
		log.info("SBD inbound Endpoint: " + TestURL);
		return TestURL;
	}
*/	
	public static String TestEndPoint_Postrequest(String resource)
	{
		log.info("SBD inbound Endpoint: " + TestURL+resource);
		return TestURL+resource;
	}
	
	
/*	public static String DevEndPoint_GetRequest()
	{
		log.info("PetStore URL Endpoint: "+devURL);
		return devURL;
	}
*/	
	public static String DevEndPoint_PostRequest(String resource)
	{
		log.info("PetStore URL Endpoint: "+devURL+resource);
		return devURL+resource;
	}
}
