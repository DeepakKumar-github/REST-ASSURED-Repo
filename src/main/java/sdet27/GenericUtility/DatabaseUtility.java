package sdet27.GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

/**
 * This Class contains DB connection, DBclose, get data from DB, get and verify data
 * @author Dk
 *
 */
public class DatabaseUtility {
	
	Connection con=null;
	//step 1:register the database--1
	//step 2:get connection with Db--1
	//step 3:issue create statement ---2
	//step 4:execute query--2
	//step 5:close db connection--3
	/**
	 * this method will establish connection with data base
	 * @throws Throwable
	 */
	public void connectDb() throws Throwable {
		Driver Driverref=new Driver();
		DriverManager.registerDriver(Driverref);
		 con = DriverManager.getConnection(IConstants.dbURL, IConstants.dbUserName, IConstants.dbPassword);
		 
		}
	 public String executequeryAndgetData(String Query,int colunindex,String expData) throws SQLException {
		 boolean flag=false;
		ResultSet result = con.createStatement().executeQuery(Query);
	 
	while(result.next())
	{
		 String value = result.getString(colunindex);
		 if(value.equalsIgnoreCase(expData))
		 {
			 flag=true;//raise the flag
			 break;
		 }
	}
	if(flag)
	{
		System.out.println(expData+" Data Verified");
		return expData;
	}
	else {
		System.out.println("data not present");
		return " ";
	}
	 }
	
	
	
	
	/**
	 * this method will close the data base connection
	 * @throws Throwable
	 */
	public void closeDb() throws Throwable {
		con.close();
	}

}

	

















	