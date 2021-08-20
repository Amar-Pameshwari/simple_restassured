package Inbound_Testing;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.simple.restassured.Assertions;
import com.simple.restassured.RestCalls;
import com.utilities.TestUtils;
import com.utilities.URL;
import com.utilities.payLoadsConvertor;

import io.qameta.allure.Attachment;
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
import io.restassured.response.Response;

public class Dev_InboundTesting {
	public static final String Dev_Test_resource = "/corpjourneycaa/v1/Inbound/post";
	public static Logger log = LogManager.getLogger(Dev_InboundTesting.class.getName());
	public static final String responseMessage = "HTTP/1.1 200 OK";
	public static final int statusCode = 200;

	@Test(description = "Discount-P10 TC")
	@Description("Discount Scenario....")
	@Epic("P10_Inbound")
	@Feature("P10: Discount")
	@Story("Trax and Fallout inbound")
	@Step("Discount")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void P10_Discount() {
		try {
		String Discount = payLoadsConvertor.generatePayloadString("P10_Discount.json");
		Response response;
		log.info("**** Test Cases : Discount Test Cases Start *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, Discount);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** Discount Test Cases Start ************");
		Assertions.VerifyStatusCode(response, statusCode);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(description = "Perfect Match-P10 TC")
	@Description("Perfect Match")
	@Epic("P10_Inbound")
	@Feature("P10: Perfect Match")
	@Story("Trax and Fallout Inbound")
	@Step("Perfect Match")
	@Severity(SeverityLevel.CRITICAL)
	@Link("post")
	@TmsLink("Inbound")
	@Issue("_workitems")
	@Link("Dev")
	@Issue("Bug")
	public static void P10_PerfectMatch() {
		try {
		String WriteOff = payLoadsConvertor.generatePayloadString("P10_PerfectMatch.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, WriteOff);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_PerfectMatch Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(description = "Short Payment-P10 TC")
	@Description("Short Payment")
	@Epic("P10_Inbound")
	@Feature("P10: Short Payment")
	@Story("Trax and Fallout inbound")
	@Step("Short Payment")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void P10_ShortPayment() {
		try {
		String WriteOff = payLoadsConvertor.generatePayloadString("P10_ShortPayment.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, WriteOff);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_ShortPayment Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(description = "Bank Fee-P10 TC")
	@Description("Bank Fee")
	@Epic("P10_Inbound")
	@Feature("P10: Bank Fee")
	@Story("Trax and Fallout inbound")
	@Step("Bank Fee")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void P10_BankFee() {
		try {
		String BankFee = payLoadsConvertor.generatePayloadString("P10_BankFee.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, BankFee);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_BankFee Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(description = "Deduction-P10 TC")
	@Description("Deduction")
	@Epic("P10_Inbound")
	@Feature("P10: Deduction")
	@Story("Trax and Fallout inbound")
	@Step("Deduction")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void P10_Deduction() {
		try {
		String Deduction = payLoadsConvertor.generatePayloadString("P10_Deduction.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, Deduction);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_Deduction Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(description = "Over Payment-P10 TC")
	@Description("Over Payment")
	@Epic("P10_Inbound")
	@Feature("P10: Over Payment")
	@Story("Trax and Fallout inbound")
	@Step("Over Payment")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void P10_OverPayment() {
		try {
		String OverPayment = payLoadsConvertor.generatePayloadString("P10_OverPayment.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, OverPayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_Deduction Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(description = "Duplicate Payment-P10 TC")
	@Description("Duplicate Payment")
	@Epic("P10_Inbound")
	@Feature("P10: Duplicate Payment")
	@Story("Trax and Fallout inbound")
	@Step("Duplicate Payment")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void P10_DuplicatePayment() {
		try {
		String DuplicatePayment = payLoadsConvertor.generatePayloadString("P10_DuplicatePayment.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, DuplicatePayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_Deduction Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(description = "Del Cred-P10 TC")
	@Description("Del Cred")
	@Epic("P10_Inbound")
	@Feature("P10: Del Cred")
	@Story("Trax and Fallout inbound")
	@Step("Del Cred")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void P10_DelCred() {
		try {
		String DelCred = payLoadsConvertor.generatePayloadString("P10_DelCred.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, DelCred);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		// log.info(jsonResponse_post.getString("id"));
		log.info("***** End P10_Sundry Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(description = "Write Off-P10 TC")
	@Description("Write Off")
	@Epic("P10_Inbound")
	@Feature("P10: Write Off")
	@Story("Trax and Fallout inbound")
	@Step("Write Off")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void P10_WriteOff() {
		try {
		String WriteOff = payLoadsConvertor.generatePayloadString("P10_WriteOff.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, WriteOff);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_WriteOff Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(description = "On Account- P10 TC")
	@Description("On Account")
	@Epic("P10_Inbound")
	@Feature("P10: On Account")
	@Story("Trax and Fallout inbound")
	@Step("On Account")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void P10_OnAccount() {
		try {
		String WriteOff = payLoadsConvertor.generatePayloadString("P10_OnAccount.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, WriteOff);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_OnAccount Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(description = "Partial Payment-P10 TC")
	@Description("Partial Payment")
	@Epic("P10_Inbound")
	@Feature("P10: Partial Payment")
	@Story("Trax and Fallout inbound")
	@Step("Partial Payment")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void P10_PartialPayment() {
		try {
		String PartialPayment = payLoadsConvertor.generatePayloadString("P10_PartialPayment.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, PartialPayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End P10_OverPayment Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(description = "BankFee-C11 TC")
	@Description("BankFee")
	@Epic("C11_Inbound")
	@Feature("C11: BankFee")
	@Story("Trax and Fallout inbound")
	@Step("BankFee")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void C11_BankFee() {
		try {
		String BankFee = payLoadsConvertor.generatePayloadString("C11_BankFee.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, BankFee);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_BankFee Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(description = "On Account-C11 TC")
	@Description("On Account")
	@Epic("C11_Inbound")
	@Feature("C11: On Account")
	@Story("Trax and Fallout inbound")
	@Step("On Account")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void C11_OnAccount() {
		try {
		String OnAccount = payLoadsConvertor.generatePayloadString("C11_OnAccount.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, OnAccount);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_OnAccount Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(description = "PerfectMatch-C11 TC")
	@Description("PerfectMatch")
	@Epic("C11_Inbound")
	@Feature("C11: PerfectMatch")
	@Story("Trax and Fallout inbound")
	@Step("PerfectMatch")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void C11_PerfectMatch() {
		try {
		String perfectMatch = payLoadsConvertor.generatePayloadString("C11_perfectMatch.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, perfectMatch);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_PerfectMatch Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(description = "Over Payment-C11 TC")
	@Description("Over Payment")
	@Epic("C11_Inbound")
	@Feature("C11: Over Payment")
	@Story("Trax and Fallout inbound")
	@Step("Over Payment")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void C11_OverPayment() {
		try {
		String OverPayment = payLoadsConvertor.generatePayloadString("C11_OverPayment.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, OverPayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_OverPayment Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(description = "Short Payment-C11 TC")
	@Description("Short Payment")
	@Epic("C11_Inbound")
	@Feature("C11: Short Payment")
	@Story("Trax and Fallout inbound")
	@Step("Short Payment")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void C11_ShortPayment() {
		try {
		String ShortPayment = payLoadsConvertor.generatePayloadString("C11_ShortPayment.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, ShortPayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_ShortPayment Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(description = "Deduction-C11 TC")
	@Description("Deduction")
	@Epic("C11_Inbound")
	@Feature("C11: Deduction")
	@Story("Trax and Fallout inbound")
	@Step("Deduction")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void C11_Deduction() {
		try {
		String Deduction = payLoadsConvertor.generatePayloadString("C11_Deduction.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, Deduction);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_Deduction Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(description = "Discount-C11 TC")
	@Description("Discount")
	@Epic("C11_Inbound")
	@Feature("C11: Discount")
	@Story("Trax and Fallout inbound")
	@Step("Discount")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void C11_Discount() {
		try {
		String Discount = payLoadsConvertor.generatePayloadString("C11_Discount.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, Discount);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_Discount Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(description = "Partial Payment-C11 TC")
	@Description("Partial Payment")
	@Epic("C11_Inbound")
	@Feature("C11: Partial Payment")
	@Story("Trax and Fallout inbound")
	@Step("Partial Payment")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void C11_PartailPayment() {
		try {
		String PartialPayment = payLoadsConvertor.generatePayloadString("C11_PartailPayment.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, PartialPayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_Sundry Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(description = "Write Off-C11 TC")
	@Description("Write Off")
	@Epic("C11_Inbound")
	@Feature("C11: Write Off")
	@Story("Trax and Fallout inbound")
	@Step("Write Off")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void C11_Writeoff() {
		try {
		String ShortPayment = payLoadsConvertor.generatePayloadString("C11_Writeoff.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, ShortPayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_Writeoff Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(description = "Duplicate Payment-C11 TC")
	@Description("Duplicate Payment")
	@Epic("C11_Inbound")
	@Feature("C11: Duplicate Payment")
	@Story("Trax and Fallout inbound")
	@Step("Duplicate Payment")
	@Severity(SeverityLevel.CRITICAL)
	@Link("Dev")
	@Issue("Bug")
	public static void C11_DuplicatePayment() {
		try {
		String DuplicatePayment = payLoadsConvertor.generatePayloadString("C11_DuplicatePayment.json");
		Response response;
		log.info("**** Test Cases : Post Method *****");
		String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		response = RestCalls.PostRequest(DevURLAccess, DuplicatePayment);
		String strPostResponse = TestUtils.getStrResponse(response);
		TestUtils.jsonPostParser(strPostResponse);
		// log.debug(jsonResponse_post);
		log.info("***** End C11_Writeoff Test Cases ************");
		Assertions.VerifyStatusCode(response, 200);
		Assertions.VerifyStatusCodeMessage(response, responseMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
