package com.oops;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClassConcept {

	public static void main(String[] args) throws IOException {


		//The Properties class represents a persistent set of properties. The Properties can be saved to a stream or loaded from a stream.
		Properties prop = new Properties();
		
		//Creates a FileInputStream by opening a connection to an actual file
		FileInputStream fInput = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\oops\\Abstraction.txt");

		//Reads a property list (key and element pairs) from the input byte stream.
		prop.load(fInput);
		
		//Searches for the property with the specified key in this property list.
		System.out.println(prop.getProperty("fname"));
		
		//Prints this property list out to the specified output stream.
		prop.list(System.out);
		
		//Calls the Hashtable method put.
		prop.setProperty("race", "black");
		prop.list(System.out);
		
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.dir")+"\\src\\JavaBasics\\config.properties");
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.name"));
	
		
		
		
		
	}

}
