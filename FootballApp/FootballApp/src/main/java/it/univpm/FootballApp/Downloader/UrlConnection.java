package it.univpm.FootballApp.Downloader;


import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;
import java.net.HttpURLConnection;

import javax.net.ssl.HttpsURLConnection;

public class UrlConnection {
	
	/**
	 * dove richiedere url
	 */
	String url; 
	
	/**
	 * @see HttpURLConnection 
	 */
	HttpsURLConnection con;
	
	/**
	 * Costruttore classe
	 * @param url Url a cui effettuare la richiesta
	 * @throws IOException 
	 */

	public UrlConnection(String url) throws IOException {
		try {
			URL Url = new URL(url);
			this.con = (HttpsURLConnection) Url.openConnection();
			con.setRequestProperty("X-Auth-Token", "84a8d4919cf94969b065fcebc898e782");
			con.setRequestMethod("GET");
		} catch (MalformedURLException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (IllegalStateException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
