package it.univpm.FootballApp.Service;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import it.univpm.FootballApp.Model.Areas;

/**
 * Classe che descrive la conversione da Json in ogetto
 * @author Vascello Francesco Pio
 * @author Malatesta Davide
 */
public class Parsing {
	/**
	 * Metodo che a partire dal percorso di un file json ne ritorna un oggetto parsato League
	 * @param jsonObjPath Directory del file da parsare
	 * @return newLeague Oggetto parsato
	 * @throws IOException se accadono errori di I/O
	 */
	@JsonIgnoreProperties
	public static Areas parseAreas(String jsonObjPath) throws IOException{
		String jsonObj = File.toString(jsonObjPath);
		Areas newAreas = new Areas();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			newAreas = objectMapper.readValue(jsonObj, Areas.class);
		} catch (JsonProcessingException e) {
			System.out.println("Error while mapping the json file to a League object\n");
			e.printStackTrace();
		} 
		return newAreas;
	}
	

	/**
	 * Metodo che a partire dal percorso di un file json ne ritorna un oggetto parsato Team
	 * @param jsonObjPath Directory del file da parsare
	 * @return newTeam Oggetto parsato
	 * @throws IOException se accadono errori di I/O
	 */
	@JsonIgnoreProperties
	public static Tea parseTeam(String jsonObjPath) throws IOException{
		// JSONObject json = new JSONObject(jsonObj);
		String jsonObj = FileInputOutput.toString(jsonObjPath);
		Team newTeam = new Team();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			newTeam = objectMapper.readValue(jsonObj, Team.class);
		} catch (JsonProcessingException e) {
			System.out.println("Error while mapping the json file to a Team object\n");
			e.printStackTrace();
		}
		return newTeam;
	}

	/**
	 * Metodo che a partire dal percorso di un file json ne ritorna un oggetto parsato Scorers
	 * @param jsonObjPath Directory del file da parsare
	 * @return Scorers Oggetto parsato
	 * @throws IOException se accadono errori di I/O
	 */
	@JsonIgnoreProperties
	public static Scorers parseScorers(String jsonObjPath) throws IOException{
		String jsonObj = FileInputOutput.toString(jsonObjPath);
		Scorers scorers = new Scorers();
		try {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		scorers = objectMapper.readValue(jsonObj, Scorers.class);
		} catch (JsonProcessingException e) {
			System.out.println("Error while mapping the json file to a Scorers object\n");
			e.printStackTrace();
		}
		return scorers;
	}
	
	}
