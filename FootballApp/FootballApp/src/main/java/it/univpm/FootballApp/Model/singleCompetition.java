package it.univpm.FootballApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class give the informations of a single competitions of all competitions.
 * @author Vascello Francesco Pio
 * @author Malatesta Davide
 *
 */
public class singleCompetition extends Competitions {

	public singleCompetition() {
		// TODO Auto-generated constructor stub
	}
	
	@JsonProperty("competition")
	private Competitions competition;
	@JsonProperty("season")
	private Seasons season;

	
	//Get&Set
	
	public Competitions getCompetition() {
		return competition;
	}


	public void setCompetition(Competitions competition) {
		this.competition = competition;
	}


	public Seasons getSeason() {
		return season;
	}


	public void setSeason(Seasons season) {
		this.season = season;
	}		
	
	//ToString
	
	public String toString() { 
		String result;
		result = "competition: \t" + this.getCompetition() + "\n" +
				"season: \t" + this.getSeason() ;
		return result;
	}

}
