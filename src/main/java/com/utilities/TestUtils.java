package com.utilities;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class TestUtils {

	public static Logger log = LogManager.getLogger(TestUtils.class.getName());

	public static String getStrResponse(Response response) {
		log.info("*** Get String Body****");
		String strResponse = response.getBody().asString();
		// log.debug(strResponse);
		return strResponse;
	}

	public static JsonPath jsonGetParser(String getResponse) {

		log.info("*****JsonPath Response for Get****");
		JsonPath jsonResponse_get = new JsonPath(getResponse);
		// log.debug(jsonResponse_get);
		return jsonResponse_get;
	}

	public static JsonPath jsonPostParser(String postResponse) {

		log.info("********JsonPath Response for Post*****");
		JsonPath jsonResponse_post = new JsonPath(postResponse);
		// log.debug(jsonResponse_post);
		return jsonResponse_post;
	}

	public static XmlPath xmlParser(String response) {

		log.info("********XmlPath Response *****");
		XmlPath xmlPath = new XmlPath(response);
		log.debug(xmlPath);
		return xmlPath;
	}

	public static int getStatusCode(Response response) {
		log.info("**** Getting response Code*******");
		int statusCode = response.getStatusCode();
		log.debug(statusCode);
		return statusCode;
	}

	public static String getStatusMessage(Response response) {
		log.info("**** Getting response Code message*******");
		String statusCodeMessage = response.getStatusLine();
		log.debug(statusCodeMessage);
		return statusCodeMessage;
	}

}
