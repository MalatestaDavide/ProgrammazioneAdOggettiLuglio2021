package it.univpm.FootballApp.Model;

public class Competitions {

	public Competitions() {
		// TODO Auto-generated constructor stub
	}

	private int id;
	private String name;
	private Areas area;
	private Seasons season;
	private int numberOfAvailableSeasons;
	
	public Competitions(int id, String name, Areas area, Seasons season, int numberOfAvailableSeasons) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
		this.season = season;
		this.numberOfAvailableSeasons = numberOfAvailableSeasons;
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
	public Seasons getSeason() {
		return season;
	}
	public void setSeason(Seasons season) {
		this.season = season;
	}
	public int getNumberOfAvailableSeasons() {
		return numberOfAvailableSeasons;
	}
	public void setNumberOfAvailableSeasons(int numberOfAvailableSeasons) {
		this.numberOfAvailableSeasons = numberOfAvailableSeasons;
	}
	
	
}
