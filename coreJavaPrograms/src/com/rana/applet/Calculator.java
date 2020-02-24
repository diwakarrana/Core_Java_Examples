package com.rana.applet;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Calculator extends Frame implements ActionListener  {
	
	Label l1,l2,l3,l4;
	Button b1,b2,b3,b4,b5;
	TextField t1,t2,t3;
	
	public Calculator()
	{
		setLayout(null);
		setSize(800, 800);
		l1 = new Label("Enter no 1:");
		l2 = new Label("Enter no 2:");
		l3 = new Label("Result:");
		l4 = new Label(" ");
		
		t1 = new TextField("", 20);
		t2 = new TextField("", 20);
		t3 = new TextField("", 20);
		
		b1 = new Button("ADD");
		b2 = new Button("SUB");
		b3 = new Button("MUL");
		b4 = new Button("DIV");
		b5 = new Button("EXIT");
		
		l1.setBounds(100,100,150,50);
		t1.setBounds(350,100,150,50);
		l2.setBounds(100,200,150,50);
		t2.setBounds(350,200,150,50);
		l3.setBounds(100,300,150,50);
		t3.setBounds(350,300,150,50);
		l4.setBounds(150,50,200,50);
		b1.setBounds(100,400,100,50);
		b2.setBounds(200,400,150,50);
		b3.setBounds(300,400,150,50);
		b4.setBounds(400,400,150,50);
		b5.setBounds(460,475,150,50);

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b5)
			System.exit(1);
		try {
			int a,b,c;
			String s1 = t1.getText();
			String s2 = t2.getText();
			a = Integer.parseInt(s1);
			b = Integer.parseInt(s2);
			
			if(ae.getSource()==b1)
			{
				c = a+b;
				String res = Integer.toString(c);
				t3.setText(res);
			}
			else if(ae.getSource()==b2)
			{
				c = a-b;
				String res = Integer.toString(c);
				t3.setText(res);
			}
			else if(ae.getSource()==b3)
			{
				c = a*b;
				String res = Integer.toString(c);
				t3.setText(res);
			}
			else if(ae.getSource()==b4)
			{
				c = a/b;
				String res = Integer.toString(c);
				t3.setText(res);
			}
		}//try
		catch(Exception e) {
			l4.setText("Error Info: "+ e.getMessage());
		}
	}// action performed
	@SuppressWarnings("deprecation")
	public static void main(String []args) {
		Calculator c = new Calculator();
		c.show();
	}
 
}
