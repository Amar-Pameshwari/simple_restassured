package com.simple.restassured;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.annotation.JsonProperty;

//import com.fasterxml.jackson.annotation.JsonProperty;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestCalls {

	public static Logger log = LogManager.getLogger(RestCalls.class.getName());

	@JsonProperty("Agora-Subscription-Key") // Dev
	public static final String key = "48dfe6a704414f4c9f61b37a6b983fd7";

	public static String q = "mumbai";
	public static String appid = "97639a9744a1db27e751345160678c6b";

	// @JsonProperty("Agora-Subscription-Key") //QA
	// public static final String key = "fc18a09bd4dc4062a6093c788320c639";

	public static Response GetRequest(String uRI) {

		log.info("Get Request Call-");
		RequestSpecification requestSpecification = RestAssured.given().queryParam("q", q).queryParam("appid", appid);
		requestSpecification.headers("Content-Type", "application/json");
		Response response = requestSpecification.get(uRI);
		log.debug(requestSpecification.log().all());
		return response;
	}

	public static Response PostRequest(String uRI, String strJSON) {

		log.info("Post Request Call-");
		RequestSpecification requestSpecification = RestAssured.given().body(strJSON)
				.queryParam("Agora-Subscription-Key", key);
		requestSpecification.headers("Content-Type", "application/json");
		Response response = requestSpecification.post(uRI);
		log.debug(requestSpecification.log().all());
		return response;
	}

	public static Response PostRequest(String uRI, String strJSON, String sessionId) {
		log.info("Post Request Call-");
		RequestSpecification requestSpecification = RestAssured.given().body(strJSON);
		requestSpecification.headers("Content-Type", "application/json");
		// requestSpecification.header("cookie", "JsessionId="+ sessionId+"");
		Response response = requestSpecification.post(uRI);
		log.debug(requestSpecification.log().all());
		return response;
	}

	public static Response PutRequest(String uRI, String strJSON) {
		log.info("Put Request Call-");
		RequestSpecification requestSpecification = RestAssured.given().body(strJSON);
		requestSpecification.headers("Content-Type", "application/json");
		Response response = requestSpecification.put(uRI);
		log.debug(requestSpecification.log().all());
		return response;
	}

	public static Response DeleteRequest(String uRI, String strJSON) {
		BasicConfigurator.configure();
		log.info("Delete Request Call-");
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.headers("Content-Type", "application/json");
		Response response = requestSpecification.delete(uRI);
		log.debug(requestSpecification.log().all());
		return response;
	}
}
