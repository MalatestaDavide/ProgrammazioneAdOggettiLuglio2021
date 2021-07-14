package it.univpm.FootballApp.Contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.univpm.FootballApp.Model.*;

import it.univpm.FootballApp.Service.JsonToObj;


/**
 * The Contr class is the entry point of the library, it must be instance with your personal token obtained on the football-data.org website. 
 * @author 
 */
@RestController

public class Contr {

	public Contr() {
		// TODO Auto-generated constructor stub
	}
	
	public static String TOKEN;
	private static final String URI = "https://api.football-data.org/v2/";
	
	
	@SuppressWarnings("static-access")
	/**
	 * JfdataManager constructor
	 * @param Personnal token
	 */
	public Contr(String token) {
		super();
		this.TOKEN = token;
	}
	
	/**
	 * Get all competitions
	 * @return CompetitionListModel who contains list of CompetitionModel
	 */
	@RequestMapping(value = "/competitions", method = RequestMethod.GET)
	public CompetitionsList getAllCompetitions() {
		Contr contr = new Contr("84a8d4919cf94969b065fcebc898e782");
		CompetitionsList actual = contr.getAllCompetitions();
		JsonToObj<CompetitionsList> jsonToObj = new JsonToObj<CompetitionsList>();
		return jsonToObj.getObjectFromJson(URI + "competitions/", CompetitionsList.class);
	}
	
	/**
	 * Get Competition by Id
	 * @param IdCompetition
	 * @return Competition object
	 */
	public Competitions getCompetition(int id) {
		JsonToObj<Competitions> jsonToObj = new JsonToObj<Competitions>();
		return jsonToObj.getObjectFromJson(URI + "competitions/" + id, Competitions.class);
	}
	
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