package lv.alina.test;

import java.util.ArrayList;

import lv.alina.module.League;
import lv.alina.module.Teams;

public class TestTeamAndLeague {

	public static void main(String[] args) {
		ArrayList<Teams> arrTeam = new ArrayList<>();

		Teams ska = new Teams("SKA");
		Teams cska = new Teams("CSKA");
		Teams dinamo = new Teams("Dinamo");
		Teams spartak = new Teams("SPARTAK");
		Teams torpedo = new Teams("Torpedo");
		Teams jokerit = new Teams("Jokerit");

		arrTeam.add(dinamo);
		arrTeam.add(ska);
		arrTeam.add(cska);
		arrTeam.add(spartak);
		arrTeam.add(torpedo);
		arrTeam.add(jokerit);
		League khl = new League("KHL");

		for (Teams t : arrTeam) {
			System.out.println(t.getName());
			System.out.println();

		}

		khl.setNameOfTeams(arrTeam);
		khl.recordWinsAndLosses("CSKA", "Dinamo");
		khl.recordWinsAndLosses("SKA", "Dinamo");
		khl.recordWinsAndLosses("Dinamo", "Jokerit");
		khl.recordWinsAndLosses("Dinamo", "SKA");
		khl.recordTies(dinamo, ska);
		khl.recordWinsAndLosses("Spartak","SKA");
		khl.recordTies(dinamo, torpedo);
		khl.recordWinsAndLosses("Torpedo", "Spartak");
		khl.recordTies(dinamo, jokerit);
		khl.recordWinsAndLosses("Torpedo", "CSKA");
		khl.recordTies(torpedo, ska);
		khl.recordWinsAndLosses("Dinamo", "SKA");
		khl.recordTies(ska, spartak);
		khl.recordWinsAndLosses("CSKA", "Jokerit");
		khl.recordTies(spartak, torpedo);

		System.out.println(khl.toString());
		System.out.println("Team SKA total points: " + ska.totalPoints());
		System.out.println("Team CSKA total points: " + cska.totalPoints());
		System.out.println("Team Dinamo total points: " + dinamo.totalPoints());
		System.out.println("Team SPARTAK total points: "
				+ spartak.totalPoints());
		System.out.println("Team Torpedo total points: "
				+ torpedo.totalPoints());
		System.out.println("Team Jokerit total points: "
				+ jokerit.totalPoints());

		System.out.println();

		System.out.println(khl.teamWithName("Dinamo"));
		System.out.println(khl.teamWithName("Riga"));
		System.out.println(khl.teamWithName("spartak"));
		System.out.println(khl.teamWithName("SPARTAK"));
	}

}
