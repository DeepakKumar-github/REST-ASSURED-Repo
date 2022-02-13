package com.parameters;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class PathParameterTest {
	 @Test
	 public void param() {
		 String proId = "TY_PROJECT_2002";
		 given()
		        .pathParam("projectID", proId)
		 .when()
		        .delete("http:localhost:8084/projects/{projectID}")
		 .then()
		        .log().all();
	 }

}
