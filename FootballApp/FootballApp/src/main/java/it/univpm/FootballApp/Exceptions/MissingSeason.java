package it.univpm.FootballApp.Exceptions;

import java.io.IOException;

/**
 * Exception that manage the wrong writing of the competition or the case of an inexistent competition
 */
public class MissingSeason extends IOException {

	private static final long serialVersionUID = 1L;
	
	
	public MissingSeason() {
		super();
	}

	/**
	 * Another constructor
	 * @param message Message to visualize
	 */
	public MissingSeason(String message){
		super(message + " the name is incorrect");
	}
}
