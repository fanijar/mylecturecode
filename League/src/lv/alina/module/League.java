package lv.alina.module;

import java.util.ArrayList;

public class League {
	private String nameOfLeague = "";
	private ArrayList<Teams> nameOfTeams;

	public League(String leagueName) {
		this.nameOfLeague = leagueName;
		this.nameOfTeams = new ArrayList<>();
	}

	public String getNameOfLeague() {
		return nameOfLeague;
	}

	public void setNameOfLeague(String nameOfLeague) {
		this.nameOfLeague = nameOfLeague;
	}

	public ArrayList<Teams> getNameOfTeams() {
		return nameOfTeams;
	}

	public void setNameOfTeams(ArrayList<Teams> nameOfTeams) {
		this.nameOfTeams = nameOfTeams;
	}

	public void recordWinsAndLosses(String winnerName, String loserName) {
		Teams winner = this.teamWithName(winnerName);
		Teams loser = this.teamWithName(loserName);
		

		loser.losses++;
		winner.wins++;
	}

	public void recordTies(Teams tie1, Teams tie2) {
		tie1.ties++;
		tie2.ties++;
	}
	
	public Teams teamWithName(String nameToLookFor){
		Teams teamCreated = null;
		
		for (Teams team : this.nameOfTeams){
			if(team.name.equals(nameToLookFor)){
				teamCreated = team;
			}
		}
				
		return teamCreated;
	}

	@Override
	public String toString() {
		return "League [nameOfLeague=" + nameOfLeague + ", nameOfTeams="
				+ nameOfTeams + "]";
	}

}