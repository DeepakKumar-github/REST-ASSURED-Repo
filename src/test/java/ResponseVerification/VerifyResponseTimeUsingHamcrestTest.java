package ResponseVerification;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class VerifyResponseTimeUsingHamcrestTest {
	@Test
	
	public void verify() {
		when()
		    .get("https://reqres.in/api/users?page=2")
		    .then()
		          .assertThat().time(Matchers.lessThan(5L),TimeUnit.MILLISECONDS)
		          .log().all();
		
	}

}
