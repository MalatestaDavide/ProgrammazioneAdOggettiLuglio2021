package it.univpm.FootballApp.Downloader;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;


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
	    				String result = Downloader.download("https://api.football-data.org/v2/competitions/SA");
	    				if(result.isEmpty())
	    					System.out.println("Error");
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
	    				String result = Downloader.download("https://api.football-data.org/v2/competitions/PD");
	    				if(result.isEmpty())
	    					System.out.println("Error");
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
	    				String result = Downloader.download("https://api.football-data.org/v2/competitions/FL1");
	    				if(result.isEmpty())
	    					System.out.println("Error");
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
	     * @return List of competitions
	     */
	    public ArrayList<Competitions> arrayListCompetitions() {
	  
	    	ArrayList<Competitions> listCompetitions = new ArrayList<>();
	    	listCompetitions.add(buffer1());
	    	listCompetitions.add(buffer2());
	    	listCompetitions.add(buffer3());
	    	//System.out.println(listCompetitions);
	    	return listCompetitions;
	    	
	    }
	    
	    public ArrayList<Competitions> competitionsSA() {

	    	   ArrayList<Competitions> listCompetitions = new ArrayList<>();
	    	   listCompetitions.add(buffer1());
	    	   return listCompetitions;

	    	}
	    
	    public ArrayList<Competitions> competitionsPD() {

	    	   ArrayList<Competitions> listCompetitions = new ArrayList<>();
	    	   listCompetitions.add(buffer2());
	    	   return listCompetitions;

	    	}
	    
	    public ArrayList<Competitions> competitionsL1() {

	    	   ArrayList<Competitions> listCompetitions = new ArrayList<>();
	    	   listCompetitions.add(buffer3());
	    	   return listCompetitions;
	    	}
	    
	    /**
	     * Method that download all the matches of serie A
	     * @return matches
	     * @throws UnknowHostException
	     * @throws IOException
	     */
	    	public Matches[] buff1() {
	    	   Matches[] data = new Matches[0];
	    		   try {
	    	            String result = Downloader.download("https://api.football-data.org/v2/competitions/SA/matches?season=2020");
	    	            if(result.isEmpty())
	    	               System.out.println("Error");
	    	            else {
	    	               data = new Matches[Parsing.parseMatches(result).length];
	    	               data = Parsing.parseMatches(result);
	    	               System.out.println(data);
	    	            	}
	    	         
	    	         }
	    	    catch (UnknownHostException e) {
   	            // TODO Auto-generated catch block
   	            e.printStackTrace();
   	         } 
   	          catch (IOException e) {
   	            // TODO Auto-generated catch block
   	            e.printStackTrace();                                          
	    	}
			return data;
	    }   
	    	public Matches[] buff2() {
		    	   Matches[] data = new Matches[0];
		    	   
		    		   try {
		    	            String result = Downloader.download("https://api.football-data.org/v2/competitions/PD/matches?season=2020");
		    	            if(result.isEmpty())
		    	               System.out.println("Error");
		    	            else {
		    	               data = new Matches[Parsing.parseMatches(result).length];
		    	               data = Parsing.parseMatches(result);
		    	               System.out.println(data);
		    	            	}
		    	         
		    	         }
		    	    catch (UnknownHostException e) {
	   	            // TODO Auto-generated catch block
	   	            e.printStackTrace();
	   	         } 
	   	          catch (IOException e) {
	   	            // TODO Auto-generated catch block
	   	            e.printStackTrace();
	   	         }
		    	                                                   
				return data;
		    }   
	    	public Matches[] buff3() {
		    	   Matches[] data = new Matches[0];
		    	  
		    		   try {
		    	            String result = Downloader.download("https://api.football-data.org/v2/competitions/FL1/matches?season=2020");
		    	            if(result.isEmpty())
		    	               System.out.println("Error");
		    	            else {
		    	               data = new Matches[Parsing.parseMatches(result).length];
		    	               data = Parsing.parseMatches(result);
		    	               System.out.println(data);
		    	            	}
		    	         
		    	         }
		    	    catch (UnknownHostException e) {
	   	            // TODO Auto-generated catch block
	   	            e.printStackTrace();
	   	         } 
	   	          catch (IOException e) {
	   	            // TODO Auto-generated catch block
	   	            e.printStackTrace();
	   	         }

				return data;
		    }   
	    	
	    	
	    	
	    	public ArrayList<Matches> matchesSA() {
		    	ArrayList<Matches> listMatches = new ArrayList<>();
		    	Matches[] data = new Matches[0];
		    	data = buff1();
		    	   for (int i = 0; i < data.length; i++) {
		    		   listMatches.add(data[i]);
		    	   }
		    	   	return listMatches;
		    	 }
	    	
	    	public ArrayList<Matches> matchesPD() {
		    	ArrayList<Matches> listMatches = new ArrayList<>();
		    	Matches[] data = new Matches[0];
		    	data = buff2();
		    	   for (int i = 0; i < data.length; i++) {
		    		   listMatches.add(data[i]);
		    	   }
		    	   	return listMatches;
		    	 }
	    	
	    	public ArrayList<Matches> matchesL1() {
		    	ArrayList<Matches> listMatches = new ArrayList<>();
		    	Matches[] data = new Matches[0];
		    	data = buff3();
		    	   for (int i = 0; i < data.length; i++) {
		    		   listMatches.add(data[i]);
		    	   }
		    	   	return listMatches;
		    	 }
}

	
	  