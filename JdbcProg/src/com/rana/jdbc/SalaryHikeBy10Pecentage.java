package com.rana.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// jdbc application development for salary increment by 10 percentage where designation is manager

public class SalaryHikeBy10Pecentage {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		String query = null;
		int result = 0;
		
		try { 
			// establish connection 
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","manager");
			// statement formation
			if (con != null)
			st = con.createStatement();
			query = "update emp set salary = salary*1.1 where designation = 'clerk'";
			//send and execute query
			if(st!=null)
			result = st.executeUpdate(query);
			if (result != 0)
				System.out.println(result+" records successfully updated ");
			else
				System.out.println("As per required records not found");		
			}// end of try block
		catch(SQLException se) {
			se.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			// closing of jdbc objects
			try {
				if(st!=null)
					st.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(con!=null)
					con.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		} //end of finally block
	}// end of main method
}// end of class
