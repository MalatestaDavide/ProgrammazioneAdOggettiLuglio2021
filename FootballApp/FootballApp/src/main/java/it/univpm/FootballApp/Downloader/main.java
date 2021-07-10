package it.univpm.FootballApp.Downloader;

import org.springframework.context.annotation.EnableLoadTimeWeaving;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Downloader dow= new Downloader();
		dow.toDownload(2019, 2018);
		
	}

}
