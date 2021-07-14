package it.univpm.FootballApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class awayTeam {
	@JsonProperty("id")
	private int id;
	@JsonProperty("name")
	private String name;
	
	public awayTeam(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public String toString() { 
		String result;
		result = "id: \t" + this.getId() + "\n" +
				"name: \t" + this.getName() + "\n";
		return result;
	}		
}

