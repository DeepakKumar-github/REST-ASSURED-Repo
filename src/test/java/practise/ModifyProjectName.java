package practise;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class ModifyProjectName {

	@Test
	public void update() {
		//create of random number
		Random ran =new Random();
		int randomnumber = ran.nextInt(500);

		//json simple dependency
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","deepak");
		jobj.put("createdOn", "10/02/2022");
		//jobj.put("projectId", "string");
		jobj.put("projectName", "deepak_pro-99");
		jobj.put("status", "Created");
		jobj.put("teamSize", 10);

		given()
		.body(jobj)
		.contentType(ContentType.JSON)

		.when()
		.put("http://localhost:8084/projects/TY_PROJ_818")
		.then()
		.assertThat()
		.statusCode(200)
		.log().all();		
	}

}

