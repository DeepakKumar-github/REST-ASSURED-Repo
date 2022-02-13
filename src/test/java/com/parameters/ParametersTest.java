package com.parameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class ParametersTest {
	
 @Test
 
 public void params() {
	 given()
	      .pathParam("org", "dpk96")
	      .queryParam("sort", "created")
	      .queryParam("per_page", "6")
	      .when()
	           .get("https://api.github.com/orgs/{org}")
	           .then()
	           .assertThat().statusCode(404)
	           .log().all();
	 
 }
 

}
