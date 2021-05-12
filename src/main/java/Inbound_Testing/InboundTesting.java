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

public class InboundTesting 
{
	public static final String Dev_Test_resource = "/corpjourneycaa/v1/Inbound/post";
	public static Logger log = LogManager.getLogger(InboundTesting.class.getName());
	public static final String responseMessage = "HTTP/1.1 200 OK";
	
	
	
// Below Methods for P10

//Bank Fee
	 @Test 
	   public static void P10_BankFee()  
	   {  
			String BankFee = payLoadsConvertor.generatePayloadString("P10_BankFee.json");  
			Response response;  
			log.info("**** Test Cases : Post Method *****");  
			String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource); 
			//String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
			response = RestCalls.PostRequest(DevURLAccess, BankFee);  
			String strPostResponse =  TestUtils.getStrResponse(response);  
			JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);  
			//log.debug(jsonResponse_post);
			log.info("***** End P10_BankFee Test Cases ************"); 
			Assertions.VerifyStatusCode(response, 200); 
			Assertions.VerifyStatusCodeMessage(response, responseMessage);  
		  } 
	
//Discount
	 
	   @Test  
	   public static void P10_Discount()  
	   {  
		   String Discount = payLoadsConvertor.generatePayloadString("P10_Discount.json");  
		   Response response;  
		   log.info("**** Test Cases : Post Method *****");  
		   String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
		 //String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		   response = RestCalls.PostRequest(DevURLAccess, Discount);  
		   String strPostResponse = TestUtils.getStrResponse(response);  
		   JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);  
		   //log.debug(jsonResponse_post);
		   log.info("***** End P10_Discount Test Cases ************"); 
		  Assertions.VerifyStatusCode(response, 200); 
		  Assertions.VerifyStatusCodeMessage(response, responseMessage);  
	   } 
	   
//Deduction
	   @Test  
	   public static void P10_Deduction()  
	   {  
		   String Deduction = payLoadsConvertor.generatePayloadString("P10_Deduction.json");  
		   Response response;  
		   log.info("**** Test Cases : Post Method *****");  
		   String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);  
		 //String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		   response = RestCalls.PostRequest(DevURLAccess, Deduction);  
		   String strPostResponse = TestUtils.getStrResponse(response);  
		   JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse); 
		  //log.debug(jsonResponse_post); 
		  log.info("***** End P10_Deduction Test Cases ************"); 
		  Assertions.VerifyStatusCode(response, 200); 
		  Assertions.VerifyStatusCodeMessage(response, responseMessage);  
	  } 
	   
//Sundry
	   @Test 
		  public static void P10_Sundry() 
		  { 
			  String Sundry = payLoadsConvertor.generatePayloadString("P10_Sundry.json"); 
			  Response response;
			  log.info("**** Test Cases : Post Method *****"); 
			  String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource); 
			//String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
			  response = RestCalls.PostRequest(DevURLAccess,Sundry); 
			  String strPostResponse = TestUtils.getStrResponse(response);
			  JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
			  //log.debug(jsonResponse_post); 
			  //log.info(jsonResponse_post.getString("id"));
			  log.info("***** End P10_Sundry Test Cases ************");
			  Assertions.VerifyStatusCode(response, 200);
			  Assertions.VerifyStatusCodeMessage(response, responseMessage); 
		  }
	
//WriteOff	   
		  @Test 
		  public static void P10_WriteOff() 
		  { 
			  String WriteOff = payLoadsConvertor.generatePayloadString("P10_WriteOff.json"); 
			  Response response;
			  log.info("**** Test Cases : Post Method *****"); 
			  String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource); 
			//String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
			  response = RestCalls.PostRequest(DevURLAccess,WriteOff); 
			  String strPostResponse = TestUtils.getStrResponse(response);
			  JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
			  //log.debug(jsonResponse_post);
			  log.info("***** End P10_WriteOff Test Cases ************");
			  Assertions.VerifyStatusCode(response, 200);
			  Assertions.VerifyStatusCodeMessage(response, responseMessage); 
		  }

//On Account
		  @Test 
		  public static void P10_OnAccount() 
		  { 
			  String WriteOff = payLoadsConvertor.generatePayloadString("P10_OnAccount.json"); 
			  Response response;
			  log.info("**** Test Cases : Post Method *****"); 
			  String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource); 
			//String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
			  response = RestCalls.PostRequest(DevURLAccess,WriteOff); 
			  String strPostResponse = TestUtils.getStrResponse(response);
			  JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
			  //log.debug(jsonResponse_post);
			  log.info("***** End P10_OnAccount Test Cases ************");
			  Assertions.VerifyStatusCode(response, 200);
			  Assertions.VerifyStatusCodeMessage(response, responseMessage); 
		  }

//OverPayment		  
		  @Test 
		  public static void P10_OverPayment() 
		  { 
			  String WriteOff = payLoadsConvertor.generatePayloadString("P10_OverPayment.json"); 
			  Response response;
			  log.info("**** Test Cases : Post Method *****"); 
			  String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource); 
			//String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
			  response = RestCalls.PostRequest(DevURLAccess,WriteOff); 
			  String strPostResponse = TestUtils.getStrResponse(response);
			  JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
			  //log.debug(jsonResponse_post);
			  log.info("***** End P10_OverPayment Test Cases ************");
			  Assertions.VerifyStatusCode(response, 200);
			  Assertions.VerifyStatusCodeMessage(response, responseMessage); 
		  }
		  
//PerfectMatch		  
		  @Test 
		  public static void P10_PerfectMatch() 
		  { 
			  String WriteOff = payLoadsConvertor.generatePayloadString("P10_PerfectMatch.json"); 
			  Response response;
			  log.info("**** Test Cases : Post Method *****"); 
			  String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource); 
			//String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
			  response = RestCalls.PostRequest(DevURLAccess,WriteOff); 
			  String strPostResponse = TestUtils.getStrResponse(response);
			  JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
			  //log.debug(jsonResponse_post);
			  log.info("***** End P10_PerfectMatch Test Cases ************");
			  Assertions.VerifyStatusCode(response, 200);
			  Assertions.VerifyStatusCodeMessage(response, responseMessage); 
		  }

//ShortPayment		  
		  @Test 
		  public static void P10_ShortPayment() 
		  { 
			  String WriteOff = payLoadsConvertor.generatePayloadString("P10_ShortPayment.json"); 
			  Response response;
			  log.info("**** Test Cases : Post Method *****"); 
			  String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource); 
			//String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
			  response = RestCalls.PostRequest(DevURLAccess,WriteOff); 
			  String strPostResponse = TestUtils.getStrResponse(response);
			  JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
			  //log.debug(jsonResponse_post);
			  log.info("***** End P10_ShortPayment Test Cases ************");
			  Assertions.VerifyStatusCode(response, 200);
			  Assertions.VerifyStatusCodeMessage(response, responseMessage); 
		  }


// Below methods for C11 
	   
//Perfect Match
	   @Test  
	   public static void C11_PerfectMatch()  
	   {  
			String perfectMatch = 	payLoadsConvertor.generatePayloadString("C11_perfectMatch.json"); 
			Response response; 
			log.info("**** Test Cases : Post Method *****"); 
			String 	  DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource); 
			//String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
			response = RestCalls.PostRequest(DevURLAccess, perfectMatch);  
			String strPostResponse = TestUtils.getStrResponse(response);  
			JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);  
			//log.debug(jsonResponse_post);
			log.info("***** End C11_PerfectMatch Test Cases ************"); 
			Assertions.VerifyStatusCode(response, 200); 
			Assertions.VerifyStatusCodeMessage(response, responseMessage); 
	   } 
	    
//On Account
	   @Test  
	   public static void C11_OnAccount()  
	   {  
		   String OnAccount = payLoadsConvertor.generatePayloadString("C11_OnAccount.json");  
		   Response response;  
		   log.info("**** Test Cases : Post Method *****");  
		   String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);  
		 //String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		   response = RestCalls.PostRequest(DevURLAccess, OnAccount);  
		   String strPostResponse = TestUtils.getStrResponse(response);  
		   JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);  
		   //log.debug(jsonResponse_post);
		   log.info("***** End C11_OnAccount Test Cases ************"); 
		  Assertions.VerifyStatusCode(response, 200); 
		  Assertions.VerifyStatusCodeMessage(response, responseMessage);  
	  }

//Over Payment
	   @Test  
	   public static void C11_OverPayment()  
	   {  
		   String OverPayment = payLoadsConvertor.generatePayloadString("C11_OverPayment.json");  
		   Response response;  
		   log.info("**** Test Cases : Post Method *****");  
		   String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);  
		 //String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
		   response = RestCalls.PostRequest(DevURLAccess, OverPayment);  
		   String strPostResponse = TestUtils.getStrResponse(response);  
		   JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);  
		   //log.debug(jsonResponse_post);
		   log.info("***** End C11_OverPayment Test Cases ************"); 
		  Assertions.VerifyStatusCode(response, 200); 
		  Assertions.VerifyStatusCodeMessage(response, responseMessage);  
		}
//Short Payment  	
		@Test
		public static void C11_ShortPayment()
		{
			String ShortPayment = payLoadsConvertor.generatePayloadString("C11_ShortPayment.json");
			Response response;
			  log.info("**** Test Cases : Post Method *****");
			  String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
			//String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
			  response = RestCalls.PostRequest(DevURLAccess, ShortPayment);
			  String strPostResponse = TestUtils.getStrResponse(response);
			  JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
			  //log.debug(jsonResponse_post);
			  log.info("***** End C11_ShortPayment Test Cases ************");
			  Assertions.VerifyStatusCode(response, 200);
			  Assertions.VerifyStatusCodeMessage(response, responseMessage);
		}
		
//BankFee  	
				@Test
				public static void C11_BankFee()
				{
					String ShortPayment = payLoadsConvertor.generatePayloadString("C11_BankFee.json");
					Response response;
					  log.info("**** Test Cases : Post Method *****");
					  String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
					//String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
					  response = RestCalls.PostRequest(DevURLAccess, ShortPayment);
					  String strPostResponse = TestUtils.getStrResponse(response);
					  JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
					  //log.debug(jsonResponse_post);
					  log.info("***** End C11_BankFee Test Cases ************");
					  Assertions.VerifyStatusCode(response, 200);
					  Assertions.VerifyStatusCodeMessage(response, responseMessage);
				}
				
//Deduction  	
				@Test
				public static void C11_Deduction()
				{
					String ShortPayment = payLoadsConvertor.generatePayloadString("C11_Deduction.json");
					Response response;
					  log.info("**** Test Cases : Post Method *****");
					  String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
					//String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
					  response = RestCalls.PostRequest(DevURLAccess, ShortPayment);
					  String strPostResponse = TestUtils.getStrResponse(response);
					  JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
					  //log.debug(jsonResponse_post);
					  log.info("***** End C11_Deduction Test Cases ************");
					  Assertions.VerifyStatusCode(response, 200);
					  Assertions.VerifyStatusCodeMessage(response, responseMessage);
				}

//Discount  	
				@Test
				public static void C11_Discount()
				{
					String ShortPayment = payLoadsConvertor.generatePayloadString("C11_Discount.json");
					Response response;
					  log.info("**** Test Cases : Post Method *****");
					  String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
					//String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
					  response = RestCalls.PostRequest(DevURLAccess, ShortPayment);
					  String strPostResponse = TestUtils.getStrResponse(response);
					  JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
					 // log.debug(jsonResponse_post);
					  log.info("***** End C11_Discount Test Cases ************");
					  Assertions.VerifyStatusCode(response, 200);
					  Assertions.VerifyStatusCodeMessage(response, responseMessage);
				}
				
//Sundry  	
				@Test
				public static void C11_Sundry()
				{
					String ShortPayment = payLoadsConvertor.generatePayloadString("C11_Sundry.json");
					Response response;
					  log.info("**** Test Cases : Post Method *****");
					  String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
					//String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
					  response = RestCalls.PostRequest(DevURLAccess, ShortPayment);
					  String strPostResponse = TestUtils.getStrResponse(response);
					  JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
					  //log.debug(jsonResponse_post);
					  log.info("***** End C11_Sundry Test Cases ************");
					  Assertions.VerifyStatusCode(response, 200);
					  Assertions.VerifyStatusCodeMessage(response, responseMessage);

				}
				
//Writeoff  	
				@Test
				public static void C11_Writeoff()
				{
					String ShortPayment = payLoadsConvertor.generatePayloadString("C11_Writeoff.json");
					Response response;
					  log.info("**** Test Cases : Post Method *****");
					  String DevURLAccess = URL.DevEndPoint_PostRequest(Dev_Test_resource);
					//String TestURLAccess = URL.TestEndPoint_Postrequest(Dev_Test_resource);
					  response = RestCalls.PostRequest(DevURLAccess, ShortPayment);
					  String strPostResponse = TestUtils.getStrResponse(response);
					  JsonPath jsonResponse_post = TestUtils.jsonPostParser(strPostResponse);
					  //log.debug(jsonResponse_post);
					  log.info("***** End C11_Writeoff Test Cases ************");
					  Assertions.VerifyStatusCode(response, 200);
					  Assertions.VerifyStatusCodeMessage(response, responseMessage);
				}	
						
}		
	  	  

