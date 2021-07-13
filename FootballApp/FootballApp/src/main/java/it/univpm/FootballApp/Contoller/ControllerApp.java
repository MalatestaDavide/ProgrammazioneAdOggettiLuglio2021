package it.univpm.FootballApp.Contoller;


import java.io.IOException;
import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.univpm.FootballApp.Model.Areas;
import it.univpm.FootballApp.Model.Competitions;
import it.univpm.FootballApp.Model.Matches;
import it.univpm.FootballApp.Model.Seasons;
import it.univpm.FootballApp.Model.Teams;


/**
* Class that manages all the requests the user can makes to the server.
* 
* @author Vascello Francesco Pio
* @author Malatesta Davide
*/

@RestController
public class ControllerApp {
	

	@GetMapping("/areas")
    public ResponseEntity<List<Areas>> listAllAreas() {
        return new ResponseEntity<List<Areas>>(listAllAreas.getAll(), HttpStatus.OK);
        }
	
	
	@GetMapping("/competition")
	public ResponseEntity<List<Competitions>> listAllCompetitions() {
		List<Competitions> entitiesList = entityService.findAll();
		return new ResponseEntity<List<AreaEntity>>(entitiesList, HttpStatus.OK);
	}
	
	
	@GetMapping("/competitions/{id}")
	public ResponseEntity<?> getArea(@PathVariable("id") long id) {
		logger.info("Fetching AreaEntity with id {}", id);
		return new ResponseEntity<Object>(id, HttpStatus.OK);
		
	}
	
	
	@GetMapping("/competitions/{id}/matches")
	public ResponseEntity<List<Competitions>> listAllCompetitions() {
		List<Competitions> entitiesList = entityService.findAll();
		return new ResponseEntity<List<AreaEntity>>(entitiesList, HttpStatus.OK)
		
	}
	
	@GetMapping("/competitions/{id}/matches/?season={startDate}")
	public ResponseEntity<List<Competitions>> listAllCompetitions() {
		List<Competitions> entitiesList = entityService.findAll();
		return new ResponseEntity<List<AreaEntity>>(entitiesList, HttpStatus.OK)
		
	}
	
	
	@GetMapping("/teams")
    public ResponseEntity<List<Teams>> listAllAreas() {
        return new ResponseEntity<List<Areas>>(listAllAreas.getAll(), HttpStatus.OK);
        }
	
	
	@GetMapping("/teams/{id}")
    public ResponseEntity<List<Teams>> listAllAreas() {
        return new ResponseEntity<List<Areas>>(listAllAreas.getAll(), HttpStatus.OK);
        }


}


