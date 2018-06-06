package com.cg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.driver");
		String url="jdbc:mysql://locathost:3306/automation";
		String username="root";
		String password="root";
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connected to DB");
		String query="create table Customers(cid int,cname vatchar(15), city varchar(16))";
		Statement st = con.createStatement();
		st.executeUpdate(query);
		System.out.println("Table Created");
		con.close();
		
		
		
		
	}

}
