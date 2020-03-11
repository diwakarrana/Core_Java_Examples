package com.rana.date;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateInsert {
	
	private static final String DATE_INSERT_QUERY ="INSERT INTO PERSON1 VALUES (?,?,?,?)";

	public static void main(String[] args) {
		
		Scanner sc = null;
		int no = 0;
		String name = null, sdob = null, sdoj = null;
		SimpleDateFormat sdf = null;
		java.util.Date udob = null;
		java.sql.Date sqdob = null,sqdoj = null;
		long ms = 0;
		
		Connection con = null;
		PreparedStatement ps = null;
		int result =0;
						
		try {
			sc = new Scanner(System.in);
			System.out.println("enter no");
			no = sc.nextInt();
			System.out.println(" enter name");
			name = sc.next();
			System.out.println("enetr date of birth DOB(MM-dd-yyyy)");
			sdob = sc.next();
			System.out.println("enter date of joining JOIN(yyyy-mm-dd)");
			sdoj = sc.next();
			// convert String date value to java.sql.Date class objects=======================================
			//for dob==========================================================================================
			sdf = new SimpleDateFormat("MM-dd-yyyy");
			if(sdf!=null)
				udob = sdf.parse(sdob);
			if(udob != null)
				ms = udob.getTime();
			sqdob = new java.sql.Date(ms);
			//for doj ==========================================================================================
			sqdoj = java.sql.Date.valueOf(sdoj);
			
			
			// establishing connection 
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","manager");
			
			//create prepared statement 
			if(con!= null) 
				ps = con.prepareStatement(DATE_INSERT_QUERY);
			// set value query param 
			
			if(ps!= null) {
				ps.setInt(1, no);
				ps.setString(2, name);
				ps.setDate(3, sqdob);
				ps.setDate(4, sqdoj);
			}
			// execute the query 
			if(ps!=null)
				result = ps.executeUpdate();
			
			//process the result 
			
			if(result ==0)
				System.out.println("Record not inserted");
			else
				System.out.println("Record inserted");		
		}// try
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if(ps != null)
					ps.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(con != null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(sc != null)
					sc.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}//finally
	}//main
}//class
