package com.rana.property;

import java.io.FileReader;
import java.util.Properties;

public class Property1 {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("C:\\Users\\Diwakar Rana\\Downloads\\neelam\\db.properties");
		Properties p = new Properties();
		p.load(reader);
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("age"));
		System.out.println(p.getProperty("address"));
	}
}
