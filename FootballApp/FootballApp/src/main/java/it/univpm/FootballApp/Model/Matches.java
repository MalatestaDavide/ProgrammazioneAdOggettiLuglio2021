package it.univpm.FootballApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class that contains match info.
 * @author Vascello Francesco Pio
 * @author Malatesta Davide
 */
public class Matches {
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("season")
	private Seasons season;
	@JsonProperty("score")
	private Score score;
	@JsonProperty("homeTeam")
	private homeTeam homeTeam;
	@JsonProperty("awayTeam")
	private awayTeam awayTeam;
	
	private nameTeams nameTeams;
	
	
	 public Matches() {
		// TODO Auto-generated constructor stub
	} 
	 
	 public Matches(Integer id, Seasons season, Score score, it.univpm.FootballApp.Model.homeTeam homeTeam,
				it.univpm.FootballApp.Model.awayTeam awayTeam, it.univpm.FootballApp.Model.nameTeams nameTeams) {
			super();
			this.id = id;
			this.season = season;
			this.score = score;
			this.homeTeam = homeTeam;
			this.awayTeam = awayTeam;
			this.nameTeams = nameTeams;
		}
	 
	//Get&Set
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Seasons getSeason() {
		return season;
	}
	public void setSeason(Seasons season) {
		this.season = season;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	public homeTeam getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(homeTeam homeTeam) {
		this.homeTeam = homeTeam;
	}
	public awayTeam getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(awayTeam awayTeam) {
		this.awayTeam = awayTeam;
	}
	
	public nameTeams getNameTeams() {
		return nameTeams;
	}

	public void setNameTeams(nameTeams nameTeams) {
		this.nameTeams = nameTeams;
	}	

	//ToString
	
	public String toString() { 
		String result;
		result = "id: \t" + this.getId() + "\n" +
				"season: \t" + this.getSeason() + "\n" +
				"score: \t" + this.getScore() + "\n" +
				"homeTeam: \t" + this.getHomeTeam() + "\n" +
				"awayTeam: \t" + this.getAwayTeam();
		return result;
	}
	
	
	
}
	
	