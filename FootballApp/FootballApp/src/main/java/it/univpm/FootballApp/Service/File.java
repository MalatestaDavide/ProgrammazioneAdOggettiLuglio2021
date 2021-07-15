package it.univpm.FootballApp.Service;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

/**
 * Class for write and read file;
 * @author Vascello Francesco Pio
 * @author Malatesta Davide
 */

public class File {
	
	/**
	 * Method for save a string in a text file
	 * @param string to save
	 * @param fileName to save
	 * 
	 */
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

		* Method for storing a text file in a string
		* @param fileName folder of the file
		* @return periodo that contains the file read
		*/
 
	public static String toString(String fileName) {
			BufferedReader reader;
			String periodo ="{";
			try {
				reader = new BufferedReader(new FileReader(fileName));
				while(reader.read()!=-1) {
					String stringa = reader.readLine();		 
					periodo += stringa;
				}
				reader.close();
			} catch (FileNotFoundException e) {	 
				System.out.println( fileName + " not found\n");	 
				e.printStackTrace();
		
		} catch (IOException e) {		 
			System.out.println("Error reading " + fileName);		 
			e.printStackTrace();		 
		}	
		
		return periodo;

		 
		}
	}

