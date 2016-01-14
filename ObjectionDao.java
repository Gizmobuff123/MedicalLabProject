package medicalLabDao;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import businessHandler.DBConnectionMySQL;
import medicalLabEntities.Objection;

public class ObjectionDao
{
	Connection theCon;
	Statement stmt;
	static ArrayList<Objection> sList= new ArrayList<Objection>();
	static int count = 0;
	public ObjectionDao()
	{
		try 
		{
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
	public void insertObjection(Objection o)
	{
		try 
		{
			String strQuery = "INSERT INTO objection  VALUES ("
				+o.getObjectionId()+",'"+o.getProfileId()+"','"+o.getDescription()+"')";
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
}


