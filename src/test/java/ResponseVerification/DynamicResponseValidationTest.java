package ResponseVerification;

import static io.restassured.RestAssured.*;

import java.util.List;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DynamicResponseValidationTest {
	 public void verify() {
		 String expectedProjectName="rmg963";
		  Response response = when()
				  .get("https://reqres.in/api/users?page=2");
		  List<String>proNames = response.jsonPath().get("ProjectName");
		  boolean flag =false;
		  for (String pNames:proNames) {
			  try {
				  if (pNames.equals(expectedProjectName)) {
					  flag= true;
				  }
				  }catch(Exception e) {
			  }
			  
		  }
		  response.then()
		      .assertThat()
		      .contentType(ContentType.JSON)
		      .log().all();
		  
	 }

}
