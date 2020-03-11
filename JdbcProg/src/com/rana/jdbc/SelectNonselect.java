package com.rana.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectNonselect {

	public static void main(String[] args) {
		Scanner scan = null;
		String query = null;
		Connection con = null;
		Statement st = null;
		Boolean flag = false;
		ResultSet rs = null;
		int count = 0;
		
		try {
			//read sql query 
			scan = new Scanner(System.in);
			if(scan!=null)
			{
				System.out.println("enter query that is to be execute on emp table");
				query = scan.nextLine();
			}// if
			
			//Establish the connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","manager");
			
			// statement formation
			if(con!=null)
				st = con.createStatement();
			// send and execute sql query
			flag = st.execute(query);
			
			if(flag == true ) {
				System.out.println("select query is executed");
				rs = st.getResultSet();
				//process the result set
				while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}//if
			else {
				System.out.println(" non select query is executed");
				count = st.getUpdateCount();
				System.out.println("number of recoers that are affected "+count);
			}//else
		}//try
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			// close all jdbc objects
			try {
				if(rs!=null)
					rs.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(st!=null)
					st.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(con!=null)
					con.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(scan!=null)
					scan.close();
			}catch(Exception e) {
				e.printStackTrace();
			}	
		}
	}//end of main
}//end of class
