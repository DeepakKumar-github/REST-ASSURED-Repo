package practiseCRUDWithBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetAllResources {
	
	@Test
	
	public void getResources() {
		
		
		when()
		     .get("https://reqres.in/api/users?page=2")
		     
		.then()
		      .assertThat().contentType(ContentType.JSON)
		      .statusCode(200)
		      .log().all();
		     
	}

}
