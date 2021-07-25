package it.univpm.FootballApp.Contoller;


import java.io.IOException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import it.univpm.FootballApp.Downloader.*;
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
	@RequestMapping(value = "/competitionSA", method = RequestMethod.GET)
	@ResponseBody
	
	public ResponseEntity<Object> getCompetitionSA() throws IOException {
	   DataBase data = new DataBase();
	   return new ResponseEntity<Object>(data.competitionSA(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/competitionL1", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Object> getCompetitionsL1() throws IOException {
	   DataBase data = new DataBase();
	   return new ResponseEntity<Object>(data.competitionL1(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/competitionPD", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Object> getCompetitionPD() throws IOException {
	   DataBase data = new DataBase();
	   return new ResponseEntity<Object>(data.competitionPD(), HttpStatus.OK);
	}
	
	/**
	 * Get list of matches for each competition
	 * @return list of matches
	 * @throws IOException
	 */
	@RequestMapping(value = "/matchesSA2020", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Object> getmatchesSA2020() throws IOException {
	   DataBase data = new DataBase();
	   return new ResponseEntity<Object>(data.matchesSA(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/matchesPD2020", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Object> getmatchesPD2020() throws IOException {
	   DataBase data = new DataBase();
	   return new ResponseEntity<Object>(data.matchesPD(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/matchesL12020", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Object> getmatchesL12020() throws IOException {
	   DataBase data = new DataBase();
	   return new ResponseEntity<Object>(data.matchesL1(), HttpStatus.OK);
	}
	
	/**
	 * Get number of teams of all Competitions.
	 * @param numberOfTeams
	 */
	 @RequestMapping(value = "/numberOfTeams", method = RequestMethod.GET)
	 @ResponseBody
	  public ResponseEntity<Object> getnumberOfTeams() throws IOException {
	     return new ResponseEntity<Object>(Stats.numberOfTeams(), HttpStatus.OK);
	 }
	 
	 /**
	  * Get saved Seasons for all Competitions.
	  * @param savedSeasons
	  */
	 @RequestMapping(value = "/savedSeasons", method = RequestMethod.GET)
	 @ResponseBody
	  public ResponseEntity<Object> getSavedSeasons() throws IOException {
	     return new ResponseEntity<Object>(Stats.savedSeasons(), HttpStatus.OK);
	 } 
	 
	 /**
	  * Get saved Seasons for all Competitions.
	  * @param duration
	  */
	 @RequestMapping(value = "/duration", method = RequestMethod.GET)
	 @ResponseBody
	  public ResponseEntity<Object> getduration() throws IOException {
	     return new ResponseEntity<Object>(Stats.duration(), HttpStatus.OK);
	 } 
	 
	 /**
	  * Get average points/day for each competition
	  * @param avgPoints
	  */
	 @RequestMapping(value = "/avgPointsSA", method = RequestMethod.GET)
	 @ResponseBody
	  public ResponseEntity<Object> getAvgPointsSA() throws IOException {
	     return new ResponseEntity<Object>(Stats.avgPointsDaySA(), HttpStatus.OK);
	 }
	 
	 @RequestMapping(value = "/avgPointsPD", method = RequestMethod.GET)
	 @ResponseBody
	  public ResponseEntity<Object> getAvgPointsPD() throws IOException {
	     return new ResponseEntity<Object>(Stats.avgPointsDayPD(), HttpStatus.OK);
	 }
	 
	 @RequestMapping(value = "/avgPointsL1", method = RequestMethod.GET)
	 @ResponseBody
	  public ResponseEntity<Object> getAvgPointsL1() throws IOException {
	     return new ResponseEntity<Object>(Stats.avgPointsDayL1(), HttpStatus.OK);
	 }
}

	