package it.univpm.FootballApp.Downloader;

import org.springframework.context.annotation.EnableLoadTimeWeaving;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UrlConnection url=new UrlConnection();
		url.Download(2019, 2018);
		
	}

}
