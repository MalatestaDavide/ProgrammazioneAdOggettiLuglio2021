package it.univpm.FootballApp.Downloader;


import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;

import javax.net.ssl.HttpsURLConnection;

/**
 * Class that manages the connection with the API url and authentication with the token
 * @author Vascello Francesco Pio
 * @author Malatesta Davide
 */
public class Url {
	
	String url; 
	HttpsURLConnection connection;
	
	/**
	 * @param url 
	 * @throws IOException 
	 */

	public Url(String url) throws IOException {
		try {
			URL Url = new URL(url);
			this.connection = (HttpsURLConnection) Url.openConnection();
			connection.setRequestProperty("X-Auth-Token", "84a8d4919cf94969b065fcebc898e782");
			connection.setRequestMethod("GET");
		} catch (MalformedURLException e) {
			System.out.println(e);
			e.printStackTrace();
		} catch (IllegalStateException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
