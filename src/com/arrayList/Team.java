package com.arrayList;

import java.util.ArrayList;

public class Team {

	public static void main(String[] args) {

		Player player1 = new Player("Kobe", 33);
		Player player2 = new Player("James H", 22);
		Player player3 = new Player("Damien", 21);
		Player player4 = new Player("Rando", 35);
		Player player5 = new Player("KD", 27);
		
		ArrayList<Player> list = new ArrayList<Player>();
		list.add(player1);
		list.add(player2);
		list.add(player3);
		list.add(player4);
		list.add(player5);
		//list.add(player3);//ArrayList allows duplicate value.Damien will print two times here

		System.out.println("size of list is: "+list.size());
		
		for(Player player: list) {
//			System.out.println(player.age);
//			System.out.println(player.name);
			if(player.age<=25) {
				System.out.println(player.name);
			}
		}
	}

}


class Player {
	String name;
	int age;
	
	public Player(String name, int age) {
		this.name=name;
		this.age=age;
	}
}