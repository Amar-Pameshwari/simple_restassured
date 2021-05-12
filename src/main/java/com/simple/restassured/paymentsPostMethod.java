package com.simple.restassured;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.utilities.TestUtils;
import com.utilities.URL;
import com.utilities.payLoadsConvertor;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class paymentsPostMethod 
{
	
	public static Logger log = LogManager.getLogger(paymentsPostMethod.class.getName());
	
	@Test
	public static void payments()
	{
		  String inboundPayloads =  payLoadsConvertor.generatePayloadString("petStore.json");
		  
		  Response response;
		  
		  log.info("**** Test Cases : Post Method *****");
		  String postString = URL.Post_PetStoreEndPoint("/v2/pet");
		  response = RestCalls.PostRequest(postString, inboundPayloads);
		  String strPostResponse = TestUtils.getStrResponse(response);
		  JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		  log.debug(jsonResponse_post);
		  log.info(jsonResponse_post.getString("id"));
		  log.info("***** End Post Test Cases ************");
		  Assertions.VerifyStatusCode(response, 200);
		  Assertions.VerifyStatusCodeMessage(response, "HTTP/1.1 200 OK");
		   
	}
}
