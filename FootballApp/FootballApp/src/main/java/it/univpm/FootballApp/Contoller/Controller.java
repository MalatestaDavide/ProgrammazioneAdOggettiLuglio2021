package it.univpm.FootballApp.Contoller;


import java.io.IOException;
import java.util.List;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParser;

import it.univpm.FootballApp.Model.*;
import it.univpm.FootballApp.Service.*;
import it.univpm.FootballApp.Downloader.*;


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
	 */
	
	@RequestMapping(value = "/competitions", method = RequestMethod.GET)
	public Competitions returnCompetitions(@RequestParam(name = "competitions", defaultValue = "" ) String competitions) {
		Competitions newCompetitions = new Competitions();
		try {
			newCompetitions = Parsing.parseCompetitions(folderCompetitions);
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
	 * Get a single competition 
	 * @param IdCompetition
	 * @return Competition object
	 */
	@RequestMapping(value = "/singleC", method = RequestMethod.GET)
	public singleCompetition returnSingleCompetition(@RequestParam(name = "singleC", defaultValue = "" ) String singleC) {
		singleCompetition newsSingleCompetition = new singleCompetition();
	return newsSingleCompetition;
	}
	
	
	
	

	
}