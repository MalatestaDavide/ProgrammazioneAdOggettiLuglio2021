package it.univpm.FootballApp.Downloader;


import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;

import javax.net.ssl.HttpsURLConnection;
import javax.print.attribute.PrintJobAttribute;

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
	 */

	public UrlConnection(String url) {
		try {
			URL Url = new URL(url);
			this.con = (HttpURLConnection) Url.openConnection();
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
