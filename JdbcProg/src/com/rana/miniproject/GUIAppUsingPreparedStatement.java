package com.rana.miniproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GUIAppUsingPreparedStatement extends JFrame implements ActionListener 
{
	private static final String Insert_Student_Query = "INSERT INTO STUDENT1 VALUES(?,?,?)";
	
	private JLabel lno, lname, ladd, lres;
	private JTextField tno, tname, tadd;
	private JButton bInsert;
	private Connection con = null;
	private PreparedStatement ps=null;
	
	
	public GUIAppUsingPreparedStatement() 
	{
		this.setTitle("GUI frontEndApp");
		this.setBackground(Color.black);
		this.setSize(600,600);
		this.setLayout(null);
		
		
		//adding components to frame....
		lno = new JLabel("Student number:::");
		lno.setBounds(50, 50, 200, 40);
		this.add(lno);
		
		tno = new JTextField(20);
		tno.setBounds(250, 60, 200, 20);
		this.add(tno);
		
		lname = new JLabel("Student Name :::");
		lname.setBounds(50, 100, 200, 40);
		this.add(lname);
		
		tname = new JTextField(20);
		tname.setBounds(250, 100, 200, 20);
		this.add(tname);
		
		ladd = new JLabel("Student Adress :::");
		ladd.setBounds(50, 150, 200, 40);
		this.add(ladd);
		
		tadd = new JTextField(20);
		tadd.setBounds(250, 150, 200, 20);
		this.add(tadd);
		
		bInsert = new JButton("press");
		bInsert.setBounds(250, 200, 100, 40);
		this.add(bInsert);
		//register ActionEvent listener on Button Component ...
		bInsert.addActionListener(this);
		
		lres = new JLabel("RAM");
		lres.setBounds(50, 250, 400, 40);
		lres.setForeground(Color.RED);
		this.add(lres);
		//register window listener for the frame 
		this.addWindowListener(new MyAdapter());
		
		//Close window when (x) button is clicked 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true); //set Visible
		
		makeConnection();//.........for connecting during constructor execution 
	
	}
	
	private void makeConnection()
	{
		try
		{
			//create jdbc connection 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//establish the connection 
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","manager");
			//create prepared statement 
			ps = con.prepareStatement(Insert_Student_Query);
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
	}//makeConnection()

	public static void main(String[] args)
	{
		System.out.println("GUIAppUsingPreparedStatement.main()");
		new GUIAppUsingPreparedStatement();
	}//main method

	@Override
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println("GUIAppUsingPreparedStatement.actionPerformed()");
		int no=0;
		String name =null, address = null;
		int result =0;
		
		try
		{
			//read text boxs data
			no = Integer.parseInt(tno.getText());
			name = tname.getText();
			address = tadd.getText();
			
			//set values to query parameters
			ps.setInt(1, no);
			ps.setString(2, name);
			ps.setString(3, address);
			
			//execute the query
			result = ps.executeUpdate();
			if(result == 0)
				lres.setText("student registration faild...");
			else
				lres.setText("student registration done...");
		}//
		catch (SQLException sql) {
			// TODO: handle exception
			lres.setText("student registration faild...");
			sql.printStackTrace();
		}
	}//action Performed
	
	private class MyAdapter extends WindowAdapter
	{
		@Override
		public void windowClosing(WindowEvent e)
		{
			System.out.println("MyAdapter.windowClosing()");
			try
			{
				if(ps!=null)
				{
					ps.close();
				}
			}catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
			
			
			try
			{
				if(con!=null)
				{
					con.close();
				}
			}catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}			
		}
	}
	

}// class
