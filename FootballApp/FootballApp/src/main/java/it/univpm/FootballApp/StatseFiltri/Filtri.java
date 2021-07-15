package it.univpm.FootballApp.StatseFiltri;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonParser;

import it.univpm.FootballApp.Model.Competitions;

/** Class that implements filters
 * @author Vascello Francesco Pio
 */
public class Filtri {

	public Filtri() {
		// TODO Auto-generated constructor stub
	}
	
	public static Competitions retCompetitions(String competition) throws IOException { 
		 ArrayList<String> data = JsonParser.parseLeague(folderCompetition); 
		 int competitionId = newLeague.lookForId(nomeTeam);
}
