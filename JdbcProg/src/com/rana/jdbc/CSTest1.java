package com.rana.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;


/*create or replace procedure p_first_pro(x in number, y out number ) as 
begin
y:=x*x;
end;*/
public class CSTest1 {
	private static final String QUERY = "{call p_first_pro(?,?)}";
	public static void main(String[] args) {
		Scanner sc = null;
		int no =0;
		Connection con = null;
		CallableStatement cs = null;
		int result = 0;
		 try {
			 // read inputs
			 sc = new Scanner(System.in);
			 if (sc!=null) {
				 System.out.println("Enter no");
			 	 no = sc.nextInt();
			 }
			 //register jdbc driver 
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 //establish the connection 
			 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","manager");
			 // create callable statement object
			 if(con != null)
				 cs = con.prepareCall(QUERY);
			 // register out parameters with jdbc types 
			 if(con!=null)
				 cs.registerOutParameter(2, Types.INTEGER);
			 //set value to in parameters ....
			 if (con!=null) 
			{
				 cs.setInt(1, no);
			 //execute PL/sql procedure ..
			 cs.execute();
			 // gather result from out parameters 
			 result = cs.getInt(2);
			 System.out.println("Square value"+result);
			}//if
		 }//try
		 catch (SQLException se) {
			 se.printStackTrace();
		}
		 catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		 catch (Exception e) {
			e.printStackTrace();
		}
		 
	finally {
		//close jdbc objects
		try {
			if(cs!=null)
				cs.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		
		try {
			if(con!=null)
				con.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		
		try {
			if(sc!=null)
				sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		}// finally
	}//main
}// class
