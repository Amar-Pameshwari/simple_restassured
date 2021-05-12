/*
 * package com.simple.restassured;
 * 
 * import org.apache.log4j.LogManager; import org.apache.log4j.Logger; import
 * org.testng.annotations.Test; import com.utilities.URL; import
 * com.utilities.payLoadsConvertor; import io.restassured.path.json.JsonPath;
 * import io.restassured.response.Response;
 * 
 * public class InboundTesting { public static Logger log =
 * LogManager.getLogger(InboundTesting.class.getName());
 * 
 * @Test public void testingInbound() {
 * 
 * Response response;
 * 
 * Response response1;
 * 
 * 
 * String inboundPayloads =
 * payLoadsConvertor.generatePayloadString("petStore.json");
 * 
 * String endPoints_get = URL.getEndPoint("/data/2.5/weather");
 * 
 * String postString = URL.postEndPoint("/v2/pet");
 * 
 * response = RestCalls.PostRequest(postString, inboundPayloads);
 * 
 * response1 = RestCalls.GetRequest(endPoints_get);
 * 
 * String strResponse = response.getBody().asString();
 * 
 * String strResponse_Post = response1.getBody().asString();
 * 
 * log.info("*************** Get Response ***************");
 * 
 * log.info(strResponse);
 * 
 * log.info("*************** Post Response ***************");
 * 
 * System.out.println(strResponse_Post);
 * 
 * 
 * JsonPath jsonResponse_get = new JsonPath(strResponse);
 * 
 * JsonPath jsonResponse_post = new JsonPath(strResponse_Post);
 * 
 * String id = jsonResponse_get.getString("id"); System.out.println(id);
 * 
 * String lon = jsonResponse_post.getString("coord.lon");
 * System.out.println(lon);
 * 
 * 
 * 
 * }
 * 
 * 
 * }
 */