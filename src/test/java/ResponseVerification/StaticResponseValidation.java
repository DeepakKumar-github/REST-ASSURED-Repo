package ResponseVerification;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

public class StaticResponseValidation {
	
	@Test
	
	public void verify() {
		String expectedProjectName="rmg007";
	     Response response = when()
	    		 .get("https://reqres.in/api/users?page=2");
	     String actualProjectName= response.jsonPath().get("[0].projectName");
	     
	     response.then()
	             .assertThat()
	             .contentType(ContentType.JSON).and().statusCode(200)
	             .log().all();
	     Assert.assertEquals(expectedProjectName, actualProjectName);
	      
		
				
	}
	
	
}

