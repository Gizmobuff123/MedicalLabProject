package medicalLabDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import businessHandler.DBConnectionMySQL;
import medicalLabEntities.Test;

public class TestDao
{
	Connection theCon;
	Statement stmt;
	static ArrayList<Test> sList= new ArrayList<Test>();
	static int count = 0;
	public TestDao()
	{
		try {
			theCon = DBConnectionMySQL.getConnection();
			stmt = theCon.createStatement();
		} 
		
		catch (SQLException e) 
		{
			System.out.println("Not Connected with SQL");
		} 
		catch ( ClassNotFoundException e) 
		{
			System.out.println("Not Connected ClassNotFound.");
		} 
	}
	public void insertTest(Test t)
	{
		try 
		{
			String strQuery = "INSERT INTO test  VALUES ("
				+t.getTestCode()+",'"+t.getProfileId()+"')";
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
}


