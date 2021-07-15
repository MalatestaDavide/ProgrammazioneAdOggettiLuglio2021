package it.univpm.FootballApp.Contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParser;

import it.univpm.FootballApp.Model.*;
import it.univpm.FootballApp.Service.*;

import it.univpm.FootballApp.Service.JsonToObj;


/**
 * The Controller class is the entry point of the library, it must be instance with your personal token obtained on the football-data.org website. 
 * @author Vascello Francesco Pio
 * @author Malatesta Davide
 */
@RestController

public class Controller {

	public Controller() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Get all competitions
	 * @return list of competitions
	 */
	
	@RequestMapping(value = "/competitions", method = RequestMethod.GET)
	public Competitions returnCompetitions(@RequestParam(name = "competitions", defaultValue = "" ) String competitions) {
		Competitions newCompetitions = new Competitions();
		try {
			newCompetitions = JsonParser.parseCompetitions(folderCompetition);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (Boolean.parseBoolean(competitions)) 
			{System.out.println(newCompetitions.toString());}	
		else
			{ System.out.println(newCompetitions.toString());}
		
		return newCompetitions;
	}
	
	/**
	 * Get Competition by Id
	 * @param IdCompetition
	 * @return Competition object
	 */
	@RequestMapping(value = "/competitions/{id}", method = RequestMethod.GET)
	public Competitions returnCompetitions(@RequestParam(name = "competitionsId", defaultValue = "" ) String competitions) {
		Competitions newCompetitions = new Competitions();
	
	/**
	 * Get team
	 * @param idTeam
	 * @return Team object
	 */
	public Teams getTeam(int idTeam) {
		JsonToObj<Teams> utilJson = new JsonToObj<Teams>();
		return utilJson.getObjectFromJson(URI + "teams/"+ idTeam, Teams.class);
	}
	
	/**
	 * Get matches from a competition
	 * @param idCompetition
	 * @return MatchListModel object
	 */
	public Matches getMatchesByCompetition(int id ) {
		JsonToObj<Matches> utilJson = new JsonToObj<Matches>();
		return utilJson.getObjectFromJson(URI + "competitions/"+ id + "/matches", Matches.class);
	}
	
	
	

	
}