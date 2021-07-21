package it.univpm.FootballApp.Downloader;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

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
		Competitions newCompetitions = new Competitions();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			newCompetitions = objectMapper.readValue(jsonObjPath, Competitions.class);
		} catch (JsonProcessingException e) {
			System.out.println("Error");
			e.printStackTrace();
		} 
		return newCompetitions;
	}
	

	/**
	 * Method that parse Matches
	 * @param jsonObjPath Folder object
	 * @throws IOException
	 */
	@JsonIgnoreProperties
	public static Matches parseMatches(String jsonObjPath) throws IOException{
		Matches matches= new Matches();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			matches = objectMapper.readValue(jsonObjPath, Matches.class);
		} catch (JsonProcessingException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		return matches;
	}
	
	/*@JsonIgnoreProperties
	 public static Prova parseprova(String jsonObjPath) throws IOException{
		Prova prova = new Prova();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			prova = objectMapper.readValue(jsonObjPath, Prova.class);
		} catch (JsonProcessingException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		return prova;
	}
	*/
}

