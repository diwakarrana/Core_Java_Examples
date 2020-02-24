package com.rana.applet;

import java.applet.Applet;
import java.awt.*;

@SuppressWarnings("serial")
public class FirstApplet extends Applet {
    public void paint(Graphics g)
    {
    	g.drawString("Hello world ", 200,200);
    }
}
