package it.univpm.FootballApp.Contoller;


import java.io.IOException;
import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import it.univpm.FootballApp.Downloader.*;
import it.univpm.FootballApp.Model.Teams;
import it.univpm.FootballApp.Service.Stats;


/**
 * The Controller class is the entry point of the library, it must be instance with your personal token obtained on the football-data.org website. 
 * @author Vascello Francesco Pio
 * @author Malatesta Davide
 */
@RestController
public class Controller  {

	public Controller() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Get all competitions
	 * @return list of competitions
	 * @throws IOException 
	 */
	@RequestMapping(value = "/competitions", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Object> getCompetitions() throws IOException {
		DataBase data = new DataBase();
		return new ResponseEntity<>(data.arrayListCompetitions(), HttpStatus.OK);
	} 
	
	/**
	 * Get a single competition 
	 * @param IdCompetition
	 * @return Competition object
	 */
	@RequestMapping(value = "/competitions/SA", method = RequestMethod.GET)
	@ResponseBody
	
	public ResponseEntity<Object> getCompetitionsSA() throws IOException {
	   DataBase data = new DataBase();
	   return new ResponseEntity<Object>(data.competitionsSA(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/competitions/L1", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Object> getCompetitionsL1() throws IOException {
	   DataBase data = new DataBase();
	   return new ResponseEntity<Object>(data.competitionsL1(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/competitions/PD", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Object> getCompetitionsPD() throws IOException {
	   DataBase data = new DataBase();
	   return new ResponseEntity<Object>(data.competitionsPD(), HttpStatus.OK);
	}
	
	/**
	 * Get matches of a single competition 
	 * @param IdCompetition
	 * @return Competition object
	 */
	@RequestMapping(value = "/matches/SA", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Object> getMatchesSA() throws IOException {
	   DataBase data = new DataBase();
	   return new ResponseEntity<Object>(data.matchesSA(), HttpStatus.OK);
	 }
	 
	 @RequestMapping(value = "/matches/PD", method = RequestMethod.GET)
	 @ResponseBody
	  public ResponseEntity<Object> getMatchesPD() throws IOException {
	     DataBase data = new DataBase();
	     return new ResponseEntity<Object>(data.matchesPD(), HttpStatus.OK);
	 }
	 
	 @RequestMapping(value = "/matches/L1", method = RequestMethod.GET)
	 @ResponseBody
	  public ResponseEntity<Object> getMatchesL1() throws IOException {
	     DataBase data = new DataBase();
	     return new ResponseEntity<Object>(data.matchesL1(), HttpStatus.OK);
	 }
	 
	 @RequestMapping(value = "/matches/stats", method = RequestMethod.GET)
	 @ResponseBody
	  public ResponseEntity<Object> getStats() throws IOException {
	     return new ResponseEntity<Object>(Stats.stats(), HttpStatus.OK);
	 }
}

	