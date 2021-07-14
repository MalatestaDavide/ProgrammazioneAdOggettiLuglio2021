package it.univpm.FootballApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Matches {
	@JsonProperty("id")
	private int id;
	@JsonProperty("season")
	private Seasons season;
	@JsonProperty("score")
	private Score score;
	@JsonProperty("homeTeam")
	private homeTeam homeTeam;
	@JsonProperty("awayTeam")
	private awayTeam awayTeam;
	
	public Matches(int id, Seasons season, Score score, it.univpm.FootballApp.Model.homeTeam homeTeam,
			it.univpm.FootballApp.Model.awayTeam awayTeam) {
		super();
		this.id = id;
		this.season = season;
		this.score = score;
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
	}
	public int getId() {
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
	
	