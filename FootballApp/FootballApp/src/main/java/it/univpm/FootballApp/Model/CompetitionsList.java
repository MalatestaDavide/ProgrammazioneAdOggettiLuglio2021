package it.univpm.FootballApp.Model;

import java.util.List;

/**
 * Class model for Competition list
 * @author 
 */

public class CompetitionsList {

	public CompetitionsList() {
		// TODO Auto-generated constructor stub
	}

	//ATTRIBUT
		private String count;
		private List<Competitions> competitions;
		
		
		public CompetitionsList(String count, List<Competitions> competitions) {
			super();
			this.count = count;
			this.competitions = competitions;
		}

		//GET/SET
		public String getId() {
			return count;
		}

		public void setId(String id) {
			this.count = id;
		}

		public List<Competitions> getCompetitions() {
			return competitions;
		}

		public void setCompetitions(List<Competitions> competitions) {
			this.competitions = competitions;
		}

		//METHOD
		@Override
		public String toString() {
			return "CompetitionList [count=" + count + ", competitions=" + competitions + "]";
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
