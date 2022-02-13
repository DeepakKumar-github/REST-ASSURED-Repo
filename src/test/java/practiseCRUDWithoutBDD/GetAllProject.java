package practiseCRUDWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllProject {
	@Test
	public void getAllProject() {
		Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
		
		
		System.out.println(resp .prettyPrint()); 
		System.out.println(resp .prettyPeek());
		System.out.println(resp.getContentType());
		System.out.println(resp.getStatusCode());
		
	}

}
