// on bases of input Eid get the details of employee.......
package com.rana.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CSTest2 {
	private static final String EMP_DETAILS_QUERY = "{ call p_get_EmpDetails(?,?,?,?)}";

	public static void main(String[] args) {
		Scanner sc = null;
		int no =0;
		Connection con = null;
		CallableStatement cs = null;
		
		
		
		try {
			// take employee id from user into no variable 
			sc = new Scanner(System.in);
			if (sc!=null)
			{
				System.out.println("eneter employee id");
				no = sc.nextInt();
			}			
			//register jdbc driver 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Establish the connection 
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","manager");
			
			//create callable statement object and send query
			if (con!= null)
				cs = con.prepareCall(EMP_DETAILS_QUERY);
			if (cs!=null)
			{
				// regiter out parameters of procedure with JDBC types 
				cs.registerOutParameter(2, Types.VARCHAR);
				cs.registerOutParameter(3, Types.INTEGER);
				cs.registerOutParameter(4, Types.VARCHAR);
				//set value to in parameter
				cs.setInt(1, no);
				// call pl/sql procedure
				cs.execute();
				//gather result from out parameters 
				System.out.println("Employee name "+cs.getString(2));
				System.out.println("Employee salary "+cs.getString(3));
				System.out.println("Employee designation "+cs.getString(4));
			}//if 
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
		
		finally
		{
			// close jdbc objects
			try 
			{
				if (cs!=null)
					cs.close();
			}catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
			
			try 
			{
				if (con!=null)
					con.close();
			}catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
			
			try 
			{
				if (sc!=null)
					sc.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}// finally
	}// main
}//class
