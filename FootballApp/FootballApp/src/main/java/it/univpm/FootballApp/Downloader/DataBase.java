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
	    	
	    	//namesSerieA
	    	String[] namesSA = new String[]{"AC Milan", "ACF Fiorentina", "AS Roma", "Atalanta BC",
					"Bologna FC 1909", "Cagliari Calcio", "Genoa CFC", "FC Internazionale Milano", "Juventus FC", "SS Lazio", "Parma Calcio 1913",
					"SSC Napoli", "Udinese Calcio", "Hellas Verona FC", "US Sassuolo Calcio",
					 "FC Crotone", "Spezia Calcio", "UC Sampdoria", "Torino FC", "Benevento Calcio"};

	    	int[] points = new int[20];
	    	
	    	int[] pointsAway = new int[20];
			int[] pointsHome = new int[20];
	    	
			public ArrayList<Matches> matchesSA() {
			       ArrayList<Matches> listMatches = new ArrayList<>();
			       Matches[] data = new Matches[0];
			       data = buff1();
			          for (int i = 0; i < data.length; i++) {
			         listMatches.add(data[i]);
			      }
			   return listMatches;
			   }
			
			public void setPointsSA () {
			      ArrayList<Matches> listMatches = new ArrayList<>();
			      listMatches = matchesSA();
			      for ( int l = 0; l < listMatches.size()  ; l++) {
			         String winner = listMatches.get(l).getScore().getWinner();
			         String hometeam = listMatches.get(l).getHomeTeam().getName();
			         String awayteam = listMatches.get(l).getAwayTeam().getName();
			            int homeIndex = -1;
			            int awayIndex = -1;
			            for(int n = 0; n < namesSA.length; n++) {
			               if (winner.equals("HOME_TEAM") && hometeam.equals(namesSA[n])) {
			                  points[n] = points[n] + 3;
			               }
			               if (winner.equals("AWAY_TEAM") && awayteam.equals(namesSA[n])) {
			                  points[n] = points[n] + 3;
			               }
			               if (hometeam.equals(namesSA[n])) {
			                  homeIndex = n;
			               }
			               if (awayteam.equals(namesSA[n])) {
			                  awayIndex = n;
			               }
			               
			               //pointsHome
			               if (winner.equals("HOME_TEAM") && (hometeam.equals(namesSA[n]))) {
			                  pointsHome[n] = pointsHome[n] + 3;
			               }
			               else if (winner=="DRAW") {
			                  pointsHome[n] = pointsHome[n] + 1;
			               }
			               else {
			                  pointsHome[n] = pointsHome[n] + 0;
			               }
			               
			               //pointsAway
			               if (winner.equals("AWAY_TEAM") && (awayteam.equals(namesSA[n]))) {
			                  pointsAway[n] = pointsAway[n] + 3;
			               }
			               else if (winner=="DRAW") {
			                  pointsAway[n] = pointsAway[n] + 1;
			               }
			               else {
			                  pointsAway[n] = pointsAway[n] + 0;
			               }
			            }
			            if (winner == "DRAW") {
			               points[homeIndex] ++;
			               points[awayIndex] ++;
			            }
			      }
			   }
			   
			   public float[] getPointsSA() {
			      float[] points_mean = new float[20];
			      for (int i = 0; i < points_mean.length; i++)
			   {
			      points_mean[i] = points[i]/38;
			   }
			   return points_mean; 
			}
			   
			   public float[] getPointsSAhome() {
				      float[] points_mean = new float[20];
				      for (int i = 0; i < points_mean.length; i++)
				   {
				      points_mean[i] = pointsHome[i]/38;
				   }
				   return points_mean; 
				} 
			   
			   public float[] getPointsSAaway() {
				      float[] points_mean = new float[20];
				      for (int i = 0; i < points_mean.length; i++)
				   {
				      points_mean[i] = pointsAway[i]/38;
				   }
				   return points_mean; 
				}
			    	
	    	//namesPrimeraDivison
	    	String[] namesPD = new String[]{"Athletic Club", "Club Atlético de Madrid", "CA Osasuna",
					"FC Barcelona", "Getafe CF", "Granada CF", "Real Madrid CF", "Levante UD", "Real Betis Balompié", "Real Sociedad de Fútbol",
					"Villarreal CF", "Valencia CF", "Real Valladolid CF", "Deportivo Alavés",
					"Cádiz CF", "SD Eibar", "Elche CF", "SD Huesca", "RC Celta de Vigo", "Sevilla FC"};
	    	
	    	public ArrayList<Matches> matchesPD() {
		    	ArrayList<Matches> listMatches = new ArrayList<>();
		    	Matches[] data = new Matches[0];
		    	data = buff2();
		    	   for (int i = 0; i < data.length; i++) {
		    		   listMatches.add(data[i]);
		    	   	}
		    	   return listMatches; 
	    	} 
	    	
	    	public void setPointsPD () {
			      ArrayList<Matches> listMatches = new ArrayList<>();
			      listMatches = matchesPD();
			      for ( int l = 0; l < listMatches.size()  ; l++) {
			         String winner = listMatches.get(l).getScore().getWinner();
			         String hometeam = listMatches.get(l).getHomeTeam().getName();
			         String awayteam = listMatches.get(l).getAwayTeam().getName();
			            int homeIndex = -1;
			            int awayIndex = -1;
			            for(int n = 0; n < namesPD.length; n++) {
			               if (winner.equals("HOME_TEAM") && hometeam.equals(namesPD[n])) {
			                  points[n] = points[n] + 3;
			               }
			               if (winner.equals("AWAY_TEAM") && awayteam.equals(namesPD[n])) {
			                  points[n] = points[n] + 3;
			               }
			               if (hometeam.equals(namesPD[n])) {
			                  homeIndex = n;
			               }
			               if (awayteam.equals(namesPD[n])) {
			                  awayIndex = n;
			               }
			               
			               //pointsHome
			               if (winner.equals("HOME_TEAM") && (hometeam.equals(namesPD[n]))) {
			                  pointsHome[n] = pointsHome[n] + 3;
			               }
			               else if (winner=="DRAW") {
			                  pointsHome[n] = pointsHome[n] + 1;
			               }
			               else {
			                  pointsHome[n] = pointsHome[n] + 0;
			               }
			               
			               //pointsAway
			               if (winner.equals("AWAY_TEAM") && (awayteam.equals(namesPD[n]))) {
			                  pointsAway[n] = pointsAway[n] + 3;
			               }
			               else if (winner=="DRAW") {
			                  pointsAway[n] = pointsAway[n] + 1;
			               }
			               else {
			                  pointsAway[n] = pointsAway[n] + 0;
			               }
			            }
			            if (winner == "DRAW") {
			               points[homeIndex] ++;
			               points[awayIndex] ++;
			            }
			      }
			   }
			   
			   public float[] getPointsPD() {
			      float[] points_mean = new float[20];
			      for (int i = 0; i < points_mean.length; i++)
			   {
			      points_mean[i] = points[i]/38;
			   }
			   return points_mean; 
			}
			   
			   public float[] getPointsPDhome() {
				      float[] points_mean = new float[20];
				      for (int i = 0; i < points_mean.length; i++)
				   {
				      points_mean[i] = pointsHome[i]/38;
				   }
				   return points_mean; 
				} 
			   
			   public float[] getPointsPDaway() {
				      float[] points_mean = new float[20];
				      for (int i = 0; i < points_mean.length; i++)
				   {
				      points_mean[i] = pointsAway[i]/38;
				   }
				   return points_mean; 
				}
	    	
	    	//namesLigue1
	    	String[] namesL1 = new String[]{"Stade Brestois 29", "Olympique de Marseille", "Montpellier HSC", "Lille OSC", 
	    			"OGC Nice", "Olympique Lyonnais", "Paris Saint-Germain FC", "FC Lorient", "FC Girondins de Bordeaux", "AS Saint-Étienne", 
	    			"Dijon Football Côte d'Or", "Stade Rennais FC 1901", "Angers SCO", "FC Nantes", "FC Metz",
	    			"Racing Club de Lens", "Stade de Reims", "AS Monaco FC", "Nîmes Olympique", "RC Strasbourg Alsace"};
	    	
	    	public ArrayList<Matches> matchesL1() {
		    	ArrayList<Matches> listMatches = new ArrayList<>();
		    	Matches[] data = new Matches[0];
		    	data = buff3();
		    	   for (int i = 0; i < data.length; i++) {
		    		   listMatches.add(data[i]);
		    		   }
		    	   	return listMatches;
	    	}
	    	
	    	public void setPointsL1 () {
			      ArrayList<Matches> listMatches = new ArrayList<>();
			      listMatches = matchesL1();
			      for ( int l = 0; l < listMatches.size()  ; l++) {
			         String winner = listMatches.get(l).getScore().getWinner();
			         String hometeam = listMatches.get(l).getHomeTeam().getName();
			         String awayteam = listMatches.get(l).getAwayTeam().getName();
			            int homeIndex = -1;
			            int awayIndex = -1;
			            for(int n = 0; n < namesSA.length; n++) {
			               if (winner.equals("HOME_TEAM") && hometeam.equals(namesL1[n])) {
			                  points[n] = points[n] + 3;
			               }
			               if (winner.equals("AWAY_TEAM") && awayteam.equals(namesL1[n])) {
			                  points[n] = points[n] + 3;
			               }
			               if (hometeam.equals(namesL1[n])) {
			                  homeIndex = n;
			               }
			               if (awayteam.equals(namesL1[n])) {
			                  awayIndex = n;
			               }
			               
			               //pointsHome
			               if (winner.equals("HOME_TEAM") && (hometeam.equals(namesSA[n]))) {
			                  pointsHome[n] = pointsHome[n] + 3;
			               }
			               else if (winner=="DRAW") {
			                  pointsHome[n] = pointsHome[n] + 1;
			               }
			               else {
			                  pointsHome[n] = pointsHome[n] + 0;
			               }
			               
			               //pointsAway
			               if (winner.equals("AWAY_TEAM") && (awayteam.equals(namesL1[n]))) {
			                  pointsAway[n] = pointsAway[n] + 3;
			               }
			               else if (winner=="DRAW") {
			                  pointsAway[n] = pointsAway[n] + 1;
			               }
			               else {
			                  pointsAway[n] = pointsAway[n] + 0;
			               }
			            }
			            if (winner == "DRAW") {
			               points[homeIndex] ++;
			               points[awayIndex] ++;
			            }
			      }
			   }
			   
			   public float[] getPointsL1() {
			      float[] points_mean = new float[20];
			      for (int i = 0; i < points_mean.length; i++)
			   {
			      points_mean[i] = points[i]/38;
			   }
			   return points_mean; 
			} 		
			 
			   public float[] getPointsL1home() {
				      float[] points_mean = new float[20];
				      for (int i = 0; i < points_mean.length; i++)
				   {
				      points_mean[i] = pointsHome[i]/38;
				   }
				   return points_mean; 
				} 
			   
			   public float[] getPointsL1away() {
				      float[] points_mean = new float[20];
				      for (int i = 0; i < points_mean.length; i++)
				   {
				      points_mean[i] = pointsAway[i]/38;
				   }
				   return points_mean; 
				} 
}