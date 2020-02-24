package com.rana.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class ThirdServlet extends Applet implements ActionListener {
	Button btn1, btn2, btn3, btn4;
	TextField tf1;
	Checkbox cb1,cb2,cb3;
	CheckboxGroup cbg;
	
	public void init()
	{
		this.setLayout(new FlowLayout());
		 btn1 = new Button("button-1");
		 btn2 = new Button("button-2");
		 btn3 = new Button("button-3");
		 btn4 = new Button("button-4");
		 tf1 = new TextField("type here something", 35);
		 cbg = new CheckboxGroup();
		 cb1 = new Checkbox("red",cbg,false);
		 cb2 = new Checkbox("blue",cbg,true);
		 cb3 = new Checkbox("green",cbg,false);
		/*
		 * btn1.setBounds(50, 800, 100, 200); btn1.setBounds(50, 800, 100, 200);
		 * btn1.setBounds(50, 800, 100, 200); btn1.setBounds(50, 800, 100, 200);
		 */
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(tf1);
		this.add(cb1);
		this.add(cb2);
		this.add(cb3);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		tf1.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==btn1)
		{
			System.out.println(" button-1 clicked");
		}
		
		if(ae.getSource()==btn2)
		{
			System.out.println(" button-2 clicked");
		}
		
		if(ae.getSource()==btn3)
		{
			System.out.println(" button-3 clicked");
		}
		
		if(ae.getSource()==btn4)
		{
			System.out.println(" button-4 clicked");
		}
	}
	
	public void paint(Graphics g)
	{
		if(cb1.getState())
			g.setColor(Color.cyan);
		else if(cb2.getState())
			g.setColor(Color.MAGENTA);
		else 
			g.setColor(Color.gray);
			g.drawString(tf1.getText(),50,200);
	}
	public void actionPerformed1(ActionEvent ae)
	{
		repaint();
	}
}
