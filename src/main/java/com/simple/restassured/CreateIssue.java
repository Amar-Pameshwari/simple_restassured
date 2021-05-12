/*
 * package com.simple.restassured;
 * 
 * import org.apache.log4j.LogManager; import org.apache.log4j.Logger; import
 * org.apache.tools.ant.types.Assertions.BaseAssertion; import
 * org.testng.annotations.BeforeTest;
 * 
 * import com.utilities.URL; import com.utilities.payLoadsConvertor;
 * 
 * import io.restassured.response.Response;
 * 
 * public class CreateIssue {
 * 
 * Response response; public static Logger log =
 * LogManager.getLogger(CreateIssue.class.getName());
 * 
 * private String sessionId;
 * 
 * @BeforeTest public void setUp() { sessionId = BaseTest.doLogin(); }
 * 
 * public void createBug() { Response response;
 * log.info("*** Create Test Cases for creating bug ***");
 * 
 * String URI = URL.getEndPoint("/v2/pet"); String CreateIssuePayloads =
 * payLoadsConvertor.generatePayloadString("petStore.json"); //response =
 * RestCalls.PostRequest(uRI, strJSON, CreateIssuePayloads);
 * //Assertions.VerifyStatusCode(response, 201); } }
 */