// Jdbcapp1
package com.rana.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Application to get details of highest salary employee
 * Version: 1.0
 * Author: Team-Rana
 * Date: 2 September 2019
 **/

public class JdbcApp1 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		String query = null;
		boolean flag = false;
		
		try {
			//registration
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Establish the connection of JDBC driver
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","manager");
			// Create the statements object to carry sql query
			if (con!=null)
					st = con.createStatement();
			// send and execute SQL query in database software
			if(st!=null) 
					{
					// SELECT EID, ENAME, SALARY, DESIGNATION FROM EMP
					//WHERE SALARY = (SELECT MAX(SALARY) FROM EMP);
					query = " SELECT EID, ENAME, SALARY, DESIGNATION FROM EMP WHERE SALARY = (SELECT MAX(SALARY) FROM EMP)";
					rs = st.executeQuery(query);
					}
		
			// process the result set
			if(rs!=null)
					{
					while(rs.next())
							{
							flag = true;
							System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
							}// end of while loop 
					}// end of if 
		
			if (!flag) 
					System.out.println("Record not found");	
			}//end of try block
		
		 catch(SQLException se) {
			se.printStackTrace();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	finally {
				// close jdbc objects in reverse order of opening
				try {
						if (rs!= null)
							rs.close();
					}
				catch(SQLException se) {
				se.printStackTrace();
				}
			
				try {
						if (st!= null)
							st.close();
					}
				catch(SQLException se) {
				se.printStackTrace();
				}
			
				try {
						if (con!= null)
							con.close();
					}
				catch(SQLException se) {
				se.printStackTrace();
				}
				
		}// end of finally block
	}// end of main method
}// end of class
