package lv.alina.module;

public class Teams {
	private String name;
	private int wins;
	private int losses;
	private int ties;
	
	public Teams(String teamName){
		this.name = teamName;
		this.wins = 0;
		this.losses = 0;
		this.ties = 0;
	}
	public int gamesPlayed(){
		return this.wins + this.ties+this.losses;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public int getTies() {
		return ties;
	}
	public void setTies(int ties) {
		this.ties = ties;
	}
	@Override
	public String toString() {
		return "Teams [name=" + name + ", wins=" + wins + ", losses=" + losses
				+ ", ties=" + ties + "]";
	}
	
	

}
