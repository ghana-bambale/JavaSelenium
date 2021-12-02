package Testbot.tests;

import java.net.URI;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestGetTest {
    @Test
    public void getUsers()
    {
        // Set Base URI
        RestAssured.baseURI = "https://reqres.in/";
        
        // Create Request Object
        RequestSpecification getUsersRequest = RestAssured.given();
        
        // Add resource
        String resource = "/api/users";

        // Execute request and capture response object
        Response restResponse = getUsersRequest.request(Method.GET,resource);
        
        // Print reponse as string
        System.out.println(restResponse.asString());
        
        // Verify status code
        int statusCode = restResponse.getStatusCode();
        Assert.assertEquals(statusCode, 200);

        // Jsonify the response body
        JsonPath jsonResponse = restResponse.jsonPath();

        // Retrieve a specific value from Response using Json path
        String someValue = jsonResponse.get("data[0].email");
        System.out.println("Email:"+someValue);

    }
    
}
