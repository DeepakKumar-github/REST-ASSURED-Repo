package WaysToPostRequest;

import java.util.HashMap;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class CreateAResourseUsingHashMapTest {
	@Test
	
	public void create() {
		HashMap map = new HashMap();
		
		map.put("createdBy", "Deepak01");
		map.put("projectName", "BMW");
		map.put("status","created");
		map.put("teamSize", 10);
		
		
		given()
		  .body(map)
		  .contentType(ContentType.JSON)
		  .when()
		  .post("https://reqres.in/api/register")
		  .then()
		  .assertThat().statusCode(201)
		  .contentType(ContentType.JSON)
		  .log().all();
		
	}
	}


