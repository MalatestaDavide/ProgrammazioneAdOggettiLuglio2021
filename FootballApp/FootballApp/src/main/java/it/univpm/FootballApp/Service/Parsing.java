package it.univpm.FootballApp.Service;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import it.univpm.FootballApp.Model.Areas;
import it.univpm.FootballApp.Model.Competitions;
import it.univpm.FootballApp.Model.Matches;

/**
 * Class that convert json to object
 * @author Vascello Francesco Pio
 * @author Malatesta Davide
 */
public class Parsing {
	/**
	 * Method that parse Competitions
	 * @param jsonObjPath Folder object
	 * @throws IOException error of IO
	 */
	@JsonIgnoreProperties
	public static Competitions parseCompetitions(String jsonObjPath) throws IOException{
		String jsonObj = File.toString(jsonObjPath);
		Competitions newCompetitions = new Competitions();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			newCompetitions = objectMapper.readValue(jsonObj, Competitions.class);
		} catch (JsonProcessingException e) {
			System.out.println(" Error ");
			e.printStackTrace();
		} 
		return newCompetitions;
	}
	

	/**
	 * Method that convert json to object
	 * @param jsonObjPath Folder object
	 * @throws IOException error IO
	 */
	@JsonIgnoreProperties
	public static Matches parseMatches(String jsonObjPath) throws IOException{
		String jsonObj = File.toString(jsonObjPath);
		Matches newMatches = new Matches();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			newMatches = objectMapper.readValue(jsonObj, Matches.class);
		} catch (JsonProcessingException e) {
			System.out.println("Error ");
			e.printStackTrace();
		}
		return newMatches;
	}

	
	
}
