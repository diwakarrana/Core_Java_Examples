package com.rana.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class FourthFrame extends JFrame {
	
	JLabel l1,l2;
	JTextField t1;
	JButton b1;
	
	public FourthFrame() 
	{
		this.setSize(600, 400);
		this.setTitle("FourthFrame");
		this.setLayout(null);
		
		l1 = new JLabel("Enter Name :");
		l1.setFont(new Font("Arial", Font.BOLD, 35));
		l1.setBounds(50,100,300,40);
		this.add(l1);
		
		t1 = new JTextField();
		t1.setForeground(Color.gray);
		t1.setBounds(280,100,300,40);
		this.add(t1);
		
		b1 = new JButton("Print");
		b1.setFont(new Font("Arial",Font.BOLD,25));
		b1.setBounds(200,160,100, 40);
		this.add(b1);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String name = t1.getText();
				l2.setText("Hello"+name+", Welcome...");
			}
		});
		
		l2 = new JLabel();
		l2.setFont(new Font("Arial", Font.BOLD, 40));
		l2.setBounds(0,250,600,40);
		this.add(l2);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args)
	{
		new FourthFrame();
	}
}
