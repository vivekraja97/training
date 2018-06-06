package com.cg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.driver");
		String url="jdbc:mysql://locathost:3306/automation";
		String username="root";
		String password="root";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connected to DB");
		String query = "select * from customers";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
			{
			System.out.println(rs.getInt(1)+" " +rs.getString(2));
			}	
		con.close();
	}

}
