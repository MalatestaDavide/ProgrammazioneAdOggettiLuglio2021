package it.univpm.FootballApp.Model;

public class Matches {

	private int id;
	private Seasons season;
	private String winner;
	private String homeTeam;
	private String awayTeam;
	
	public Matches(int id, Seasons season, String winner, String homeTeam, String awayTeam) {
		super();
		this.id = id;
		this.season = season;
		this.winner = winner;
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
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	public String getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}
	public String getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
