package Testbot.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class RestPostTest{
	
	@Test
	public void postUserTest()
	{
		 RestAssured.baseURI = "https://reqres.in/";
		 RequestSpecification postUserRequest = RestAssured.given();
		 
		 String endpoint = "api/users";
		 HashMap<String, String> headers = headerParameters();
		 JSONObject payload = postUserPayload();
		 postUserRequest.headers(headers);
		 postUserRequest.body(payload.toJSONString());
		 
		 Response postUserResponse = postUserRequest.request(Method.POST,endpoint);
		 
		 Assert.assertEquals( postUserResponse.getStatusCode(),201);
		 
		 System.out.println("Response: "+postUserResponse.asPrettyString());
		 
		 
	}
	public HashMap<String, String> headerParameters()
	{
		HashMap<String, String> headers = new HashMap<String,String>();
		headers.put("Content-Type", "application/json");
		return headers;
	}
	
	public JSONObject postUserPayload()
	{
		JSONObject payloadUser = new JSONObject();
		payloadUser.put("name", "thebadcoder");
		payloadUser.put("job", "coding");
		
		return payloadUser;
	}
}