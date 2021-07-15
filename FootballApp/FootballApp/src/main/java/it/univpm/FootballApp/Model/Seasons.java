package it.univpm.FootballApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Seasons {
	@JsonProperty("id")
	private int id;
	@JsonProperty("startDate")
	private String startDate;
	@JsonProperty("endDate")
	private String endDate;
	@JsonProperty("currentMatchDay")
	private int currentMatchday;
	@JsonProperty("winner")
	private Score winner;
	
	
//Constructor
	
	public Seasons(int id, String startDate, String endDate, int currentMatchday, Score winner) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.currentMatchday = currentMatchday;
		this.winner = winner;
	}

//Get&Set


	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getStartDate() {
		return startDate;
	}




	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}




	public String getEndDate() {
		return endDate;
	}




	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}




	public int getCurrentMatchday() {
		return currentMatchday;
	}




	public void setCurrentMatchday(int currentMatchday) {
		this.currentMatchday = currentMatchday;
	}




	public Score getWinner() {
		return winner;
	}




	public void setWinner(Score winner) {
		this.winner = winner;
	}


//ToString

	public String toString() { 
		String result;
		result = "id: \t" + this.getId() + "\n" +
				"startDate: \t" + this.getStartDate() + "\n" +
				"endDate: \t" + this.getEndDate() + "\n" +
				"winner: \t" + this.getWinner() + "\n";
		return result;
	}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
