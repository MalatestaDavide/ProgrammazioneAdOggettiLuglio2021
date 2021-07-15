package it.univpm.FootballApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class that contains information about the winner of the match.
 * @author Vascello Francesco Pio
 * @author Malatesta Davide
 */
public class Score {
	@JsonProperty("winner")
	private String winner;

	public Score(String winner) {
		super();
		this.winner = winner;
	}

	//Get&Set
	
	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}
	
	//ToString
	
	public String toString() { 
		String result;
		result = "winner: \t" + this.getWinner() + "\n";		
		return result;
	}		
}