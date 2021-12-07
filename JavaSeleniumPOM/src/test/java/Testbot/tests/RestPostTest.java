package Testbot.tests;

import org.testng.Assert;
import org.testng.annotations.Optional;
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
		 JSONObject payload = postUserPayload("thebadcoder","coding");
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
	
	public JSONObject postUserPayload(@Optional String userName, String job)
	{
		JSONObject payloadUser = new JSONObject();
		if(!userName.isEmpty())
		{
			payloadUser.put("name", userName);
		}
		if(!job.isEmpty())
		{
			payloadUser.put("job", job);
		}
		
		
		return payloadUser;
	}
}