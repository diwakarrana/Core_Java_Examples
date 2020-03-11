package com.rana.connectionpool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleConnectionPoolDataSource;

public class ConnPoolTest {
	
	public static void main(String[] args)
	{
		OracleConnectionPoolDataSource ds = null;
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			//creating DataSource object that represent empty connection pool of jdbc
			ds = new OracleConnectionPoolDataSource();
			
			//set jdbc properties to datasource object  l
			ds.setDriverType("thin");
			ds.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
			ds.setUser("system");
			ds.setPassword("manager");
			// create connection object from the connection pool through ds
			con = ds.getConnection();
			
			// create statement object
			if(con != null) {
				 st = con.createStatement();
			}
			
			// send and execute sql query
			if(st!=null)
			{
				 rs = st.executeQuery("select * from emp");
			}
			
			//process the result set 
			if(rs != null) {
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4)+"  "+rs.getString(5));
				}//while
			}//if
		}//try
		catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		finally {
			//close jdbc object
			try {
				if(rs!=null) 
					rs.close();
			}
			catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
			
			try {
				if(st!=null) 
					st.close();
			}
			catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
			
			try {
				if(con!=null) 
					con.close();
			}
			catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
			
			try {
				if(ds!=null) 
					ds.close();
			}
			catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
		}//finally
	}//end of main
}//end of class











