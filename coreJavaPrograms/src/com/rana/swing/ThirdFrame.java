// combobox example using anonymous inner class 
package com.rana.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ThirdFrame extends JFrame
{
	JComboBox cb1;
	
	public ThirdFrame() 
	{
		this.setSize(400, 500);
		this.setTitle("third Frame");
		this.setLayout(null);		
		cb1 = new JComboBox();
		String[] S = {"One", "two", "three", "four"};
		for(int i = 0; i<S.length; i++)
		{
			cb1.addItem(S[i]);
		}
		cb1.setBounds(200,150,200,50);
		this.add(cb1);
		cb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String item = (String)cb1.getSelectedItem();
				System.out.println("Selected item :"+item);
			}
		});
		this.setVisible(true);
	}

	public static void main(String[] args)
	{
		new ThirdFrame();
	}

}
