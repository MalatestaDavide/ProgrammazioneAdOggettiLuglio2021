package it.univpm.FootballApp.Service;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

import it.univpm.FootballApp.Downloader.*;
import it.univpm.FootballApp.Model.Competitions;
import it.univpm.FootballApp.Model.Matches;

/**
 * Class that gets info from the API.
 * @author Vascello Francesco Pio
 * @author Malatesta Davide
 */
public class DataBase implements Folder {
	    public DataBase() {
		// TODO Auto-generated constructor stub
	}
	    public static Competitions buffer1() throws FileNotFoundException {	    		
	    	Competitions data = new Competitions();
	    	for (int i = 2015; i < 2020; i+=2 ) {
	    			try {
	    				String result = Downloader.download("https://api.football-data.org/v2/competitions/"+ i);
	    				File.file(result, folderCompetitions);
	    			 data = Parsing.parseCompetitions(folderCompetitions);
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
	    
		return data;
	    }
   
	    public static Matches buffer2() throws FileNotFoundException {	    		
	    	Matches data1 = new Matches();
	    	for (int i = 2015; i < 2020; i++) {
	    		for (int j=2018; j<2021;j++) {
	    			try {
	    				String result = Downloader.download("https://api.football-data.org/v2/competitions/"+ i +"/matches/?season=" + j);
	    				File.file(result, folderMatches);
	    				data1 = Parsing.parseMatches(folderMatches);
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
	    
		return null;
	    }
			return data1;
	  }   	
}    