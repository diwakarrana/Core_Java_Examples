package com.rana.largeobjects;

import java.io.File;
import java.util.Scanner;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;;

public class PhotoInsert {
	
	private final static String QUERY_LARGE_FILE = " INSERT INTO STUDENT VALUES(SEQ.NEXTVAL,?,?,?,?)";

	public static void main(String[] args) {
		
		Scanner sc = null;
		int /*sid=0,*/ rollNo=0;
		String sname=null, photoPath=null, resumePath=null;
		File file1 = null, file2 = null; 
		FileInputStream fileinputStream1 = null, fileinputStream2 = null;
		Connection con =null;
		PreparedStatement ps =null;
		int result = 0;
		
		
		try {
			sc = new Scanner(System.in);
			if(sc!=null)
			{
				//System.out.println("enter sid of student");
				//sid = sc.nextInt();
				System.out.println("enter name of student");
				sname = sc.next();
				System.out.println("neter roll number of student");
				rollNo = sc.nextInt();
				System.out.println("enter photo path");
				photoPath = sc.next();
				System.out.println("enter resume path");
				resumePath = sc.next();
			}
			//create input stream by locating file based on given path
			file1 = new File(photoPath);
			fileinputStream1 = new FileInputStream(file1);
			
			file2 = new File(resumePath);
			fileinputStream2 = new FileInputStream(file2);
			
			
			// register jdbc driver ...
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// establishing the connection 
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","manager");
			
			//create prepared statement object 
			if(con!=null)
				ps = con.prepareStatement(QUERY_LARGE_FILE);
			
			//set query parameters .....
			if(ps!=null) {
				//ps.setInt(1, sid);
				ps.setString(1, sname);
				ps.setInt(2, rollNo);
				ps.setBlob(3, fileinputStream1 , file1.length());
				ps.setBinaryStream(4, fileinputStream2, file2.length());
			}
			
			//execute the sql query......
			if(ps!=null)
				result = ps.executeUpdate();
			
			// process the result set 
			if(result == 0)
				System.out.println("Rocords are not inserted");
			if(result == 1)
				System.out.println("Rocords inserted");
		}
		
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				if(ps!=null)
					ps.close();
			}catch (SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(con!=null)
					con.close();
			}catch (SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(sc!=null)
					sc.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}// finally
	}// main
}// class
