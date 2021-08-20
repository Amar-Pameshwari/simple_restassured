package Inbound_Testing;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.simple.restassured.Assertions;
import com.simple.restassured.RestCalls;
import com.utilities.TestUtils;
import com.utilities.URL;
import com.utilities.payLoadsConvertor;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class QA_InboundTesting {

	public static final String Dev_Test_resource = "/corpjourneycaa/v1/Inbound/post";
	public static Logger log = LogManager.getLogger(Dev_InboundTesting.class.getName());
	public static final String responseMessage = "HTTP/1.1 200 OK";

	@Test(description = "Discount-P10 TC")
	@Description("Discount Scenario....")
	@Epic("P10_Inbound")
	@Feature("P10: Discount")
	@Story("Trax and Fallout inbound")
	@Step("Discount")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void P10_Discount() {
		String Discount = payLoadsConvertor.generatePayloadString("P10_Discount.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, Discount);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_Discount Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//PerfectMatch		  
	@Test
	public static void P10_PerfectMatch() {
		String WriteOff = payLoadsConvertor.generatePayloadString("P10_PerfectMatch.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, WriteOff);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_PerfectMatch Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//ShortPayment		  
	@Test
	public static void P10_ShortPayment() {
		String WriteOff = payLoadsConvertor.generatePayloadString("P10_ShortPayment.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, WriteOff);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_ShortPayment Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//Bank Fee
	@Test
	public static void P10_BankFee() {
		String BankFee = payLoadsConvertor.generatePayloadString("P10_BankFee.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, BankFee);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_BankFee Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//Deduction
	@Test
	public static void P10_Deduction() {
		String Deduction = payLoadsConvertor.generatePayloadString("P10_Deduction.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, Deduction);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_Deduction Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//Over Payment
	@Test
	public static void P10_OverPayment() {
		String OverPayment = payLoadsConvertor.generatePayloadString("P10_OverPayment.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, OverPayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_Deduction Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//Duplicate Payment
	@Test
	public static void P10_DuplicatePayment() {
		String DuplicatePayment = payLoadsConvertor.generatePayloadString("P10_DuplicatePayment.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, DuplicatePayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_Deduction Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//DelCred
	@Test
	public static void P10_DelCred() {
		String DelCred = payLoadsConvertor.generatePayloadString("P10_DelCred.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, DelCred);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		// log.info(jsonResponse_post.getString("id"));
		log.info("***** End P10_Sundry Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//WriteOff	   
	@Test
	public static void P10_WriteOff() {
		String WriteOff = payLoadsConvertor.generatePayloadString("P10_WriteOff.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, WriteOff);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_WriteOff Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//On Account
	@Test
	public static void P10_OnAccount() {
		String WriteOff = payLoadsConvertor.generatePayloadString("P10_OnAccount.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, WriteOff);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_OnAccount Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//OverPayment		  
	@Test
	public static void P10_PartialPayment() {
		String PartialPayment = payLoadsConvertor.generatePayloadString("P10_PartialPayment.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, PartialPayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_OverPayment Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

// Below methods for C11 

//BankFee  	
	@Test
	public static void C11_BankFee() {
		String BankFee = payLoadsConvertor.generatePayloadString("C11_BankFee.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, BankFee);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_BankFee Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//On Account
	@Test
	public static void C11_OnAccount() {
		String OnAccount = payLoadsConvertor.generatePayloadString("C11_OnAccount.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, OnAccount);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_OnAccount Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//Perfect Match
	@Test
	public static void C11_PerfectMatch() {
		String perfectMatch = payLoadsConvertor.generatePayloadString("C11_perfectMatch.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, perfectMatch);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_PerfectMatch Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//Over Payment
	@Test
	public static void C11_OverPayment() {
		String OverPayment = payLoadsConvertor.generatePayloadString("C11_OverPayment.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, OverPayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_OverPayment Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//Short Payment  	
	@Test
	public static void C11_ShortPayment() {
		String ShortPayment = payLoadsConvertor.generatePayloadString("C11_ShortPayment.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, ShortPayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_ShortPayment Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//Deduction  	
	@Test
	public static void C11_Deduction() {
		String Deduction = payLoadsConvertor.generatePayloadString("C11_Deduction.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, Deduction);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_Deduction Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//Discount  	
	@Test
	public static void C11_Discount() {
		String Discount = payLoadsConvertor.generatePayloadString("C11_Discount.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, Discount);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_Discount Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//Partial Payment  	
	@Test
	public static void C11_PartailPayment() {
		String PartialPayment = payLoadsConvertor.generatePayloadString("C11_PartailPayment.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, PartialPayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_Sundry Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//Writeoff  	
	@Test
	public static void C11_Writeoff() {
		String ShortPayment = payLoadsConvertor.generatePayloadString("C11_Writeoff.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, ShortPayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_Writeoff Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

//DuplicatePayment  	
	@Test
	public static void C11_DuplicatePayment() {
		String DuplicatePayment = payLoadsConvertor.generatePayloadString("C11_DuplicatePayment.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, DuplicatePayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_Writeoff Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}
}
