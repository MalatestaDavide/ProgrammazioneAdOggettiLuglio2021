package it.univpm.FootballApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Score {
	@JsonProperty("winner")
	private String winner;

	public Score(String winner) {
		super();
		this.winner = winner;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}
	public String toString() { 
		String result;
		result = "winner: \t" + this.getWinner() + "\n";		
		return result;
	}		
}