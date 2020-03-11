package com.rana.date;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class DateRetrieve {

		private static final String DATE_SELECT_QUERY = "SELECT * FROM PERSON1";
		
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean flag = false; 
		int pid=0;
		String name = null, sdob = null, sdoj ;
		java.sql.Date sqdob= null, sqdoj=null;
		java.util.Date udob = null, udoj = null;
		SimpleDateFormat sdf = null;
		
		
			
		try { 
			//register the jdbc driver
			  //Class.forName("oracle.jdbc.driver.OracleDriver");
			//establish the connection 
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","manager");
			//create prepared statement object 
			if(con!= null)
				ps = con.prepareStatement(DATE_SELECT_QUERY);
			// execute the query
			if(ps!=null)
				rs = ps.executeQuery();
			//process the result set
			if(rs!=null)
			{
				while(rs.next()) {
					flag = true;
					pid = rs.getInt(1);
					name = rs.getString(2);
					sqdob = rs.getDate(3);
					sqdoj = rs.getDate(4);
					// convert java.sql.Dtae class object to java.util.Date class object
					udob = (java.util.Date)sqdob;
					udoj = (java.util.Date)sqdoj;
					// converting java.util.Date class object to string date value
					sdf = new SimpleDateFormat("dd-MMM-yyyy");
					sdob = sdf.format(udob);
					sdoj = sdf.format(udoj);
					System.out.println(pid+"  "+name+"  "+sdob+"  "+sdoj);
				}  // while
			}//if
			if(flag==false)
				System.out.println("Records not found");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		//catch(ClassNotFoundException se) {
		//	se.printStackTrace();
		//}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
			try {	
				if(rs!=null)
					rs.close();
			} catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {	
				if(ps!=null)
					ps.close();
			} catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {	
				if(con!=null)
					con.close();
			} catch(SQLException se) {
				se.printStackTrace();
			}
			
		}//finally
	}// end of main
} // end of class
