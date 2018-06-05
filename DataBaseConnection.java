package Com.cg.jdbc.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataBaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// Step 1: Register a Driver
		Class.forName("com.mysql.jdbc.Driver");
		//Step 2: Establish connection
		String url = "jdbc:mysql://localhost:3306/automation";
		String username = "roor";
		String password = "root";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("connection Established");
	}

}

