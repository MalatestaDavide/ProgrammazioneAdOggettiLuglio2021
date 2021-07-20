package it.univpm.FootballApp.Downloader;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.UnknownHostException;

/**
 * Class that downloads data to a string
 * @author Vascello Francesco Pio
 * @author Malatesta Davide
 */
public class Downloader {

	public Downloader() {
		}	
	/** 
	 * @param url
	 * @return json
	 * @throws UHE
	 * @throws IO
	 */	
	static public String download(String url) throws UnknownHostException, IOException {
			try {
				Url urlcon = new Url(url);
				BufferedReader buffread = new BufferedReader(new InputStreamReader(urlcon.connection.getInputStream()));
					String line = buffread.readLine();
					String json = "";
					while (line!=null) {

						json+=line; json+="\n";
						line = buffread.readLine();

					}
				buffread.close();
				urlcon.connection.disconnect();
				return json;
			}
			catch (IOException e) {
				System.out.println("Invalid Url");
				e.printStackTrace();
				return e.toString();
			}
		}
	}


