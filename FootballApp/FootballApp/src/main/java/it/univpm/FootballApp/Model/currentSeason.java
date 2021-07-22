package it.univpm.FootballApp.Model;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.Period;

import com.fasterxml.jackson.annotation.JsonProperty;

public class currentSeason {

	public currentSeason() {
		// TODO Auto-generated constructor stub
	}
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("startDate")
	private String startDate;
	@JsonProperty("endDate")
	private String endDate;
	@JsonProperty("currentMatchDay")
	private int currentMatchday;
	
	
	//Constructor
	public currentSeason(Integer id, String startDate, String endDate, int currentMatchday) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.currentMatchday = currentMatchday;
	}
	//Get&Set
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getCurrentMatchday() {
		return currentMatchday;
	}
	public void setCurrentMatchday(int currentMatchday) {
		this.currentMatchday = currentMatchday;
	}
	
	//ToString
	
	public String toString() { 
		String result;
		result = "id: \t" + this.getId() + "\n" +
				"        startDate: \t" + this.getStartDate() + "\n" +
				"        endDate: \t" + this.getEndDate() + "\n";
		return result;
	}
	
	public Period getTimeSA() {
		LocalDate startDateSA = LocalDate.of(2020,9,20);
		LocalDate endDateSA = LocalDate.of(2021, 5, 23);
		Period periodSA = Period.between(startDateSA, endDateSA);
		return periodSA;	
	}
	
	public Period getTimePD() {
		LocalDate startDatePD = LocalDate.of(2020,9,13);
		LocalDate endDatePD = LocalDate.of(2021, 5, 23);
		Period periodPD = Period.between(startDatePD, endDatePD);	
		return periodPD;
	}
	
	public Period getTimeL1() {
		LocalDate startDateL1 = LocalDate.of(2020,8,22);
		LocalDate endDateL1 = LocalDate.of(2021, 5, 23);
		Period periodL1 = Period.between(startDateL1, endDateL1);
		return periodL1;
	}
}
