package Exceptions;

import java.io.IOException;

/**
 * Exception that manage the wrong writing of the season or the case of an inexistent season
 */
public class MissingCompetition extends IOException {

	private static final long serialVersionUID = 1L;
	
	
	public MissingCompetition() {
		super();
	}

	/**
	 * Another constructor
	 * @param message Message to visualize
	 */
	public MissingCompetition(String message){
		super(message + " the name is incorrect");
	}
}