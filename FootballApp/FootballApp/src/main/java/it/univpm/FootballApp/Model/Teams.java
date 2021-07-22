package it.univpm.FootballApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class that contains info of the teams.
 * @author Vascello Francesco Pio
 * @author Malatesta Davide
 */

public class Teams  {
	@JsonProperty("id")
	private int id;
	@JsonProperty("name")
	private String name;
	
	public Teams(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	//ToString
	
	public String toString() { 
		String result;
		result = "id: \t" + this.getId() + "\n" +
				"name: \t" + this.getName() + "\n";
		return result;
	}
}