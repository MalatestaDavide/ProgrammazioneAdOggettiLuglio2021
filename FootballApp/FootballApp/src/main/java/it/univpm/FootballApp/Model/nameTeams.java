package it.univpm.FootballApp.Model;

import ch.qos.logback.core.joran.conditional.IfAction;

/**
 * This class give the names of all teams.
 * @author Vascello Francesco Pio
 * @author Malatesta Davide
 *
 */
public class nameTeams {
	
		public static boolean isNationality(String name) {
			for(String i : names) {
				if (i.equals(name)) return true;
			}
			return false;
		}
		public static String[] names = new String[]{"AC Milan", "ACF Fiorentina", "AS Roma", "Atalanta BC",
				"Bologna FC 1909", "Cagliari Calcio", "Genoa CFC", "FC Internazionale Milano", "Juventus FC", "SS Lazio", "Parma Calcio 1913",
				"SSC Napoli", "Udinese Calcio", "Hellas Verona FC", "US Sassuolo Calcio",
				 "FC Crotone", "Spezia Calcio", "UC Sampdoria", "Torino FC", "Benevento Calcio"};
	}