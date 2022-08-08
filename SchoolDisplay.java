package com.CodingTest1B.Display;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import com.CodingTest1B.*;
public class SchoolDisplay {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		int rollno = sc.nextInt();
		try {
			if(rollno != 0) {
				query = "SELECT * FROM student WHERE rollno = ?";
			}
			else {
				query = "SELECT * FROM student";
			}
			
			pstmt = conn.prepareStatement(query);
			if(rollno !=0) {
				pstmt.setInt(1, rollno);
				 rs = pstmt.executeQuery();
			};
			
			while(rs.next()) {
				int rno = rs.getInt("rollno");
				String Name = rs.getString("studentName");
				String std = rs.getString("standard");
				String DOB = rs.getString("dob");
				double fees = rs.getDouble("fees");
				
				System.out.println(rno+" "+Name+" "+std+" "+DOB+" "+fees);
				
			}
			
			
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		sc.close();

}
}