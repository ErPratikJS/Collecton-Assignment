package com.twennty;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	/* Consider List of T20 Players.
	Player (playerid,Name,Country,team)
	e.g. (1,”MSDhoni”,”India”,”Chennai Super Kings”)
	Then find out which team has maximum Australian players.*/
	public static void main(String[] args) {
		
		ArrayList <Player> alP=new ArrayList();
		alP.add(new Player(1,"MSDhoni","India","Chennai Super Kings"));
		alP.add(new Player(2,"johnson","Australia","KXIP"));
		alP.add(new Player(3,"Moni","India","Chennai Super Kings"));
		alP.add(new Player(4,"maxwell","Australia","KXIP"));
		alP.add(new Player(5,"MSD","Australia","Chennai Super Kings"));
		alP.add(new Player(6,"Smith","Australia","PU"));
		alP.add(new Player(6,"Smith","Australia","PU"));
		alP.add(new Player(6,"Smith","Australia","PU"));
		String team ="";
		int cnt=0,cnt1=0;
		Iterator itr =alP.iterator();
		while(itr.hasNext()) {
			Player p =(Player) itr.next();
			String team1=p.team;
			Iterator itr1 =alP.iterator();
			cnt=0;
			
				while(itr1.hasNext()) {
					Player p1 =(Player) itr1.next();
					if(p1.team.equals(team1)) {
						if(p1.country.equals("Australia")) {
							cnt++;
						}
					}
				}
			if(cnt>cnt1)
			{
				team=team1;
				cnt1=cnt;
			}
		}
		System.out.println(team);
		
	}

}
