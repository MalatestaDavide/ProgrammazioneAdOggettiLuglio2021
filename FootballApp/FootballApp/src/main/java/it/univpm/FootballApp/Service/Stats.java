package it.univpm.FootballApp.Service;

import java.util.HashMap;

/**
 * Class that manages all the statistics we need.
 * @author Vascello Francesco Pio
 * @author Malatesta Davide
 *
 */
public class Stats {

	public Stats() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Hashmap that return the minimum, maximum and average number of total teams.
	 * @return maxTeams, minTeams and avgTeams
	 */
	public static HashMap<String, Integer> stats() {
		int avgTeams = 0;
		int minTeams = 0;
		int maxTeams = 0;
		int teamsSA = 20;
		int teamsPD = 20;
		int teamsL1 = 20;
		
		//Min
		if( teamsSA < teamsPD && teamsSA < teamsL1) {
			minTeams = teamsSA;
			
			}
			else if (teamsPD<teamsSA && teamsPD<teamsL1) {
				minTeams = teamsPD;
				}
		else {
			minTeams = teamsL1;
			}
		
		//Max
		if( teamsSA > teamsPD && teamsSA > teamsL1) {
			maxTeams = teamsSA;
			
			}
			else if (teamsPD > teamsSA && teamsPD > teamsL1) {
				maxTeams = teamsPD;
				}
		else {
			maxTeams = teamsL1;
			}	
		
		//Avg
		avgTeams=(teamsSA + teamsPD + teamsL1)/3;
		
	
	HashMap<String, Integer> statMap = new HashMap<String, Integer>();
	statMap.put("Numero massimo di squadre", maxTeams);
	statMap.put("Numero minimo di squadre", minTeams);	
	statMap.put("Numero medio di squadre", avgTeams);
	return statMap;
	}
}
