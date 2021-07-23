package it.univpm.FootballApp.Downloader;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.events.Namespace;

import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.apache.tomcat.websocket.pojo.PojoEndpointServer;

import ch.qos.logback.core.joran.conditional.IfAction;
import it.univpm.FootballApp.Model.Competitions;
import it.univpm.FootballApp.Model.Matches;
import it.univpm.FootballApp.Model.Score;
import it.univpm.FootballApp.Model.awayTeam;
import it.univpm.FootballApp.Model.homeTeam;
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
	    	return listCompetitions;
	    	
	    }
	    
	    public ArrayList<Competitions> competitionSA() {

	    	   ArrayList<Competitions> listCompetition = new ArrayList<>();
	    	   listCompetition.add(buffer1());
	    	 //System.out.println(listCompetitions);
	    	   return listCompetition;

	    	}
	    
	    public ArrayList<Competitions> competitionPD() {

	    	   ArrayList<Competitions> listCompetition = new ArrayList<>();
	    	   listCompetition.add(buffer2());
	    	   return listCompetition;

	    	}
	    
	    public ArrayList<Competitions> competitionL1() {

	    	   ArrayList<Competitions> listCompetition = new ArrayList<>();
	    	   listCompetition.add(buffer3());
	    	   return listCompetition;
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
	    	            String result = Downloader.download("https://api.football-data.org/v2/competitions/SA/matches/?season=2020");
	    	            if(result.isEmpty())
	    	               System.out.println("Error");
	    	            else {
	    	               data = new Matches[Parsing.parseMatches(result).length];
	    	               data = Parsing.parseMatches(result);
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
		    	            String result = Downloader.download("https://api.football-data.org/v2/competitions/PD/matches/?season=2020");
		    	            if(result.isEmpty())
		    	               System.out.println("Error");
		    	            else {
		    	               data = new Matches[Parsing.parseMatches(result).length];
		    	               data = Parsing.parseMatches(result);
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
		    	            String result = Downloader.download("https://api.football-data.org/v2/competitions/FL1/matches/?season=2020");
		    	            if(result.isEmpty())
		    	               System.out.println("Error");
		    	            else {
		    	               data = new Matches[Parsing.parseMatches(result).length];
		    	               data = Parsing.parseMatches(result);
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
	    	
	    	String[] names = new String[]{"AC Milan", "ACF Fiorentina", "AS Roma", "Atalanta BC",
					"Bologna FC 1909", "Cagliari Calcio", "Genoa CFC", "FC Internazionale Milano", "Juventus FC", "SS Lazio", "Parma Calcio 1913",
					"SSC Napoli", "Udinese Calcio", "Hellas Verona FC", "US Sassuolo Calcio",
					 "FC Crotone", "Spezia Calcio", "UC Sampdoria", "Torino FC", "Benevento Calcio"};

	    	int[] points = new int[20];
	    	
	    	public ArrayList<Matches> matchesSA() {
		    	ArrayList<Matches> listMatches = new ArrayList<>();
		    	Matches[] data = new Matches[0];
		    	data = buff1();
		    	   for (int i = 0; i < data.length; i++) {
		    		   listMatches.add(data[i]);
		    		   
		    		   Matches m = new Matches();
		    		   String winner = m.getScore().getWinner();
		    		   String hometeam = m.getHomeTeam().getName();
		    		   String awayteam =m.getAwayTeam().getName();
		    		   
		    		   for ( int l = 0; l < listMatches.size()  ; l++) {
		    			   
		    		   		for ( int p = 0; p < points.length; p++) {

		    		    		   for(int n = 0; n < names.length; n++) {

		    			    			 if (winner.equals(hometeam) && (hometeam.equals(names[n])) || (winner.equals(awayteam)) && (awayteam.equals(names[n]))) {
		    			    				 points[p] = points[p] + 3;
		    			    			 }
		    				    			   else if (winner=="DRAW") {
		    				    				   points[p] = points[p] + 1;
		    				    			   }
		    						    			   else {
		    											points[p] = points[p] + 0;
		    						    			   }

		    	 		     		}
		    		   		}
		    		   }
		    		   
		    	   }  
		    	   //System.out.println(points);
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