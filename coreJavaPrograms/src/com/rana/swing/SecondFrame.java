//implementation of ActionListener interface using inner class  
package com.rana.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SecondFrame extends JFrame 
{
	JButton b1,b2;
	public SecondFrame() 
	{
		this.setSize(600, 400);
		this.setName("Second Frame");
		this.setTitle("Second Frame");
		this.setLayout(null);
		this.b1 = new JButton("login");
		this.b2 = new JButton("logout");
		b1.setBounds(150, 300, 150, 50);
		b2.setBounds(300, 300, 150, 50);
		b1.addActionListener(new Button1Inner());
		b2.addActionListener(new Button2Inner());
		this.add(b1);
		this.add(b2);
		this.setVisible(true);
	}
	

	public static void main(String[] args) 
	{
		new SecondFrame();
	}

	class Button1Inner implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1)
			{
				System.out.println("Login Successful");
			}
		}
	}
	
	class Button2Inner implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b2)
			{
				System.exit(1);
			}
		}
	}
	
}
