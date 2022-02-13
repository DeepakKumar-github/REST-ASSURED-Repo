package practiseCRUDWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSingleProject {

	@Test
public void getSingleProject() {
			Response resp = RestAssured.get("https://reqres.in/api/users/2");
			
			
			System.out.println(resp .prettyPrint()); 
			System.out.println(resp .prettyPeek());
			System.out.println(resp.getContentType());
			System.out.println(resp.getStatusCode());
			
		}
}
