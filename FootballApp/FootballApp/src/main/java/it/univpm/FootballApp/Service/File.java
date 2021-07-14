package it.univpm.FootballApp.Service;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedReader;

public class File {
	public static void file(String string, String fileName)  { 
	try {
		BufferedWriter writer;
		writer = new BufferedWriter(new FileWriter(fileName));
		writer.write(string);
		writer.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
 
		/**

		* Method for storing the contents of a text file in a string
		* @param fileName Directory del file da leggere
		* @return line Stringa contenente il file letto
		*/
 
		public static String toString(String fileName) {
 
		BufferedReader reader;
 
		String line="{";

		try {
			reader = new BufferedReader(new FileReader(fileName));
			while(reader.read()!=-1) {
				String c = reader.readLine();		 
				line+=c;
			} 
			reader.close();
			} catch (FileNotFoundException e) {	 
				System.out.println("Error: " + fileName + " path not found.\n");	 
				e.printStackTrace();
		
		} catch (IOException e) {		 
			System.out.println("Error reading file " + fileName);		 
			e.printStackTrace();		 
		}	
		
		return line;

		 
		}
	}

