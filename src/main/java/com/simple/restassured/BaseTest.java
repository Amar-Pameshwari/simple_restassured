package com.simple.restassured;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;

import com.utilities.TestUtils;
import com.utilities.URL;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class BaseTest {

	public static Logger log = LogManager.getLogger(BaseTest.class.getName());
	static String resourceUrl = "/data/2.5/weather";

	@BeforeTest
	public static String doLogin() {
		Response response;

		log.info("**** Starting Test Cases: Get Method ****");
		String endPoints_get = URL.Post_PetStoreEndPoint(resourceUrl);
		response = RestCalls.GetRequest(endPoints_get);
		String strGetResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_get = TestUtils.jsonGetParser(strGetResponse);
		log.debug(jsonResponse_get);
		String lon = jsonResponse_get.getString("coord.lon");
		log.info("**********End Get Test Cases *********");
		return lon;

	}

}
