package com.rana.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoginApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String user = null, pass = null;
		Connection con = null;
		Statement st = null;
		String query = null;
		ResultSet rs = null;
		int result =0;
		
		try {
			//read inputs 
			System.out.println("enter user name");
			user = sc.nextLine();
			System.out.println("enter pass");
			pass = sc.nextLine();
			// convert input values as required by SQL query
			user = "'"+user+"'";
			pass = "'"+pass+"'";
			// create connection 
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","manager");
			//create statement object 
			if(con!=null)
				st = con.createStatement();
			// prepare sql query 
			// select count(*) from login where username = 'yogendra' and psw = 'sudha';
			query = "select count(*) from login where username = "+user+" and psw =" +pass;
			System.out.println(query);
			//execute query
			rs = st.executeQuery(query);
			//process the result set
			if(rs!=null) {
				if(rs.next())
					result = rs.getInt(1);
				System.out.println(result);
			}
			if(result == 0)
				System.out.println("invalid credentials");
			if(result == 1)
				System.out.println("valid credential");
			
		} //end of try block
		catch(SQLException se) {// to handle known exception
			se.printStackTrace();
			System.out.println("record insertion fail");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("record insertion failed");
		}
		
		finally {
			// close jdbc objects in reverse order 
			try {
				if(rs!=null)
					rs.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(st!=null)
					st.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(sc!=null)
					sc.close();
			}
			catch(Exception se) {
				se.printStackTrace();
			}
			
		}// end of finally block
	}// end of main method 
}// end of class
