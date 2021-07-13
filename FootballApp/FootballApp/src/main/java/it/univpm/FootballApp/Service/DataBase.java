package it.univpm.FootballApp.Service;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import it.univpm.FootballApp.Downloader.*;

public class DataBase {
	    public static ArrayList<String> buffer() {
	    	
	    	ArrayList<String> data = new ArrayList<String>();
	    	
	    for (int i = 2015; i < 2020; i+=2 ) {
	    	for (int j=2018; j<2021;j++) {
	    	 try {
				data.add(Data.download("https://api.football-data.org/v2/competitions/"+ i +"/matches/?season=" + j ));
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        }
	    }
		return data;
	    }
}