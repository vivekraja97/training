package com.cg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareStatements {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.driver");
		String url="jdbc:mysql://locathost:3306/automation";
		String username="root";
		String password="root";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connected to DB");
		String query ="insert into  customers values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, 101);
		ps.setString(2,"raja");
		ps.setString(3, "coimbatore");
		ps.executeUpdate();
		System.out.println("1 row effected...");
		con.close();
	}

}
