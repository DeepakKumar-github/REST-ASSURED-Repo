package com.requestChaning;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class RequestChaningTest {
	
	@Test
	public void chaning() {
		
		Response response = when()
				.get("http:localhost:8084/projects");
		Object proID = response.jsonPath().get("[0].projectId");
		System.out.println(proID);
		
		given()
		     .delete("http:localhost:8084/projects/{projectId}")
		 .then()
		     .assertThat().statusCode(204)
		     .log().all();
				
	}
	
	

}
