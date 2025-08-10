package com.example.automation.utils.commonUtils;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class APIUtils {
   
    public Response sendGetRequest(String url) {
        return RestAssured.given()
                .when()
                .get(url)
                .then()
                .extract()
                .response();
    }
    public Response sendPostRequest(String url, Object body) {
        return RestAssured.given()
                .contentType("application/json")
                .body(body)
                .when()
                .post(url)
                .then()
                .extract()
                .response();
    }

    public static void main(String[] args) {
        APIUtils apiUtils = new APIUtils();
        String url = "https://jsonplaceholder.typicode.com/posts";
        
        //Example GET request
        Response getResponse = apiUtils.sendGetRequest(url);
        System.out.println("GET Response: " + getResponse.asString());
        
    }
    
}
