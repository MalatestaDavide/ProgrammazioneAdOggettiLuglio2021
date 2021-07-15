package it.univpm.FootballApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class that contains the info of the all Comptitions.
 * @author Vascello Francesco Pio
 * @author Malatesta Davide
 */
public class Competitions {

	@JsonProperty("id")
	private int id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("area")
	private Areas area;
	@JsonProperty("numberOfAvailableSeasons")
	private String numberOfAvailableSeason;
	
	
	public Competitions() {
		// TODO Auto-generated constructor stub
	}


	public Competitions(int id, String name, Areas area, String numberOfAvailableSeason) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
		this.numberOfAvailableSeason = numberOfAvailableSeason;
	}

//Get&Set
	
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

//ToString
	
	public String getNumberOfAvailableSeason() {
		return numberOfAvailableSeason;
	}



	public void setNumberOfAvailableSeason(String numberOfAvailableSeason) {
		this.numberOfAvailableSeason = numberOfAvailableSeason;
	}



	public String toString() { 
		String result;
		result = "id: \t" + this.getId() + "\n" +
				"name: \t" + this.getName() + "\n" +
				"area: \t" + this.getArea() + "\n" +
				"numberOfAvailableSeasons: \t" + this.getNumberOfAvailableSeason() ;
				return result;
	}		
				
}
