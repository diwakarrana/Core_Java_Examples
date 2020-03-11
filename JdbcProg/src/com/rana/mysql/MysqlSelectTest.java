package com.rana.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlSelectTest {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			// register jdbc driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Rana@123");
			// create statment object
			if(con!= null)
				st = con.createStatement();
			// send and execute sql query in database software
			if (st!=null)
				rs = st.executeQuery("select * from student");
			// process the result set
			if(rs!=null) {
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"    "+rs.getString(3)+"    "+rs.getInt(4));
				}// while	
			}//if
		}//try
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			//close all jdbc objects
			try {
				if(rs!=null)
					rs.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(st!=null)
					rs.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(con!=null)
					rs.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
	
		}// finally
	}// main
}//class
