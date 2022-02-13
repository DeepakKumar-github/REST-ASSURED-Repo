package practiseCRUDWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;



public class CreateResource {
	@Test
	
	public void createResource() {
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
		      .log().all();	}

}
	
