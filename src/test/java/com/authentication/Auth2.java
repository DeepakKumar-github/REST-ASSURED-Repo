package com.authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class Auth2 {
	@Test
	
	public void auths() {
		    Response response = given()
				.formParams("client_id", "tiana")
				.formParams("client_secret", "c6fb7a911f79ac739aa833ed72a7c5f6")
				.formParams("grant_type", "client_credentials")
				.formParams("redirect_uri", "https://example.com")
		.when()
		    .post("http://coop.apps.symfonycasts.com/token");
		
		    String token = response.jsonPath().get("access_token") ;
			
			  given() 
			     .auth().oauth2(token) 
			     .pathParam("USER_ID", "2788")
		.when()
			  .post("http://coop.apps.symfonycasts.com/api{USER_ID}/chickens-feed")
			  
	    .then()
			  .log().all();
			 
				
	}

}
