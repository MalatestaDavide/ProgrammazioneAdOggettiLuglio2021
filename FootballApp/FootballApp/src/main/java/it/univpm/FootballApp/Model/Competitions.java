package it.univpm.FootballApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Competitions {

	@JsonProperty("id")
	private int id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("area")
	private Areas area;
	@JsonProperty("numberOfAvailableSeasons")
	private int numberOfAvailableSeasons;
	@JsonProperty("currentSeason")
	private String currentSeason;
	
	
	
	public Competitions(int id, String name, Areas area, int numberOfAvailableSeasons, String currentSeason) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
		this.numberOfAvailableSeasons = numberOfAvailableSeasons;
		this.currentSeason = currentSeason;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Areas getArea() {
		return area;
	}



	public void setArea(Areas area) {
		this.area = area;
	}



	public int getNumberOfAvailableSeasons() {
		return numberOfAvailableSeasons;
	}



	public void setNumberOfAvailableSeasons(int numberOfAvailableSeasons) {
		this.numberOfAvailableSeasons = numberOfAvailableSeasons;
	}



	public String getCurrentSeason() {
		return currentSeason;
	}



	public void setCurrentSeason(String currentSeason) {
		this.currentSeason = currentSeason;
	}



	public String toString() { 
		String result;
		result = "id: \t" + this.getId() + "\n" +
				"name: \t" + this.getName() + "\n" +
				"area: \t" + this.getArea() + "\n" +
				"currentSeason: \t" + this.getCurrentSeason() + "\n" +
				"numberOfAvailableSeasons: \t" + this.getNumberOfAvailableSeasons() + "\n";
		return result;
	}		
				
}
