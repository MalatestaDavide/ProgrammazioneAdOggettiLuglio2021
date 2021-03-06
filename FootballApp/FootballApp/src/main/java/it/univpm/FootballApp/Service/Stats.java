package it.univpm.FootballApp.Service;

import java.time.Period;
import java.util.HashMap;

import it.univpm.FootballApp.Downloader.DataBase;

import java.time.LocalDate;

/**
 * Class that manages all the statistics we need.
 * @author Vascello Francesco Pio
 * @author Malatesta Davide
 */
public class Stats {

	public Stats() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Hashmap that return the minimum, maximum and average number of total teams.
	 * @return statMap
	 */
	public static HashMap<String, Integer> numberOfTeams() {
		int avgTeams;
		int minTeams;
		int maxTeams;
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
	
	/**
	 * Hashmap that return the saved seasons.
	 * @return statMap
	 */
	public static HashMap<String, Integer> savedSeasons() {
        int seasonsSA = 3;
        int seasonsPD = 3;
        int seasonsL1 = 3;
        int avgSeasons = (seasonsSA + seasonsPD + seasonsL1)/3;
   
    HashMap<String, Integer> statMap = new HashMap<String, Integer>();
    statMap.put("Stagioni salvate per la Serie A", seasonsSA);
    statMap.put("Stagioni salvate per la Primera Division", seasonsPD);   
    statMap.put("Stagioni salvate per la Ligue 1", seasonsL1);
    statMap.put("Media di stagioni salvate per competizione", avgSeasons);
    return statMap;
    }
	
	/**
	 * These functions calculate the duration in months and days of each competition of the 2020 season
	 * @return duration
	 */
	public Period getTimeSA() {
		LocalDate startDateSA = LocalDate.of(2020,9,20);
		LocalDate endDateSA = LocalDate.of(2021, 5, 23);
		Period periodSA = Period.between(startDateSA, endDateSA);
		return periodSA;	
	}
	
	public Period getTimePD() {
		LocalDate startDatePD = LocalDate.of(2020,9,13);
		LocalDate endDatePD = LocalDate.of(2021, 5, 23);
		Period periodPD = Period.between(startDatePD, endDatePD);	
		return periodPD;
	}
	
	public Period getTimeL1() {
		LocalDate startDateL1 = LocalDate.of(2020,8,22);
		LocalDate endDateL1 = LocalDate.of(2021, 5, 23);
		Period periodL1 = Period.between(startDateL1, endDateL1);
		return periodL1;
	}
	
	/**
	 * Hashmap that returns the average duration of seasons.
	 * @return statMap
	 */
	public static HashMap<String, Period> duration() {
		Stats dur = new Stats();
        Period periodSA = dur.getTimeSA();
        Period periodPD = dur.getTimePD();
        Period periodL1 = dur.getTimeL1();
   
    HashMap<String, Period> statMap = new HashMap<String, Period>();
    statMap.put("Durata della Serie A in mesi(M) e giorni(D)", periodSA );
    statMap.put("Durata della Primera division in mesi(M) e giorni(D)", periodPD );
    statMap.put("Durata della Legue 1 in mesi(M) e giorni(D)", periodL1 );
    return statMap;
    }

	/**
	 * //Hashmap that returns the points of SA in the 2020 season.
	 * @return statMap
	 */ 
	public static HashMap<String, float[]> avgPointsDaySA() {
	    DataBase d = new DataBase();
	    d.setPointsSA();

	    HashMap<String, float[]> statMap = new HashMap<String, float[]>();
	    statMap.put("Media dei punti/giornata Serie A ", d.getPointsSA());
	    statMap.put("Media dei punti/giornata Serie A considerando le partite in casa ", d.getPointsSAhome());
	    statMap.put("Media dei punti/giornata Serie A considerando le partite fuori casa ", d.getPointsSAaway());
	    return statMap;
	}
	
	/**
	 * //Hashmap that returns the points of PD in the 2020 season.
	 * @return statMap
	 */ 
	public static HashMap<String, float[]> avgPointsDayPD() {
	    DataBase d = new DataBase();
	    d.setPointsPD();

	    HashMap<String, float[]> statMap = new HashMap<String, float[]>();
	    statMap.put("Media dei punti/giornata Primera Division ", d.getPointsPD());
	    statMap.put("Media dei punti/giornata Primera Division considerando le partite in casa ", d.getPointsPDhome());
	    statMap.put("Media dei punti/giornata Primera Division considerando le partite fuori casa ", d.getPointsPDaway());
	    return statMap;
	}
	
	/**
	 * //Hashmap that returns the points of L1 in the 2020 season.
	 * @return statMap
	 */
	public static HashMap<String, float[]> avgPointsDayL1() {
	    DataBase d = new DataBase();
	    d.setPointsL1();

	    HashMap<String, float[]> statMap = new HashMap<String, float[]>();
	    statMap.put("Media dei punti/giornata Ligue 1 ", d.getPointsL1());
	    statMap.put("Media dei punti/giornata Ligue 1 considerando le partite in casa ", d.getPointsL1home());
	    statMap.put("Media dei punti/giornata Ligue 1 considerando le partite fuori casa ", d.getPointsL1away());
	    return statMap;
	}
	
	
}
