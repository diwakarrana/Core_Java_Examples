package com.rana.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

// JDBC application for deleting employee details based on given eid


public class JdbcApp2 {

	public static void main(String[] args) {
		Scanner scan = null;
		int no = 0;
		Connection con = null;
		Statement st = null;
		String query = null;
		int result = 0;
		 
		try {
			//read inputs
			scan = new Scanner(System.in);
			System.out.println("enter employee eid");
			no = scan.nextInt();
			// establish connection 
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","manager");
			// create statement object
			if(con!=null)
				st = con.createStatement();
			// formation of query 
			// delete from emp where eid = 1;
			query = "delete from emp where eid = "+no;
			//send and execute query
			result = st.executeUpdate(query);
			if(result ==0)
				System.out.println("No records found for deletion");
			else
				System.out.println(result+" recors found and deeted");
		}// try block end
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				// close jdbc objects
				if(st!=null)
					st.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				// close jdbc objects
				if(con!=null)
					con.close();
			}catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				// close jdbc objects
				if(scan!=null)
					scan.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		} //end of finally block
	} // end of main
} // end of class
