package WaysToPostRequest;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class CreateAResourseUsingJSONObject {
	@Test
	public void create() {

		Random ran = new Random();
		int randomnumb=ran.nextInt(100);
		
		JSONObject jobj = new JSONObject();
		 jobj.put("createdby", "sandeep");
		 jobj.put("projectname", "tyss 27"+randomnumb);
		 jobj.put("status", "On Going");
		 jobj.put("teamsize", 100);
	
          given()
          	.body(jobj)
          	.contentType(ContentType.JSON)
          .when()
          	.post("http://localhost:8084/addproject")
          	
          .then()
          .assertThat().statusCode(201)
          .contentType(ContentType.JSON)
          .log().all();

}
}
