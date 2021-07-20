/* package it.univpm.FootballApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Prova {

	@JsonProperty("competitions")
	private Competitions competitions;
	@JsonProperty("matches")
	private ArrayList<Matches> matches;
	
	

	public Competitions getCompetitions() {
		return competitions;
	}

	public void setCompetitions(Competitions competitions) {
		this.competitions = competitions;
	}

	public Matches getMatches() {
		return matches;
	}

	public void setMatches(Matches matches) {
		this.matches = matches;
	}

	public Prova(Competitions competitions, Matches matches) {
		this.competitions = competitions;
		this.matches = matches;
	}

	public Prova() {
		
	}
	
	public String toString() { 
		String result;
		result = "competitions: \t" + this.getCompetitions() + "\n" +
				"matches: \t" + this.getMatches();
				return result;
	}

}
*/