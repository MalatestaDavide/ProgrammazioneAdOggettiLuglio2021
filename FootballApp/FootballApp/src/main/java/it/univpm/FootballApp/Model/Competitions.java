package it.univpm.FootballApp.Model;

import static org.hamcrest.CoreMatchers.nullValue;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class that contains the info of the all Comptitions.
 * @author Vascello Francesco Pio
 * @author Malatesta Davide
 */
public class Competitions {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("area")
	private Areas area;
	@JsonProperty("currentSeason")
	private currentSeason currentSeason;


	public Competitions() {
		// TODO Auto-generated constructor stub
	}

	public Competitions(Integer id, String name, Areas area, it.univpm.FootballApp.Model.currentSeason currentSeason) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
		this.currentSeason = currentSeason;
	}

//Get&Set

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public currentSeason getCurrentSeason() {
		return currentSeason;
	}

	public void setCurrentSeason(currentSeason currentSeason) {
		this.currentSeason = currentSeason;
	}

	//ToString
	
	public String toString() { 
		String result;
		result = "id: \t" + this.getId() + "\n" +
				"name: \t" + this.getName() + "\n" +
				"area: [\n \t" + this.getArea() + "       ]\n" +
				"season: [\n \t" + this.getCurrentSeason() + "       ]\n" ;
				return result;
	}
}
