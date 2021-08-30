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
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
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
		log.info("**** Start Discount TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, Discount);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_Discount Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "PerfectMatch-P10 TC")
	@Description("PerfectMatch Scenario....")
	@Epic("P10_Inbound")
	@Feature("P10: PerfectMatch")
	@Story("Trax and Fallout inbound")
	@Step("PerfectMatch")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void P10_PerfectMatch() {
		String WriteOff = payLoadsConvertor.generatePayloadString("P10_PerfectMatch.json");
		Response response;
		log.info("**** Start PerfectMatch TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, WriteOff);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_PerfectMatch Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "ShortPayment-P10 TC")
	@Description("ShortPayment Scenario....")
	@Epic("P10_Inbound")
	@Feature("P10: ShortPayment")
	@Story("Trax and Fallout inbound")
	@Step("ShortPayment")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void P10_ShortPayment() {
		String WriteOff = payLoadsConvertor.generatePayloadString("P10_ShortPayment.json");
		Response response;
		log.info("**** Start ShortPayment TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, WriteOff);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_ShortPayment Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "BankFee-P10 TC")
	@Description("BankFee Scenario....")
	@Epic("P10_Inbound")
	@Feature("P10: BankFee")
	@Story("Trax and Fallout inbound")
	@Step("BankFee")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void P10_BankFee() {
		String BankFee = payLoadsConvertor.generatePayloadString("P10_BankFee.json");
		Response response;
		log.info("**** Start BankFee TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, BankFee);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_BankFee Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "Deduction-P10 TC")
	@Description("Deduction Scenario....")
	@Epic("P10_Inbound")
	@Feature("P10: Deduction")
	@Story("Trax and Fallout inbound")
	@Step("Deduction")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void P10_Deduction() {
		String Deduction = payLoadsConvertor.generatePayloadString("P10_Deduction.json");
		Response response;
		log.info("**** Start Deduction TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, Deduction);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_Deduction Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "OverPayment-P10 TC")
	@Description("OverPayment Scenario....")
	@Epic("P10_Inbound")
	@Feature("P10: OverPayment")
	@Story("Trax and Fallout inbound")
	@Step("OverPayment")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void P10_OverPayment() {
		String OverPayment = payLoadsConvertor.generatePayloadString("P10_OverPayment.json");
		Response response;
		log.info("**** Start OverPayment TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, OverPayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_OverPayment Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "DuplicatePayment-P10 TC")
	@Description("DuplicatePayment Scenario....")
	@Epic("P10_Inbound")
	@Feature("P10: DuplicatePayment")
	@Story("Trax and Fallout inbound")
	@Step("DuplicatePayment")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void P10_DuplicatePayment() {
		String DuplicatePayment = payLoadsConvertor.generatePayloadString("P10_DuplicatePayment.json");
		Response response;
		log.info("**** Start DuplicatePayment TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, DuplicatePayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_Deduction Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "DelCred-P10 TC")
	@Description("DelCred Scenario....")
	@Epic("P10_Inbound")
	@Feature("P10: DelCred")
	@Story("Trax and Fallout inbound")
	@Step("DelCred")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void P10_DelCred() {
		String DelCred = payLoadsConvertor.generatePayloadString("P10_DelCred.json");
		Response response;
		log.info("**** Start DelCred TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, DelCred);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		// log.info(jsonResponse_post.getString("id"));
		log.info("***** End P10_Sundry Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "WriteOff-P10 TC")
	@Description("WriteOff Scenario....")
	@Epic("P10_Inbound")
	@Feature("P10: WriteOff")
	@Story("Trax and Fallout inbound")
	@Step("WriteOff")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void P10_WriteOff() {
		String WriteOff = payLoadsConvertor.generatePayloadString("P10_WriteOff.json");
		Response response;
		log.info("**** Start WriteOff TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, WriteOff);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_WriteOff Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "OnAccount-P10 TC")
	@Description("OnAccount Scenario....")
	@Epic("P10_Inbound")
	@Feature("P10: OnAccount")
	@Story("Trax and Fallout inbound")
	@Step("OnAccount")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void P10_OnAccount() {
		String OnAccount = payLoadsConvertor.generatePayloadString("P10_OnAccount.json");
		Response response;
		log.info("**** Start OnAccount TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, OnAccount);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_OnAccount Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "PartialPayment-P10 TC")
	@Description("PartialPayment Scenario....")
	@Epic("P10_Inbound")
	@Feature("P10: PartialPayment")
	@Story("Trax and Fallout inbound")
	@Step("PartialPayment")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void P10_PartialPayment() {
		String PartialPayment = payLoadsConvertor.generatePayloadString("P10_PartialPayment.json");
		Response response;
		log.info("**** Start PartialPayment TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, PartialPayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_OverPayment Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "BankFee-C11 TC")
	@Description("BankFee Scenario....")
	@Epic("C11_Inbound")
	@Feature("C11: BankFee")
	@Story("Trax and Fallout inbound")
	@Step("BankFee")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void C11_BankFee() {
		String BankFee = payLoadsConvertor.generatePayloadString("C11_BankFee.json");
		Response response;
		log.info("**** Start BankFee TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, BankFee);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_BankFee Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "OnAccount-C11 TC")
	@Description("OnAccount Scenario....")
	@Epic("C11_Inbound")
	@Feature("C11: OnAccount")
	@Story("Trax and Fallout inbound")
	@Step("OnAccount")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void C11_OnAccount() {
		String OnAccount = payLoadsConvertor.generatePayloadString("C11_OnAccount.json");
		Response response;
		log.info("**** Start BankFee TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, OnAccount);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_OnAccount Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "PerfectMatch-C11 TC")
	@Description("PerfectMatch Scenario....")
	@Epic("C11_Inbound")
	@Feature("C11: PerfectMatch")
	@Story("Trax and Fallout inbound")
	@Step("PerfectMatch")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void C11_PerfectMatch() {
		String perfectMatch = payLoadsConvertor.generatePayloadString("C11_perfectMatch.json");
		Response response;
		log.info("**** Start PerfectMatch TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, perfectMatch);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_PerfectMatch Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "OverPayment-C11 TC")
	@Description("OverPayment Scenario....")
	@Epic("C11_Inbound")
	@Feature("C11: OverPayment")
	@Story("Trax and Fallout inbound")
	@Step("OverPayment")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void C11_OverPayment() {
		String OverPayment = payLoadsConvertor.generatePayloadString("C11_OverPayment.json");
		Response response;
		log.info("**** Start OverPayment TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, OverPayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_OverPayment Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "ShortPayment-C11 TC")
	@Description("ShortPayment Scenario....")
	@Epic("C11_Inbound")
	@Feature("C11: ShortPayment")
	@Story("Trax and Fallout inbound")
	@Step("ShortPayment")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void C11_ShortPayment() {
		String ShortPayment = payLoadsConvertor.generatePayloadString("C11_ShortPayment.json");
		Response response;
		log.info("**** Start ShortPayment TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, ShortPayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_ShortPayment Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "Deduction-C11 TC")
	@Description("Deduction Scenario....")
	@Epic("C11_Inbound")
	@Feature("C11: Deduction")
	@Story("Trax and Fallout inbound")
	@Step("Deduction")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void C11_Deduction() {
		String Deduction = payLoadsConvertor.generatePayloadString("C11_Deduction.json");
		Response response;
		log.info("**** Start Deduction TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, Deduction);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_Deduction Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "Discount-C11 TC")
	@Description("Discount Scenario....")
	@Epic("C11_Inbound")
	@Feature("C11: Discount")
	@Story("Trax and Fallout inbound")
	@Step("Discount")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void C11_Discount() {
		String Discount = payLoadsConvertor.generatePayloadString("C11_Discount.json");
		Response response;
		log.info("**** Start Discount TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, Discount);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_Discount Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "PartailPayment-C11 TC")
	@Description("PartailPayment Scenario....")
	@Epic("C11_Inbound")
	@Feature("C11: PartailPayment")
	@Story("Trax and Fallout inbound")
	@Step("PartailPayment")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void C11_PartailPayment() {
		String PartialPayment = payLoadsConvertor.generatePayloadString("C11_PartailPayment.json");
		Response response;
		log.info("**** Start PartailPayment TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, PartialPayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_Sundry Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "Writeoff-C11 TC")
	@Description("Writeoff Scenario....")
	@Epic("C11_Inbound")
	@Feature("C11: Writeoff")
	@Story("Trax and Fallout inbound")
	@Step("Writeoff")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void C11_Writeoff() {
		String ShortPayment = payLoadsConvertor.generatePayloadString("C11_Writeoff.json");
		Response response;
		log.info("**** Start Writeoff TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, ShortPayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_Writeoff Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}

	@Test(description = "DuplicatePayment-C11 TC")
	@Description("DuplicatePayment Scenario....")
	@Epic("C11_Inbound")
	@Feature("C11: DuplicatePayment")
	@Story("Trax and Fallout inbound")
	@Step("DuplicatePayment")
	@Severity(SeverityLevel.CRITICAL)
	@TmsLink("QA")
	@Issue("_workitems")
	public static void C11_DuplicatePayment() {
		String DuplicatePayment = payLoadsConvertor.generatePayloadString("C11_DuplicatePayment.json");
		Response response;
		log.info("**** Start DuplicatePayment TC *****");
		String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		response = RestCalls.PostRequest(TestURLAccess, DuplicatePayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_DuplicatePayment Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
	}
}
