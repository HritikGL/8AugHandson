package com.CodingTest1B.model;
import java.sql.Connection;
import java.sql.DriverManager;
public class SchoolDB {
	
	public Connection getConnection()throws Exception

	 {

	 Class.forName("com.mysql.cj.jdbc.Driver");

	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");

	 return con;
	 }

}
