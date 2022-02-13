package ResponseVerification;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PojoLibrary.PojoClass;
import io.restassured.http.ContentType;

public class UsingDataProvider {
	@Test(dataProvider = "getData")
	public void crete(String name, String job, String id, String createdAt ) {
		PojoClass pobj = new PojoClass(name, job, id, createdAt);
		given()
		   .body(pobj)
		   .contentType(ContentType.JSON)
		   
		   .when()
		   .post("https://reqres.in/api/users?page=2")
		   
		   
		   .then()
		   .assertThat().statusCode(201)
		   .contentType(ContentType.JSON)
		   .log().all();
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[] [] objArr=new Object[2] [4];
		
		objArr[0] [0]="Deepak Kumar";
		objArr[0] [1]="coff112";
		objArr[0] [2]="completed";
		objArr[0] [3]=50;
		
		
		objArr[0] [0]="Deepak Dk";
		objArr[0] [0]="Apache";
		objArr[0] [0]="completed";
		objArr[0] [0]=22;
		
		return objArr;
		
	}

}
