package it.univpm.FootballApp.Downloader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.UnknownHostException;

public class Data {

	public Data() {
		}	
	/** Dato un url API restituisce la risposta in una stringa
	 * @param url
	 * @return json
	 * @throws UHE
	 * @throws IO
	 */
	
		static public String download(String url) throws UnknownHostException, IOException {
			try {
				UrlConnection urlc = new UrlConnection(url);
				BufferedReader buffread = new BufferedReader(new InputStreamReader(urlc.connection.getInputStream()));
					String line = buffread.readLine();
					String json = "";
					while (line!=null) {
						json+=line;
						json+="\n";
						line = buffread.readLine();
					}
				buffread.close();
				urlc.connection.disconnect();
				return json;
			}
			catch (IOException e) {
				System.out.println(" URL INVALID");
				e.printStackTrace();
				return e.toString();
			}
		}
	}


