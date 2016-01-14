package businessHandler;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnectionMySQL 
{
	private static Connection theCon = null;
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		
		String dsn = "MedicalLab";
		String dbUrl = "jdbc:mysql://localhost/" + dsn;
		Class.forName("com.mysql.jdbc.Driver");
		//String conString = "jdbc:odbc:" + dsn;//  datasource
		System.out.println("Connecting with mysql " + dsn + " Database");
		if(theCon == null)
		{
			theCon = DriverManager.getConnection(dbUrl,"root","Haxxan765");
			System.out.println("MySQL DB Connection successfull with "+ dsn);
		}
		return theCon;
	}
	public void closeConnection() throws SQLException
	{
		theCon.close();
	}
}
