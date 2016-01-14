package medicalLabDao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import businessHandler.DBConnectionMySQL;
import medicalLabEntities.Profile;

public class ProfileDao
{
	Connection theCon;
	Statement stmt;
	static ArrayList<Profile> sList= new ArrayList<Profile>();
	static int count = 0;
	public ProfileDao()
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
	public void insert(Profile p)
	{
		try 
		{
			String strQuery = "INSERT INTO profile  VALUES ("
				+p.getProfileId()+",'"+p.getName()+"','"+p.getAddress()+"','"+p.getContactNo()+"','"+p.getEmail()+"','"+p.getCnic()+"')";
			stmt.executeUpdate(strQuery);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}

