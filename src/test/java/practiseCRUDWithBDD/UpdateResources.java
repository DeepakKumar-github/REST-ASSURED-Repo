package practiseCRUDWithBDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateResources {
	@Test
	public void updateResources() {
		
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy", "Deepak01"); 
		jObj.put("projectName", "APTY");
		jObj.put("status" , "Created");
		jObj.put("teamSize", 06);
		
		given()
	       .body(jObj)
	       .contentType(ContentType.JSON)
	       
	 .when()
	    .post("https://reqres.in/api/users")
	    
	  .then()
	      .assertThat().statusCode(201)
	      .contentType(ContentType.JSON)
	      .log().all();	
		}
	}
	


