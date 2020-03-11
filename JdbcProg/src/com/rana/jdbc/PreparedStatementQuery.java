// prepared statement example
// version 1.0
// author  team rana

package com.rana.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementQuery {
	
	public static void main (String[] args) {
		
		Scanner scan = null;
		int count =0;
		Connection con = null;
		String query = null;
		PreparedStatement ps = null;
		int sid =0;
		String studentName = null;
		int rollNumber = 0;
		int result = 0;
		
		
		try {// read inputs
			scan = new Scanner(System.in);
			System.out.println("enter number of student count");
			count = scan.nextInt();
			// establish the connection 
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","manager");
			//prepared sql query
			query = "INSERT INTO STUDENT VALUES(?,?,?)";
			if(con!=null)
				ps = con.prepareStatement(query);
			// read multiple input values from end users
			if(scan!=null) {
				for(int i=1; i <= count; i++) {
					System.out.println("enter"+i+"student sid");
					sid = scan.nextInt();
					System.out.println("enter student name");
					studentName = scan.next();
					System.out.println("enter student roll number");
					rollNumber = scan.nextInt();
					
					ps.setInt(1, sid);
					ps.setString(2, studentName);
					ps.setInt(3, rollNumber);
					// execute query
					result = ps.executeUpdate();
					if(result ==0)
						System.out.println(i+"student details are not inserted");
					else
						System.out.println(i+"student details are inserted");
				}//for
			}//if
		}//try
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {  // close all jdbc objects
				if(ps!=null)
					ps.close();
			} 
			catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {  // close all jdbc objects
				if(con!=null)
					con.close();
			} 
			catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {  // close all jdbc objects
				if(scan!=null)
					scan.close();
			} 
			catch(Exception e) {
				e.printStackTrace();
			}
		}// finally
	}// main
}// clss
