package it.univpm.FootballApp;

import java.io.FileNotFoundException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.univpm.FootballApp.Downloader.DataBase;

@SpringBootApplication
public class FootballAppApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(FootballAppApplication.class, args);
	}
}