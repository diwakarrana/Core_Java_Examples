package com.rana.applet;

import java.applet.Applet;
import java.awt.*;

@SuppressWarnings({ "serial"})
public class SecondServlet extends Applet {
	public SecondServlet()
	{
		System.out.println("SecondServlet instantiation");
	}
	
	public void paint(Graphics g)
	{
		System.out.println("SecondServlet.paint()");
	}
	
	public void init()
	{
		System.out.println("SecondServlet.init()");
	}
	
	public void start()
	{
		System.out.println("SecondServlet.start()");
	}
	
	public void stop()
	{
		System.out.println("SecondServlet.stop()");
	}
	
	public void destroy()
	{
		System.out.println("SecondServlet.destroy()");
	}
}
