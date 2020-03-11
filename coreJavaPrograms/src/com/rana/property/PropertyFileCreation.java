package com.rana.property;

import java.io.FileWriter;
import java.util.Properties;

public class PropertyFileCreation {

	public static void main(String[] args) throws Exception {
	
		Properties p = new Properties();
		p.setProperty("email", "diwakarrana464@gmail.com");
		p.setProperty("education", "B.tech");
		p.setProperty("school", "ideal_public_school");
		p.store(new FileWriter("C:\\Users\\Diwakar Rana\\Downloads\\neelam\\db1.properties"),"storing example");
		System.out.println("file successfully created");
	}
}
