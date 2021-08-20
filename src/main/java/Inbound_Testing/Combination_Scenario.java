package Inbound_Testing;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.simple.restassured.Assertions;
import com.simple.restassured.RestCalls;
import com.utilities.TestUtils;
import com.utilities.URL;
import com.utilities.payLoadsConvertor;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Combination_Scenario {

	public static final String Dev_Test_resource = "/corpjourneycaa/v1/Inbound/post";
	public static Logger log = LogManager.getLogger(Dev_InboundTesting.class.getName());
	public static final String responseMessage = "HTTP/1.1 200 OK";

//C11 Combination scenario

//DelCred+Discount  	
	@Test
	public static void C11_DelCred_Discount() {
		String DelCred_Discount = payLoadsConvertor.generatePayloadString("C11_DelCred_Discount.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		// String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, DelCred_Discount);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_Writeoff Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//Deduction+Discount  	
	@Test
	public static void C11_Ded_Discount() {
		String Ded_Discount = payLoadsConvertor.generatePayloadString("C11_Ded_Discount.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		// String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, Ded_Discount);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_Writeoff Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//P10 Combination scenario

//DelCred+Discount  	
	@Test
	public static void P10_Discount_DelCred() {
		String Discount_DelCred = payLoadsConvertor.generatePayloadString("P10_Discount_DelCred.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		// String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, Discount_DelCred);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_Writeoff Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//Deduction+Discount  	
	@Test
	public static void P10_Dedu_Discount() {
		String Dedu_Discount = payLoadsConvertor.generatePayloadString("P10_Dedu_Discount.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		// String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, Dedu_Discount);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_Writeoff Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

}
