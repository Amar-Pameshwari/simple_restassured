package DataProvider_WithJson;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class JsonDataProvier {
	public static RequestSpecification httpRequest;	
	public static String devURL = "https://d-api.sbdinc.com";
	
	/*
	@BeforeTest
	public void setup() {
		RestAssured.baseURI = devURL;
		httpRequest =  RestAssured.given();
		*/
	
	@Test(dataProvider = "getData")
	public void testDP(HashMap<String,Object> map) {
		
		for(Map.Entry<String, Object> m:map.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}
	}
	
	@DataProvider
	public Object[] getData() throws JsonParseException, JsonMappingException, IOException {
		HashMap<String,Object> map1 = new ObjectMapper()
									.readValue(new File(System.getProperty("user.dir")+"\\resources\\C11_BankFee.json"), 
										new TypeReference<HashMap<String, Object>>() {});
		return new Object[] {map1};
	}
	
	public static void BankFeeExecution() {
		
		
	}
}