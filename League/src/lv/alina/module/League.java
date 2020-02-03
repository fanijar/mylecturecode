package lv.alina.module;

import java.util.ArrayList;

public class League {
	private String nameOfLeague;
	private ArrayList<Teams> nameOfTeams;
	
	public League(String name){
		this.nameOfLeague = name;
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
	@Override
	public String toString() {
		return "League [nameOfLeague=" + nameOfLeague + ", nameOfTeams="
				+ nameOfTeams + "]";
	}
	
	
	
	

}
