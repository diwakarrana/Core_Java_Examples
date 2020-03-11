package com.rana.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CSVreadingTest {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try { //register jdbc driver
			//Class.forName("com.hxtt.sql.text.TextDriver");
			//establish the connection 
			con = DriverManager.getConnection( "jdbc:Text:///D:\\files");
			//create statement object 
			if(con!=null)
				st = con.createStatement();
			// send and execute SQL query in DB software
			if(st!=null)
				rs = st.executeQuery("SELECT * FROM emp1.csv");
			//process the result set
			if(rs!=null) {
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
				}
			}//if
		}// try
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			// close all jdbc objects
			try{
				if(rs!=null)
				rs.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
			
			try{
				if(st!=null)
				st.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
			
			try{
				if(con!=null)
				con.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
		}
	}
}
