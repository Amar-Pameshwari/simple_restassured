package com.utilities;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class URL {

	public static Logger log = LogManager.getLogger(URL.class.getName());

	public static final String TestURL = "https://t-api.sbdinc.com"; // QA Link
	public static final String devURL = "https://d-api.sbdinc.com"; // Dev Link

	public static final String URL = "http://api.openweathermap.org"; // Get Request

	public static String DevEndPoint_PostRequest(String resource) // For Dev Link
	{
		log.info("PetStore URL Endpoint: " + devURL + resource);
		return devURL + resource;
	}

	public static String TestEndPoint_Postrequest(String resource) // For QA Link
	{
		log.info("SBD inbound Endpoint: " + TestURL + resource);
		return TestURL + resource;
	}

	public static String Get_EndPointforPetStore() {
		log.info("Weather URL: " + URL);
		return URL;
	}

	public static String Post_PetStoreEndPoint(String resource) {
		log.info("Weather URL Endpoint: " + URL + resource);
		return URL + resource;
	}
}

//"https://petstore.swagger.io";			// Post Request