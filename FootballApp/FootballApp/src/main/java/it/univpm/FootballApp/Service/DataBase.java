package it.univpm.FootballApp.Service;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.UnknownHostException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonParser;

import it.univpm.FootballApp.Downloader.*;

public class DataBase implements folder {
	    public DataBase() {
		// TODO Auto-generated constructor stub
	}
	    public static ArrayList<String> buffer1() throws FileNotFoundException {	    		
	    	ArrayList<String> data = new ArrayList<String>();
	    	for (int i = 2015; i < 2020; i+=2 ) {
	    		for (int j=2018; j<2021;j++) {
	    			try {
	    				String result = Data.download("https://api.football-data.org/v2/competitions/"+ i +"/matches/?season=" + j );
	    				File.file(result, folderCompeitions);
	    				data = JsonParser.parseLeague(folderCompeitions);
	    				return data;
	    			} catch (UnknownHostException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			} catch (FileNotFoundException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			} catch (IOException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	    		}
	    }
		return null;
	    }
	   }
