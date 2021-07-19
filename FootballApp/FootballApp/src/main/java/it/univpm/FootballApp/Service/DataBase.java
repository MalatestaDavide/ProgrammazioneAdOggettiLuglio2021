package it.univpm.FootballApp.Service;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import it.univpm.FootballApp.Downloader.*;
import it.univpm.FootballApp.Model.Competitions;
import it.univpm.FootballApp.Model.Matches;

/**
 * Class that gets info from the API.
 * @author Vascello Francesco Pio
 * @author Malatesta Davide
 */
public class DataBase  {
	    public DataBase() {
		// TODO Auto-generated constructor stub
	}
	    public void provafunzione(String prova_result) {
	    	
	    	System.out.println(prova_result);
	    }
	    public Competitions buffer1() {	    		
	    	Competitions data = new Competitions();
	    	//for (int i = 2015; i < 2020; i+=2 ) {
	    			try {
	    				String result = Downloader.download("https://api.football-data.org/v2/competitions/2019" );
	    				if(result.isEmpty())
	    					provafunzione("PROBLEMA");
	    				
	    				
	    				 data = Parsing.parseCompetitions(result);
	    				String provax= data.toString();
	    				 provafunzione(provax);
	    				 
	    				
	    			} catch (UnknownHostException e) {
	    				// TODO Auto-generated catch block
	    				System.out.println("ciao2");
	    				e.printStackTrace();
	    			} 
	    			 catch (IOException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	    		//} 
	    			//return data;
          
		
	    	
			return data;
	    }
	    
	    public void arrayList() {
	    	DataBase comp = new DataBase();
	    	ArrayList<String> listCompetitions = new ArrayList<>();
	    	listCompetitions.add(buffer1().toString());
	    	System.out.println(listCompetitions);
	    }
}
	   