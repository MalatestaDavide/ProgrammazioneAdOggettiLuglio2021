package it.univpm.FootballApp.Downloader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import org.springframework.web.servlet.tags.HtmlEscapingAwareTag;

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
	    /**
	     * Method that download the info of Serie A in Italy
	     * @return data of serie A
	     * @throws UnknowHostException
	     * @throws IOException
	     */
	    public Competitions buffer1() {	    		
	    	Competitions data = new Competitions();
	    			try {
	    				String result = Downloader.download("https://api.football-data.org/v2/competitions/2019");
	    				if(result.isEmpty())
	    					System.out.println("Error1");
	    				else {
	    					data = Parsing.parseCompetitions(result);
						}
	    			    	    				 	    				
	    			} catch (UnknownHostException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			} 
	    			 catch (IOException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	    		
			return data;
	    }
	    
	    /**
	     * Method that download the info of Primera Division in Spain
	     * @return data of Primera Division
	     * @throws UnknowHostException
	     * @throws IOException
	     */
	    public Competitions buffer2() {	    		
	    	Competitions data = new Competitions();
	    			try {
	    				String result = Downloader.download("https://api.football-data.org/v2/competitions/2014");
	    				if(result.isEmpty())
	    					System.out.println("Error2");
	    				else {
	    					data = Parsing.parseCompetitions(result);
						}
	    			    				
	    			} catch (UnknownHostException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			} 
	    			 catch (IOException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	    		
			return data;
	    }
	    
	    /**
	     * Method that download the info of Ligue 1 in France
	     * @return data of Ligue 1
	     * @throws UnknowHostException
	     * @throws IOException
	     */
	    public Competitions buffer3() {	    		
	    	Competitions data = new Competitions();
	    			try {
	    				String result = Downloader.download("https://api.football-data.org/v2/competitions/2015");
	    				if(result.isEmpty())
	    					System.out.println("Error3");
	    				else {
	    					data = Parsing.parseCompetitions(result);
						}
	    				
	    			} catch (UnknownHostException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			} 
	    			 catch (IOException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	    		
			return data;
	    }
	    
	    /**
	     * ArrayList where we go to put the previously downloaded data
	     */
	    public ArrayList<String> arrayListCompetitions() {
	  
	    	ArrayList<String> listCompetitions = new ArrayList<>();
	    	listCompetitions.add(buffer1().toString()+"\n\n");
	    	listCompetitions.add(buffer2().toString()+"\n\n");
	    	listCompetitions.add(buffer3().toString());
	    	System.out.println(listCompetitions);
	    	return listCompetitions;
	    	
	    }
	    
	    /**
	     * Method that download all the matches of serie A
	     * @return matches
	     * @throws UnknowHostException
	     * @throws IOException
	     */
	    	public Matches buff1() {	    		
	    	Matches data = new Matches();
	    			try {
	    				String result = Downloader.download("https://api.football-data.org/v2/competitions/2019/matches");
	    				if(result.isEmpty())
	    					System.out.println("Error4");
	    				else {
	    				   data = Parsing.parseMatches(result);
						}
	    			    	    				 	    				
	    			} catch (UnknownHostException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			} 
	    			 catch (IOException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	    		
			return data;
	    } 
	    /**
	     * Method that download all the matches of serie A
	     * @return matches
	     * @throws UnknowHostException
	     * @throws IOException
	     */
	   /*  public Prova buff1() {	    		
	    	Prova prova = new Prova();
	    			try {
	    				String result = Downloader.download("https://api.football-data.org/v2/competitions/2019/matches");
	    				System.out.println(result);
	    				if(result.isEmpty())
	    					System.out.println("Error4");
	    				else {
	    					prova = Parsing.parseprova(result);
						}
	    			    	    				 	    				
	    			} catch (UnknownHostException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			} 
	    			 catch (IOException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	    		
			return prova;
	    } 
	    */
	    
	    
	    public void arrayListMatches() {
	    	ArrayList<String> listMatches = new ArrayList<>();
	    	listMatches.add(buff1().toString());
	    	System.out.println("\n\n");
	    	System.out.println(listMatches);
	    }
	    
}

	
	  