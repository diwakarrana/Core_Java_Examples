// jdbc application using callable statement to select details of all employee
package com.rana.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import oracle.jdbc.OracleTypes;

public class CsCursorTest {
	private static final String QUERY = "{call fetch_AllEmpDetails(?,?)}";
	public static void main(String[] args) {
		Scanner sc = null;
		String initChars = null;
		Connection con = null;
		CallableStatement cs = null;
		ResultSet rs = null;
		boolean flag = false;
		
		
		
		try {
			sc = new Scanner(System.in);
			if(sc!=null)
			{
				System.out.println("enter initial character of name of employee");
				initChars = sc.next().toUpperCase()+"%";
			}
			// register jdbc driver 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// establish connection 
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","manager");
			
			//call the callable statement object
			if(con!=null)
				cs = con.prepareCall(QUERY);
			
			if(cs!=null)
			{
				//register out parameters with jdbc types 
				cs.registerOutParameter(2, OracleTypes.CURSOR);
				
				//set in parameters value 
				cs.setString(1, initChars);
				
				//execute pl/sql procedure
				cs.execute();
				
				//gather result from out parameters 
				rs =(ResultSet)cs.getObject(2);				
			}//if
			// process the result set 
			if(rs!=null)
			{
				while(rs.next())
				{
					flag = true ;
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
				}//while
				
				if(flag==false)
					System.out.println("No Record Found");
			}// if	
		}//try
		catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
		}
		catch (ClassNotFoundException cnf) {
			// TODO: handle exception
			cnf.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		finally {
			// close all jdbc object 
			try {
				if(rs!=null)
					rs.close();
			}catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
			
			try {
				if(cs!=null)
					cs.close();
			}catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
			
			try {
				if(con!=null)
					con.close();
			}catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
			
			try {
				if(sc!=null)
					sc.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}//main
}//main class
