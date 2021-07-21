package it.univpm.FootballApp.Service;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonParser;

import it.univpm.FootballApp.Downloader.Parsing;
import it.univpm.FootballApp.Model.Competitions;
import it.univpm.FootballApp.Downloader.DataBase;
import it.univpm.FootballApp.Downloader.Downloader;
public class Filters {

	public Filters() {
		// TODO Auto-generated constructor stub
	}
public static String singleCompetition (String nameCompetition ) throws IOException {
	String result = Downloader.download("https://api.football-data.org/v2/competitions");
	Competitions newCompetitions = Parsing.parseCompetitions(result);
	//int id = newCompetitions.getId(nameCompetition);
	
	//String result1 = Downloader.download("https://api.football-data.org/v2/competitions" + id);
	return newCompetitions.toString();
	
}
}
