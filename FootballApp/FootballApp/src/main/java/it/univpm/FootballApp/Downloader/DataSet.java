package it.univpm.FootballApp.Downloader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.UnknownHostException;

public class DataSet {

	public DataSet() {
		// TODO Auto-generated constructor stub
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
				BufferedReader in = new BufferedReader(new InputStreamReader(urlc.con.getInputStream()));
					String line = in.readLine();
					String json = "";
					while (line!=null) {
						json+=line;
						json+="\n";
						line = in.readLine();
					}
				in.close();
				urlc.con.disconnect();
				return json;
			}
			catch (IOException e) {
				System.out.println(" URL INVALID");
				e.printStackTrace();
				return e.toString();
			}
		}
	}


