package com.rana.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstFrame extends JFrame implements ActionListener {
	
	JButton b1, b2; // instance variable
	
	public FirstFrame() {
		// TODO Auto-generated constructor stub
		this.setSize(600, 600);
		this.setTitle("First Frame");
		this.setLayout(null);
		this.b1 = new JButton("login");
		this.b2 = new JButton("logout");
		b1.setBounds(150,250, 150,50);
		b2.setBounds(300,250, 150,50);
		b1.addActionListener(this);
		b2.addActionListener(this);
		this.add(b1);
		this.add(b2);
		this.setVisible(true);
	}

	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new FirstFrame();
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			System.out.println("login successful..");
		}
		else
		{
			System.exit(1);
		}
		
	}

}
