package com.rana.largeobjects;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PhotoRetrieveOracle {
	private static final String QUERY_PHOTO_RETRIEVE = "SELECT PHOTO FROM STUDENT WHERE SID = ? ";
	
	public static void main(String[] args) {
		 
		Scanner sc = null;
		int sid=0;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs =null;
		InputStream is = null;
		OutputStream os = null;
		byte[] bfr = null;
		int bytesread;
		
		
		try {
			sc = new Scanner(System.in);
			if(sc!=null) {
			System.out.println("enter the sid number of employee");
			sid = sc.nextInt();
			}
			
			
			//register the jdbc driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//establishing the connection 
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","manager");
			
			// create the prepared statement object
			if(con!=null)
			ps = con.prepareStatement(QUERY_PHOTO_RETRIEVE);
			
			// set parameter value 
			if(ps!=null)
				{	ps.setInt(1, sid);
					// execute the query 
					rs = ps.executeQuery();
				}
			// process the reult set (blob value)
			if(rs.next())
				is = rs.getBinaryStream(1);
			
			// create output stream for destination file 
			os = new FileOutputStream("d:\\neelam.png");
			
			// buffer based logic to copy file content
			bfr = new byte[4096];
			
			while ((bytesread = is.read(bfr))!=-1) {
				os.write(bfr,0,bytesread);
			}// while
			System.out.println("complete");
	
		}//end of try
		catch (SQLException se) {
			se.printStackTrace();
			// TODO: handle exception
		}
		catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
			// TODO: handle exception
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		finally {
			
			try {
				// close all jdbc objects
				if(rs!=null)
					rs.close();
				}catch (SQLException se) {
					se.printStackTrace();
					// TODO: handle exception
				}
			
			try {
				// close all jdbc objects
				if(ps!=null)
					ps.close();
				}catch (SQLException se) {
					se.printStackTrace();
					// TODO: handle exception
				}
			
			/*try {
				// close all jdbc objects
				if(con!=null)
					con.close();
				}catch (SQLException se) {
					se.printStackTrace();
					// TODO: handle exception
				}*/
			
			try {
				// close all jdbc objects
				if(sc!=null)
					sc.close();
				}catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}
			
			try {
				// close all jdbc objects
				if(is!=null)
					is.close();
				}catch (IOException io) {
					io.printStackTrace();
					// TODO: handle exception
				}
			
			try {
				// close all jdbc objects
				if(os!=null)
					os.close();
				}catch (IOException io) {
					io.printStackTrace();
					// TODO: handle exception
				}
		}// finally
	}//end of main
}//end of class
