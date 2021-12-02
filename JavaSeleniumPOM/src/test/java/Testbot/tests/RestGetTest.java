package Testbot.tests;

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
        RestAssured.baseURI = "https://reqres.in/";
        RequestSpecification getUsersRequest = RestAssured.given();
        Response restResponse = getUsersRequest.request(Method.GET,"/api/users");
        System.out.println(restResponse.asString());
        int statusCode = restResponse.getStatusCode();
        Assert.assertEquals(statusCode, 200);
        JsonPath jsonResponse = restResponse.jsonPath();
        String someValue = jsonResponse.get("data.0.email");
        System.out.println("Email:"+someValue);

    }
    
}
