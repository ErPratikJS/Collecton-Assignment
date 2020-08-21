package com.twennty;

public class Player {

	int playerid;
	String name;
	String country;
	String team;
	public Player(int playerid, String name, String country, String team) {
		
		this.playerid = playerid;
		this.name = name;
		this.country = country;
		this.team = team;
	}
	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", name=" + name + ", country=" + country + ", team=" + team + "]";
	}
	
	
}
