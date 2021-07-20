package it.univpm.FootballApp.Contoller;


import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParser;

import Exceptions.MissingCompetition;
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
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	/*
	@RequestMapping(value = "/competitions", method = RequestMethod.GET)
	@ResponseBody
	
	public String returnCompetitions() throws UnknownHostException, IOException{
		DataBase prova = new DataBase();
		String comp = prova.arrayListCompetitions().toString();
		return comp;
	} */
	
	@RequestMapping(value = "/competitions", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Object> getCompetitions() throws IOException {
		DataBase data = new DataBase();
		return new ResponseEntity<>(data.arrayListCompetitions().toString(), HttpStatus.OK);
	} 
	/**
	 * Get a single competition 
	 * @param IdCompetition
	 * @return Competition object
	 */
	/* @RequestMapping(value = "/singleC", method = RequestMethod.GET)
	public singleCompetition returnSingleCompetition(@RequestParam(name = "singleC", defaultValue = "" ) String singleC) {
		singleCompetition newsSingleCompetition = new singleCompetition();
	return newsSingleCompetition;
	}
	
	*/
	

	
}