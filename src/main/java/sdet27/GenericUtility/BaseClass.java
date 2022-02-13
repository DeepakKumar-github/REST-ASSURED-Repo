package sdet27.GenericUtility;

import static io.restassured.RestAssured.*;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


/**
 * this class contains baseUri and port no. and also use to close data base connection
 * @author Dk
 *
 */

public class BaseClass {
	public DatabaseUtility dLib = new DatabaseUtility();
	public BaseClass jlib =  new BaseClass();
	public RestAssuredUtility rLib = new RestAssuredUtility();

	@BeforeSuite
	public void bsconfig() throws Throwable 
	{	
		dLib.connectDb();
		System.out.println("------database connection established----");

		baseURI = "http://localhost";
		port = 8084;
	}


	@AfterSuite
	public void asconfig() throws Throwable
	{
		dLib.closeDb();
		System.out.println("--------database connection closed");
	}

}
