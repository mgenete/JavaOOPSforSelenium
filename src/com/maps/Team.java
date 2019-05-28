package com.maps;

import java.util.HashMap;
import java.util.Map;

public class Team {

	public static void main(String[] args) {


		HashMap<Integer, Player> map = new HashMap<Integer, Player>();

		Player p1 = new Player("Kobe B", "Lakers", 35);
		Player p2 = new Player("Kevin D", "G State", 27);
		Player p3 = new Player("S Curry", "G State", 25);
		Player p4 = new Player("J Wall", "Wizards", 28);
		Player p5 = new Player("J Harden", "H Rockets", 30);
		
		map.put(1, p1);
		map.put(2, p2);
		map.put(3, p3);
		map.put(4, p4);
		map.put(5, p5);
		
		//1.
		for(Map.Entry<Integer, Player> m : map.entrySet()) {
			Integer playerKey = m.getKey();
			Player playerInfo = m.getValue();
			if(playerInfo.age > 30) {
				System.out.println(playerInfo.name);
			}
		}
		
		//2.
		for(Integer m1 : map.keySet()) {
			Player data = map.get(m1);
			if(data.age > 30) {
				System.out.println(data.name);
			}
		}
	}

}


class Player{
	String name;
	String club;
	int age;
	
	
	public Player(String name, String club, int age) {
		this.name=name;
		this.club=club;
		this.age=age;
	}
}