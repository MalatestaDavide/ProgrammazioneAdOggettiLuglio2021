package it.univpm.FootballApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Prova {

	@JsonProperty("competitions")
	private Competitions competitions;
	@JsonProperty("matches")
	private Matches matches;
	public Matches getMacthes() {
		return matches;
	}

	public void setMacthes(Matches macthes) {
		this.matches = macthes;
	}

	public Competitions getCompetitions() {
		return competitions;
	}

	public void setCompetitions(Competitions competitions) {
		this.competitions = competitions;
	}

	public Prova(Competitions competitions, Matches matches) {
		this.competitions = competitions;
		this.matches = matches;
	}

	public Prova() {
		
	}
	public String toString() { 
		String string = "";
		string = this.matches.toString();
		return string;
	}

}
